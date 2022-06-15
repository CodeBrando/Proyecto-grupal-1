package com.palermo.goblins.model.bo;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CharacterBO {

    private String name;
    private int hp;
    private int atk;
    private int def;
    private int spd;
    private int sexMeter;
}
