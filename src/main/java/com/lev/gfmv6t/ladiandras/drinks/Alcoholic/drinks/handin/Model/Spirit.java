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
public class Spirit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank(message = "A nevet nem lehet üresen hagyni")
    private String name;
    @DecimalMin(value = "15.0", message = "Az alkoholtartalom nem lehet kevesebb, mint {value}")
    @DecimalMax(value = "88.5", message = "Az alkoholtartalom nem lehet több, mint {value}")
    private double alcPercent;
    @Min(value = 0, message = "A raktáron nem lehet kevesebb áru, mint {value}")
    private int atStock;
}

