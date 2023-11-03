package com.example.adapters.out.client.planet.response;

import com.example.application.core.domain.planet.Planet;
import lombok.Data;

import java.util.List;

@Data
public class PeopleResponse {

    private String name;
    private Integer height;
    private Integer mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private String homeworld;
    private List<String> films;
    private List<String> species;
    private List<String> vehicles;
    private List<String> starships;
    private String created;
    private String edited;
    private String url;
    private Boolean isActivePeople;

    private Planet planet;

}
