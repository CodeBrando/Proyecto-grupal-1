package com.palermo.goblins.model.de;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "CHARACTER")
public class CharacterDE {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ATK")
    private int atk;

    @Column(name = "HP")
    private int hp;

    @Column(name = "DEF")
    private int def;

    @Column(name = "SPD")
    private int spd;

    @Column(name = "SEXMETER")
    private int sexMeter;
}
