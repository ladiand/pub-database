package com.lev.gfmv6t.ladiandras.drinks.Alcoholic.drinks.handin.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
@Table(name = "og")
@NoArgsConstructor
@AllArgsConstructor
public class Origin {

    @Id
    @Min(0)
    private int id;
    @NotBlank
    private String name;
    @OneToMany(mappedBy = "origin")
    private List<Wine> winesList;
}
