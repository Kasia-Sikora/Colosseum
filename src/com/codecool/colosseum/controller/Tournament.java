package com.codecool.colosseum.controller;

import com.codecool.colosseum.model.gladiators.Gladiator;

class Tournament {


    private Gladiator Gladiator1;
    private Gladiator Gladiator2;

    private Tournament LeftBranch;
    private Tournament RightBranch;

    private Combat combat = new Combat();

    private boolean _goRight;

    Tournament(Gladiator gladiator1, Gladiator gladiator2) {
        Gladiator1 = gladiator1;
        Gladiator2 = gladiator2;
    }

    void add(Gladiator gladiator, Gladiator gladiator1) {
        if (LeftBranch == null || RightBranch == null) {
            LeftBranch = new Tournament(Gladiator1, Gladiator2);
            RightBranch = new Tournament(gladiator, gladiator1);

            Gladiator1 = null;
            Gladiator2 = null;
        } else {
            if (_goRight) {
                RightBranch.add(gladiator, gladiator1);
            } else {
                LeftBranch.add(gladiator, gladiator1);
            }
            _goRight = !_goRight;
        }
    }

    Gladiator fight() {
        if (LeftBranch != null && RightBranch != null) {
            Gladiator1 = LeftBranch.fight();
            Gladiator2 = RightBranch.fight();

            LeftBranch = null;
            RightBranch = null;
        }

        return combat.startCombat(Gladiator1, Gladiator2);
    }
}
