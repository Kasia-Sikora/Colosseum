package com.codecool.colosseum.view;

import com.codecool.colosseum.model.gladiators.Gladiator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewData {

    public int getUserInput() {
        final int INVALID_INPUT = -1;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number of stages: ");
            return input.nextInt();

        } catch (InputMismatchException error) {
            System.out.println("Invalid input, try again");
            return INVALID_INPUT;
        }

    }

    public void combatMessage(Gladiator firstGladiator, Gladiator secondGladiator, float damage) {
        System.out.println(firstGladiator.getName() + " attacks " + secondGladiator.getName() + "with damage power " + damage);
    }

    public void healthInfo(Gladiator gladiator) {
        System.out.println(gladiator.getName() + " has " + gladiator.getHP() + " health.");
    }

    public void deadGladiatorMessage(Gladiator gladiator) {
        System.out.println(gladiator.getName() + " is dead.");
    }

    public void displayMessage(String text) {
        System.out.println(text);
    }
}
