package com.palermo.goblins.model.bo;

import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = false)
@SuperBuilder
@Data
public class GoblinBO extends CharacterBO{


    private String rank;
    private String element;

    private int getSeed() {
        return super.getSexMeter();
    }
    public void rape() {
        System.out.println("Yiiii Yiii qué rico culitooooo");
    }
}
