package com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Wine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank(message = "A név nem lehet üres")
    private String name;
    @DecimalMin(value = "4.5", message = "Az alkoholtartalom nem lehet kevesebb, mint {value}")
    @DecimalMax(value = "18.5", message = "Az alkoholtartalom nem lehet több, mint {value}")
    private double alcPercent;
    @Min(0)
    private int atStock;
    @ManyToOne(fetch = FetchType.LAZY)
    //végtelen lista ellen:
    @JsonIgnoreProperties(value = {"winesList", "handler","hibernateLazyInitializer"}, allowSetters = true)
    @JoinColumn(name = "origin_id")
    private Origin origin;

}
