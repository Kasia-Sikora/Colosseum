package com.codecool.colosseum.controller;

import com.codecool.colosseum.view.viewData;
import com.codecool.colosseum.model.gladiators.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Tournament {

    private viewData view = new viewData();

    void generateGladiators() {

        int numberOfGladiators = view.getAndValidateUserInput();
        List<GladiatorType> listOfGladiatorsType = Arrays.asList(GladiatorType.values());
        List<Gladiator> listOfGladiators = new ArrayList<>();
        Random random = new Random();

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
}
