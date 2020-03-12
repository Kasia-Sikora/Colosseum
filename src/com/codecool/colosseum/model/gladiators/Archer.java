package com.codecool.colosseum.model.gladiators;

public class Archer extends Gladiator {


    private static String[] listOfNames = {"Mettius Accius Ingenuus", "Sextus Sulpicius Bulla", "Numerius Maximius Mellitus",
            "Servius Laberius Renatus", "Galerius Granius Novellius", "Gallio Cantius Hiberus",
            "Decimus Aebutius Severus", "Caius Cantilius Micianus", "Nonus Silius Martial", "Aulus Ateius Salvian"};

    public Archer(){
        super();
    }
//
//    public Archer(String name,  int baseHP, int baseSP, int baseDEX, int lvl) {
//        super(name, baseHP, baseSP, baseDEX, lvl);
//    }


    @Override
    protected String getName() {
        return listOfNames[random.nextInt(listOfNames.length)] + ", the Archer";
    }

    @Override
    int getHP() {
        return BASE_HP_PARAM * MEDIUM ;
    }

    @Override
    int getSP() {
        return BASE_SP_PARAM * MEDIUM;
    }

    @Override
    int getDEX() {
        return (int) (BASE_DEX_PARAM * HIGH);
    }


    @Override
    public void attack() {
        System.out.println("Arrow Attack");
    }

    @Override
    public void defend() {
        System.out.println("Archer Defend");
    }

}
