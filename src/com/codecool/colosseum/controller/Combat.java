package com.codecool.colosseum.controller;

import com.codecool.colosseum.model.gladiators.Gladiator;
import com.codecool.colosseum.view.ViewData;

import java.util.Random;

class Combat {

    private ViewData view = new ViewData();
    private Random random = new Random();
    private final int EXTRA_LVL = 1;

    Gladiator startCombat(Gladiator gladiator1, Gladiator gladiator2) {

        while (gladiator1.isAlive() && gladiator2.isAlive()) {

            boolean isFirstGladiatorAttacking = isAttacking(gladiator1, gladiator2);
            boolean isSecondGladiatorAttacking = isAttacking(gladiator2, gladiator1);

            if (isFirstGladiatorAttacking) {
                attack(gladiator1, gladiator2);
                if (!gladiator2.isAlive()) {
                    gladiator1.setBaseLVL(EXTRA_LVL);
                    return gladiator1;
                }
            } else if (isSecondGladiatorAttacking) {
                attack(gladiator2, gladiator1);
                if (!gladiator1.isAlive()) {
                    gladiator2.setBaseLVL(EXTRA_LVL);
                    return gladiator2;
                }
            }
        }
        return null;
    }

    private void attack(Gladiator firstGladiator, Gladiator secondGladiator) {

        int MIN_DAMAGE = 1;
        int MAX_DAMAGE = 5;
        float damage = ((random.nextInt(MAX_DAMAGE) + MIN_DAMAGE) / 10.0f) * firstGladiator.getSP();
        view.combatMessage(firstGladiator, secondGladiator, damage);
        secondGladiator.getDamage(damage);

        if (secondGladiator.isAlive()) {
            view.healthInfo(secondGladiator);
        } else {
            view.deadGladiatorMessage(secondGladiator);
        }
    }

    private boolean isAttacking(Gladiator firstGladiator, Gladiator secondGladiator) {

        int firstGladiatorUnclampedChance = getUnclampedChance(firstGladiator, secondGladiator);
        int gladiatorChanceToAttack = Math.max(10, Math.min(firstGladiatorUnclampedChance, 100));

        return (random.nextInt(100) + 1) < gladiatorChanceToAttack;
    }

    private int getUnclampedChance(Gladiator gladiator1, Gladiator gladiator2) {
        return Math.max(gladiator1.getDEX() - gladiator2.getDEX(), 0);
    }
}
