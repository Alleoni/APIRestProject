package br.com.grupoFinal.entities;

import lombok.Data;

@Data
public class Beer {

    private Long id;
    private String name;
    private String description;
    private Long abv;
    private Long ibu;
}
