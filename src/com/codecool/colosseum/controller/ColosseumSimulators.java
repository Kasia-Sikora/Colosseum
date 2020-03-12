package com.codecool.colosseum.controller;

import com.codecool.colosseum.model.gladiators.Gladiator;

public class ColosseumSimulators {

    public static void main(String[] args) {

        Tournament tournament = new Tournament();
        tournament.generateGladiators();
        tournament.startCombat();
    }
}
