package com.codecool.colosseum.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewData {

    private int getUserInput() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number of stages: ");
            return input.nextInt();

        } catch (InputMismatchException error) {
            System.out.println("Invalid input, try again");
            return -1;
        }

    }

    public int getAndValidateUserInput() {

        int numberOfGladiators;
        do {
            numberOfGladiators = getUserInput();
            if (numberOfGladiators == 0) {
                System.out.println("No one want's to fight today? ;)");
            }
        } while (numberOfGladiators < 1);
        return numberOfGladiators;
    }
}
