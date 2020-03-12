package com.codecool.colosseum.model.gladiators;

public class Swordsman extends Gladiator {

    private static String[] listOfNames = {"Canus Didius Calacicus", "Vopiscus Camillius Nero", "Camillus Murrius Caecina",
            "Faustus Vergilius Remus", "Augustus Faenius Aemilianus", "Decius Lafrenius Lupicinus",
            "Kaeso Caninius Olympicus", "Publius Vibidius Pudentius", "Appius Lafrenius Rex", "Numerius Maelius Scipio"};

    public Swordsman(){
        super();
    }

//    public Swordsman(String name,  int baseHP, int baseSP, int baseDEX, int lvl) {
//        super(name, baseHP, baseSP, baseDEX, lvl);
//    }

    @Override
    public String setName() {
        return listOfNames[random.nextInt(listOfNames.length)];
    }

    @Override
    int setHP() {
        return BASE_HP_PARAM * MEDIUM;
    }

    @Override
    int setSP() {
        return BASE_SP_PARAM * MEDIUM;
    }

    @Override
    int setDEX() {
        return BASE_DEX_PARAM * MEDIUM;
    }

    @Override
    public void attack() {
        System.out.println("Sword Attack");
    }

    @Override
    public void defend() {
        System.out.println("Swordsman Defend");
    }
}