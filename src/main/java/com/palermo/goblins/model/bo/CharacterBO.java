package com.palermo.goblins.model.bo;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class CharacterBO {

    private String name;
    private int hp;
    private int atk;
    private int def;
    private int spd;
    private int sexMeter;

    protected int getSexMeter(){
       return sexMeter;
    }

}
