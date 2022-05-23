package com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Service;

import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Exception.SpiritNotFoundException;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Model.Spirit;

import java.util.List;
import java.util.Optional;

public interface SpiritService {
    public void saveSpirit(Spirit spirit);
    public Spirit updateSpirit(Spirit spirit) throws SpiritNotFoundException;
    public void deleteWine(int id) throws SpiritNotFoundException;
    public List<Spirit> getAllSpirit();
    public boolean idInUse(int id);
    public Optional<Spirit> getSpiritById(int id) throws SpiritNotFoundException;
}
