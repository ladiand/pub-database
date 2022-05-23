package com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank
    private String name;
    @DecimalMin(value = "0", message = "Alkoholtartalom nem lehet kevesebb, mint 0")
    @DecimalMax(value = "14", message = "Alkoholtartalom nem lehet nagyobb, mint 14")
    private double alcPercent;
    @Min(value = 0, message = "Nem lehet kevesebb, mint 0")
    private int atStock;

}
