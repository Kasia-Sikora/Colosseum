package com.codecool.colosseum.model.gladiators;

public class Brutal extends Gladiator {

    private static String[] listOfNames = {"Canus Didius Calacicus", "Vopiscus Camillius Nero", "Camillus Murrius Caecina",
            "Faustus Vergilius Remus", "Augustus Faenius Aemilianus", "Decius Lafrenius Lupicinus",
            "Kaeso Caninius Olympicus", "Publius Vibidius Pudentius", "Appius Lafrenius Rex", "Numerius Maelius Scipio"};


    public Brutal(){
        super();
    }

//    public Brutal(String name,  int baseHP, int baseSP, int baseDEX, int lvl) {
//        super(name, baseHP, baseSP, baseDEX, lvl);
//    }

    @Override
    public String setName() {
        return listOfNames[random.nextInt(listOfNames.length)];
    }

    @Override
    int setHP() {
        return (int) (BASE_HP_PARAM * HIGH);
    }

    @Override
    int setSP() {
        return (int) (BASE_SP_PARAM * HIGH);
    }

    @Override
    int setDEX() {
        return (int) (BASE_DEX_PARAM * LOW);
    }


    @Override
    public void attack() {
        System.out.println("Fist Attack");
    }

    @Override
    public void defend() {
        System.out.println("Brutal Defend");
    }
}

