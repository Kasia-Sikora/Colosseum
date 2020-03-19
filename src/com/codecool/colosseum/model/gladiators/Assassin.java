package com.codecool.colosseum.model.gladiators;

public class Assassin extends Gladiator {

    private static String[] listOfNames = {"Mettius Accius Ingenuus", "Sextus Sulpicius Bulla", "Numerius Maximius Mellitus",
            "Servius Laberius Renatus", "Galerius Granius Novellius", "Gallio Cantius Hiberus",
            "Decimus Aebutius Severus", "Caius Cantilius Micianus", "Nonus Silius Martial", "Aulus Ateius Salvian"};


    public Assassin() { super(); }

    @Override
    public String setName() {
        return listOfNames[random.nextInt(listOfNames.length)];
    }

    @Override
    float getBaseHP() {
        return (float) (BASE_HP_PARAM * LOW);
    }

    @Override
    float setBaseSP() {
        return (float) (BASE_SP_PARAM * HIGH);
    }

    @Override
    int setBaseDEX() {
        return (int) (BASE_DEX_PARAM * HIGH);
    }

}
