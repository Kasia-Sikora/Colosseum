package com.codecool.colosseum.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class viewData {

    private int getUserInput(String inputInfo) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println(inputInfo);
            return input.nextInt();

        } catch (InputMismatchException error) {
            System.out.println("Invalid input");
            return -1;
        }

    }

    public int getAndValidateUserInput() {

        int numberOfGladiators;
        do {
            numberOfGladiators = getUserInput("Enter number of row: ");
            if (numberOfGladiators == 0) {
                System.out.println("No one want's to fight today? ;)");
            } else {
                return numberOfGladiators;
            }
        } while (numberOfGladiators < 1);
        return -1;
    }
}
