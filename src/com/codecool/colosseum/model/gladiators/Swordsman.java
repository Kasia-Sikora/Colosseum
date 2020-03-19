package com.codecool.colosseum.model.gladiators;

public class Swordsman extends Gladiator {

    private static String[] listOfNames = {"Canus Didius Calacicus", "Vopiscus Camillius Nero", "Camillus Murrius Caecina",
            "Faustus Vergilius Remus", "Augustus Faenius Aemilianus", "Decius Lafrenius Lupicinus",
            "Kaeso Caninius Olympicus", "Publius Vibidius Pudentius", "Appius Lafrenius Rex", "Numerius Maelius Scipio"};

    public Swordsman(){
        super();
    }

    @Override
    public String setName() {
        return listOfNames[random.nextInt(listOfNames.length)];
    }

    @Override
    float getBaseHP() {
        return BASE_HP_PARAM * MEDIUM;
    }

    @Override
    float setBaseSP() {
        return BASE_SP_PARAM * MEDIUM;
    }

    @Override
    int setBaseDEX() {
        return BASE_DEX_PARAM * MEDIUM;
    }
}