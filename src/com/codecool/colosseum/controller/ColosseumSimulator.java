package com.codecool.colosseum.controller;

public class ColosseumSimulator {

    public static void main(String[] args) {

        Colosseum colosseum = new Colosseum();
        colosseum.generateGladiators();
        colosseum.startTournament();
    }
}
