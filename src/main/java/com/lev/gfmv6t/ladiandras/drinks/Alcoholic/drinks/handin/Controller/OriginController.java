package com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Controller;

import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Exception.OriginNotFoundException;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Model.Origin;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Service.OriginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OriginController {

    @Autowired
    private OriginServiceImpl originServiceImpl;

    @PostMapping("saveWineOrigin")
    public String addNewWineOrigin (@RequestBody Origin wineOrigin){
        originServiceImpl.saveWineOrigin(wineOrigin);
        return "siker";
    }

    @PutMapping("updateWineOrigin")
    public String updateWineOrigin(@RequestBody Origin wineOrigin) throws OriginNotFoundException {
        originServiceImpl.updateWineOrigin(wineOrigin);
        return "siker";
    }

    @DeleteMapping("deleteWineOrigin")
    public String deleteWineOrigin(@RequestParam int id) throws OriginNotFoundException {
        originServiceImpl.deleteWineOrigin(id);
        return "siker";
    }

    @GetMapping("getAllWineOrigin")
    public List<Origin> getAllWineOrigin(){
        return originServiceImpl.getAllWineOrigin();
    }

    /* Kivettem, mert nem írtam hozzá kivételkezelést
    @PutMapping("getWineOriginById")
    public Origin getWineOriginById(int id){
        return originServiceImpl.getWineOriginById(id);
    }*/

}
