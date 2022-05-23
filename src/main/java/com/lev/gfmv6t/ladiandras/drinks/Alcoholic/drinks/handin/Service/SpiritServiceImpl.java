package com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Service;

import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Exception.SpiritNotFoundException;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Model.Spirit;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Repos.SpiritRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpiritServiceImpl implements SpiritService{

    @Autowired
    public SpiritRepository spiritRepository;

    @Override
    public void saveSpirit(Spirit spirit) {
        spiritRepository.save(spirit);
    }

    @Override
    public Spirit updateSpirit(Spirit spirit) throws SpiritNotFoundException {
        if (!spiritRepository.existsById(spirit.getId())){
            throw new SpiritNotFoundException("Nincs ilyen rövidital");
        }
        return spiritRepository.save(spirit);
    }

    @Override
    public void deleteWine(int id) throws SpiritNotFoundException {
        if (!spiritRepository.existsById(id)){
            throw new SpiritNotFoundException("Nincs ilyen rövidital");
        }
        spiritRepository.deleteById(id);
    }

    @Override
    public List<Spirit> getAllSpirit() {
        return (List<Spirit>) spiritRepository.findAll();
    }

    @Override
    public boolean idInUse(int id) {
        return spiritRepository.existsById(id);
    }

    @Override
    public Optional<Spirit> getSpiritById(int id) throws SpiritNotFoundException {
        if (!spiritRepository.existsById(id)){
            throw new SpiritNotFoundException("Nincs ilyen rövidital");
        }
        return spiritRepository.findById(id);
    }
}
