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
    public String setName() {
        return listOfNames[random.nextInt(listOfNames.length)];
    }

    @Override
    int setHP() {
        return (int) (BASE_HP_PARAM * LOW);
    }

    @Override
    int setSP() {
        return (int) (BASE_SP_PARAM * HIGH);
    }

    @Override
    int setDEX() {
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
