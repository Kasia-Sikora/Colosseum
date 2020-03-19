package com.codecool.colosseum.controller;

import com.codecool.colosseum.model.gladiators.*;
import com.codecool.colosseum.view.ViewData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Colosseum {

    private final int PAIR_OF_GLADIATORS = 2;
    private ViewData view = new ViewData();
    private Random random = new Random();

    private List<GladiatorType> listOfGladiatorsType = Arrays.asList(GladiatorType.values());
    private List<Gladiator> listOfGladiators = new ArrayList<>();

    void generateGladiators() {

        int stages = getAndValidateUserInput();
        int numberOfGladiators = (int) Math.pow(2, stages);

        view.displayMessage("Gladiators for today's tournament are:");

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

    private int getAndValidateUserInput() {

        int numberOfGladiators;
        do {
            numberOfGladiators = view.getUserInput();
            if (numberOfGladiators == 0) {
                view.displayMessage("No one want's to fight today?");
            }
        } while (numberOfGladiators < 1);
        return numberOfGladiators;
    }

    void startTournament() {
        Tournament root = new Tournament(listOfGladiators.get(0), listOfGladiators.get(1));
        for (int i = PAIR_OF_GLADIATORS; i < listOfGladiators.size(); i += PAIR_OF_GLADIATORS) {
            root.add(listOfGladiators.get(i), listOfGladiators.get(i + 1));
        }
        Gladiator winner = root.fight();
        view.displayMessage("The winner is: " + winner.getName() + " the " + winner.getClass().getSimpleName());
    }
}

