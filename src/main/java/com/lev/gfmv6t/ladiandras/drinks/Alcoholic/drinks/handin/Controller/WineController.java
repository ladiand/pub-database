package com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Controller;

import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Exception.WineNotFoundException;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Model.Wine;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Persist.WineDTO;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Service.WineServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class WineController {

    @Autowired
    private WineServiceImpl wineServiceImpl;

    @PostMapping(value = "saveWine")
    public String addNewWine (@RequestBody WineDTO wineDTO){
        wineServiceImpl.saveWine(wineDTO);
        return "siker";
    }

    @PutMapping(value = "updateWine")
    public String updateWine(@RequestBody WineDTO wineDTO, BindingResult bindingResult) throws WineNotFoundException {
        wineServiceImpl.updateWine(wineDTO);
        return "siker";
    }

    @DeleteMapping(value = "deleteWine")
    public String deleteWine(@RequestParam int id) throws WineNotFoundException {
        wineServiceImpl.deleteWine(id);
        return "siker";
    }

    @GetMapping(value = "getAllWine")
    public List<WineDTO> getAllWine(){
        return wineServiceImpl.getAllWine();
    }

    @PutMapping(value = "getWineById")
    public Wine getWineById(int id){
        return wineServiceImpl.getWineById(id);
    }
}
