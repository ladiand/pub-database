package com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Service;

import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Exception.BeerNotFoundException;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Model.Beer;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Repos.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerServiceImpl implements BeerService{
    @Autowired
    private BeerRepository beerRepository;

    @Override
    public void saveBeer(Beer beer) {
        beerRepository.save(beer);
    }

    @Override
    public Beer updateBeer(Beer beer) throws BeerNotFoundException {
        if (!beerRepository.existsById(beer.getId())){
            throw new BeerNotFoundException("Nincs ilyen sör");
        }
        return beerRepository.save(beer);
    }

    @Override
    public void deleteBeer(int id) throws BeerNotFoundException {
        if(!beerRepository.existsById(id)){
            throw new BeerNotFoundException("Nincs ilyen sör");
        }
        beerRepository.deleteById(id);
    }

    @Override
    public List<Beer> getAllBeer() {
        return (List<Beer>) beerRepository.findAll();
    }

}
