package com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Service;

import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Exception.OriginNotFoundException;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Model.Origin;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Repos.OriginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OriginServiceImpl implements OriginService{

    @Autowired
    private OriginRepository originRepository;

    @Override
    public String saveWineOrigin(Origin origin) {
        originRepository.save(origin);
        return "Siker";
    }

    @Override
    public Origin updateWineOrigin(Origin origin) throws OriginNotFoundException {
        if (!originRepository.existsById(origin.getId())){
            throw new OriginNotFoundException("Nincs ilyen borvidék");
        }
        return originRepository.save(origin);
    }

    @Override
    public String deleteWineOrigin(int id) throws OriginNotFoundException {
        if (!originRepository.existsById(id)){
            throw new OriginNotFoundException("Nincs ilyen borvidék");
        }
        originRepository.deleteById(id);
        return "Siker";
    }

    @Override
    public List<Origin> getAllWineOrigin() {
        return (List<Origin>) originRepository.findAll();
    }


    @Override
    public Origin getWineOriginById(int id) {
        return originRepository.findById(id).get();
    }
}
