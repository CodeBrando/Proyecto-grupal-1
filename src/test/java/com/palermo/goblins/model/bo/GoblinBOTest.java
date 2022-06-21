package com.palermo.goblins.model.bo;

import com.palermo.goblins.utils.CharacterTestUtil;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoblinBOTest {

    @Test
    public void getSeedTest(){
        GoblinBO goblin = CharacterTestUtil.getGoblinBO();
        assertEquals(10, goblin.getSeed());
    }
}
