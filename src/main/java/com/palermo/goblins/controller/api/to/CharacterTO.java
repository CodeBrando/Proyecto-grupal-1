package com.palermo.goblins.controller.api.to;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class CharacterTO {
    private String name;
    private int hp;
    private int atk;
    private int def;
    private int spd;
    private int sexMeter;
}
