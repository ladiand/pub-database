package com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Service;

import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Exception.WineNotFoundException;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Model.Wine;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Persist.WineDTO;

import java.util.List;

public interface WineService {
    public String saveWine(WineDTO wineDTO);
    public String updateWine(WineDTO wineDTO) throws WineNotFoundException;
    public String deleteWine(int id) throws WineNotFoundException;
    public List<WineDTO> getAllWine();
    public Wine getWineById(int id) throws WineNotFoundException;
}
