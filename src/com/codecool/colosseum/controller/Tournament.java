package com.codecool.colosseum.controller;

import com.codecool.colosseum.model.gladiators.*;
import com.codecool.colosseum.view.ViewData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Tournament {

    private ViewData view = new ViewData();
    private Combat combat = new Combat();
    private Random random = new Random();

    private List<GladiatorType> listOfGladiatorsType = Arrays.asList(GladiatorType.values());
    private List<Gladiator> listOfGladiators = new ArrayList<>();

    private int numberOfGladiators;
    private int numbersOfFights;

    void generateGladiators() {

        numberOfGladiators = (int) Math.pow(view.getAndValidateUserInput(), 2);
        numbersOfFights = numberOfGladiators - 1;

        for (int i = 0; i < numberOfGladiators; i++) {
            GladiatorType type = listOfGladiatorsType.get(random.nextInt(listOfGladiatorsType.size()));

            switch (type) {
                case ARCHER:
                    listOfGladiators.add(new Archer());
                    break;
                case BRUTAL:
                    listOfGladiators.add(new Brutal());
                    break;
                case ASSASSIN:
                    listOfGladiators.add(new Assassin());
                    break;
                case SWORDSMAN:
                    listOfGladiators.add(new Swordsman());
                    break;
            }
        }

    }

    void startCombat() {

        System.out.println(listOfGladiators.size());
        System.out.println(numbersOfFights);
        Gladiator winner;

        for (int i = 0; i < numbersOfFights;) {
            for (int j = 0; j < listOfGladiators.size(); j++) {
                if (listOfGladiators.size() == 2) {
                    j = 0;
                    winner = combat.fight(listOfGladiators.get(j), listOfGladiators.get(j + 1));
                }
                winner = combat.fight(listOfGladiators.get(j), listOfGladiators.get(j + 1));
                if (listOfGladiators.get(j) == winner) {
                    listOfGladiators.remove(listOfGladiators.get(j + 1));
                } else {
                    listOfGladiators.remove(winner);
                }
                i++;
            }
        }
    }
}
