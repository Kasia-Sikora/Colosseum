package com.codecool.colosseum.controller;

import com.codecool.colosseum.model.gladiators.Gladiator;

class Combat {

    Gladiator fight(Gladiator gladiator1, Gladiator gladiator2) {

        System.out.println(gladiator1.getClass().getSimpleName() + " " + gladiator1.getName() + " fights with " + gladiator2.getClass().getSimpleName() + " " + gladiator2.getName());
        return gladiator1;
    }
}
