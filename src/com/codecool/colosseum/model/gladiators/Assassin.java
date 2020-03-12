package com.codecool.colosseum.model.gladiators;

public class Assassin extends Gladiator {

    private static String[] listOfNames = {"Mettius Accius Ingenuus", "Sextus Sulpicius Bulla", "Numerius Maximius Mellitus",
            "Servius Laberius Renatus", "Galerius Granius Novellius", "Gallio Cantius Hiberus",
            "Decimus Aebutius Severus", "Caius Cantilius Micianus", "Nonus Silius Martial", "Aulus Ateius Salvian"};


    public Assassin(){
        super();
    }


//    public Assassin(String name, int baseHP, int baseSP, int baseDEX, int lvl) {
//        super( name, baseHP, baseSP, baseDEX, lvl);
//    }

    @Override
    protected String getName() {
        return listOfNames[random.nextInt(listOfNames.length)] + ", the Assassin";
    }

    @Override
    int getHP() {
        return (int) (BASE_HP_PARAM * LOW);
    }

    @Override
    int getSP() {
        return (int) (BASE_SP_PARAM * HIGH);
    }

    @Override
    int getDEX() {
        return (int) (BASE_DEX_PARAM * HIGH);
    }


    @Override
    public void attack() {
        System.out.println("Dagger Attack");
    }

    @Override
    public void defend() {
        System.out.println("Assasin Defend");
    }
}
