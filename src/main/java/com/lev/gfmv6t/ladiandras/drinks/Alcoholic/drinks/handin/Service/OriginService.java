package com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Service;

import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Exception.OriginNotFoundException;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Model.Origin;

import java.util.List;

public interface OriginService {
    public String saveWineOrigin(Origin origin);
    public Origin updateWineOrigin(Origin origin) throws OriginNotFoundException;
    public String deleteWineOrigin(int id) throws OriginNotFoundException;
    public List<Origin> getAllWineOrigin();
    public Origin getWineOriginById (int id);
}
