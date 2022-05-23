package com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Service;

import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Exception.BeerNotFoundException;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Model.Beer;

import java.util.List;

public interface BeerService {
    public void saveBeer(Beer beer);
    public Beer updateBeer(Beer beer) throws BeerNotFoundException;
    public void deleteBeer(int id) throws BeerNotFoundException;
    public List<Beer> getAllBeer();
}
