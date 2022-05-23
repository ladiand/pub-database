package com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Controller;

import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Exception.SpiritNotFoundException;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Model.Spirit;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Service.SpiritServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SpiritController {

    @Autowired
    private SpiritServiceImpl spiritServiceImpl;

    @PostMapping(value = "saveSpirit")
    public String addNewSpirit (@RequestBody Spirit spirit){
        spiritServiceImpl.saveSpirit(spirit);
        return "Siker";
    }

    @PutMapping(value = "updateSpirit")
    public String updateSpirit(@RequestBody Spirit spirit) throws SpiritNotFoundException {
        if (!spiritServiceImpl.idInUse(spirit.getId())){
            throw new SpiritNotFoundException("Nincs ilyen rövidital");
        }
        spiritServiceImpl.updateSpirit(spirit);
        return "siker";
    }

    @DeleteMapping(value = "deleteSpirit")
    public String deleteSpring(@RequestParam int id) throws SpiritNotFoundException{
        if (!spiritServiceImpl.idInUse(id)){
            throw new SpiritNotFoundException("Nincs ilyen rövidital");
        }
        spiritServiceImpl.deleteWine(id);
        return "siker";
    }

    @GetMapping(value = "getAllSpirit")
    public List<Spirit> getAllSpirit(){
        return spiritServiceImpl.getAllSpirit();
    }

    @PutMapping(value = "getSpiritById")
    public Optional<Spirit> getSpiritById(int id) throws SpiritNotFoundException{
        return spiritServiceImpl.getSpiritById(id);
    }
}
