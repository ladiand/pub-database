package com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Service;

import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Exception.WineNotFoundException;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Model.Wine;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Persist.WineDTO;
import com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Repos.WineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class WineServiceImpl implements WineService{

    public WineServiceImpl (WineRepository wineRepository, OriginServiceImpl originServiceImpl){
        this.wineRepository = wineRepository;
        this.originServiceImpl = originServiceImpl;
    }

    @Autowired
    public WineRepository wineRepository;
    public OriginServiceImpl originServiceImpl;

    @Override
    public String saveWine(WineDTO wineDTO) {
            Wine wine = new Wine();
            wine.setId(wineDTO.getId());
            wine.setName(wineDTO.getName());
            wine.setAlcPercent(wineDTO.getAlcPercent());
            wine.setAtStock(wineDTO.getAtStock());
            wine.setOrigin(
                    originServiceImpl.getWineOriginById(wineDTO.getOriginId()));
            wineRepository.save(wine);
        return "Siker";
    }

    @Override
    public String updateWine(WineDTO wineDTO) throws WineNotFoundException {
        if(!wineRepository.existsById(wineDTO.getId())){
            throw new WineNotFoundException("Nincs ilyen bor");
        }
        Wine wine = new Wine();
        wine.setId(wineDTO.getId());
        wine.setName(wineDTO.getName());
        wine.setAlcPercent(wineDTO.getAlcPercent());
        wine.setAtStock(wineDTO.getAtStock());
        wine.setOrigin(
                originServiceImpl.getWineOriginById(wineDTO.getOriginId()));
        wineRepository.save(wine);
        return "Siker";
    }

    @Override
    public String deleteWine(int id) throws WineNotFoundException{
        if (!wineRepository.existsById(id)){
            throw new WineNotFoundException("Nincs ilyen bor");
        }
        wineRepository.deleteById(id);
        return "Siker";
    }

    @Override
    public List<WineDTO> getAllWine() {
        List<WineDTO> wineDTOList = new ArrayList<>();
        for (Wine wine : wineRepository.findAll()) {
            wineDTOList.add(
                    new WineDTO(
                            wine.getId(),
                            wine.getName(),
                            wine.getAlcPercent(),
                            wine.getAtStock(),
                            wine.getOrigin().getId())
            );
        }
        return wineDTOList;
    }


    @Override
    public Wine getWineById(int id) {
        if(wineRepository.existsById(id)){
        return wineRepository.findById(id).get();}
        return null;
    }
}
