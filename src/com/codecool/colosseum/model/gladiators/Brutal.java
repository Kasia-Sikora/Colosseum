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
    protected String getName() {
        return listOfNames[random.nextInt(listOfNames.length)] + ", the Brutal";
    }

    @Override
    int getHP() {
        return (int) (BASE_HP_PARAM * HIGH);
    }

    @Override
    int getSP() {
        return (int) (BASE_SP_PARAM * HIGH);
    }

    @Override
    int getDEX() {
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

