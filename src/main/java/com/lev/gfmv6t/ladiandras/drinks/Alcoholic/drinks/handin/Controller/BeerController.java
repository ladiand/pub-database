package com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Controller;

import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Exception.BeerNotFoundException;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Model.Beer;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Service.BeerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BeerController {

    @Autowired
    private BeerServiceImpl beerServiceImpl;

    @PostMapping(value = "saveBeer")
    public String addNewBeer (@RequestBody Beer beer){
        beerServiceImpl.saveBeer(beer);
        return "Siker";
    }

    @PutMapping(value = "updateBeer")
    public String updateBeer(@RequestBody Beer beer) throws BeerNotFoundException {
        beerServiceImpl.updateBeer(beer);
        return "siker";
    }
    @DeleteMapping(value = "deleteBeer")
    public String deleteBeer(@RequestParam Integer id) throws BeerNotFoundException {
        beerServiceImpl.deleteBeer(id);
        return "Siker";
    }

    @GetMapping(value = "getAllBeer")
    public List<Beer> getAllBeer(){
        return beerServiceImpl.getAllBeer();
    }


}
