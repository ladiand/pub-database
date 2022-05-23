package com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Persist;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class WineDTO {
    @Min(0)
    private int id;
    @NotBlank
    private String name;
    private double alcPercent;
    @Min(0)
    private Integer atStock;
    @Min(0)
    private int originId;
}
