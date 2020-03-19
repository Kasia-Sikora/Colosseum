package com.codecool.colosseum.model.gladiators;

public class Brutal extends Gladiator {

    private static String[] listOfNames = {"Canus Didius Calacicus", "Vopiscus Camillius Nero", "Camillus Murrius Caecina",
            "Faustus Vergilius Remus", "Augustus Faenius Aemilianus", "Decius Lafrenius Lupicinus",
            "Kaeso Caninius Olympicus", "Publius Vibidius Pudentius", "Appius Lafrenius Rex", "Numerius Maelius Scipio"};


    public Brutal() { super(); }

    @Override
    public String setName() {
        return listOfNames[random.nextInt(listOfNames.length)];
    }

    @Override
    float getBaseHP() {
        return (float) (BASE_HP_PARAM * HIGH);
    }

    @Override
    float setBaseSP() {
        return (float) (BASE_SP_PARAM * HIGH);
    }

    @Override
    int setBaseDEX() {
        return (int) (BASE_DEX_PARAM * LOW);
    }

}

