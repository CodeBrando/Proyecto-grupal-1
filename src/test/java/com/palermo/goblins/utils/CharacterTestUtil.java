package com.palermo.goblins.utils;

import com.palermo.goblins.commons.enums.ElementEnum;
import com.palermo.goblins.model.bo.GoblinBO;

public class CharacterTestUtil {

    public static GoblinBO getGoblinBO(){
        return GoblinBO.builder()
                .name("Goblin")
                .atk(1)
                .def(2)
                .spd(1)
                .hp(10)
                .rank("soldier")
                .seed(10)
                .element(ElementEnum.EARTH)
                .build();
    }
}
