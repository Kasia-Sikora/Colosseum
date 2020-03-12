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
    private int numbersOfInitialFights;

    void generateGladiators() {

        int stages = view.getAndValidateUserInput();
        numberOfGladiators = (int) Math.pow(stages, 2);
        numbersOfFights = numberOfGladiators - 1;
        numbersOfInitialFights = (int) Math.pow(stages -1, 2);

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

        for (int i = 0; i < numbersOfFights; ) {
            for (int j = 0; j < numbersOfInitialFights; j++) {
                for (int k = 0; k < listOfGladiators.size(); k++) {
                    if (listOfGladiators.size() == 2) {
                        k = 0;
                        winner = combat.fight(listOfGladiators.get(k), listOfGladiators.get(k + 1));
                    }
                    winner = combat.fight(listOfGladiators.get(k), listOfGladiators.get(k + 1));
                    if (listOfGladiators.get(k) == winner) {
                        listOfGladiators.remove(listOfGladiators.get(k + 1));
                    } else {
                        listOfGladiators.remove(winner);
                    }
                }
                i++;
            }
        }
    }
}
