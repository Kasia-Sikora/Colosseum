package com.codecool.colosseum.model.gladiators;

public class Archer extends Gladiator {


    private static String[] listOfNames = {"Mettius Accius Ingenuus", "Sextus Sulpicius Bulla", "Numerius Maximius Mellitus",
            "Servius Laberius Renatus", "Galerius Granius Novellius", "Gallio Cantius Hiberus",
            "Decimus Aebutius Severus", "Caius Cantilius Micianus", "Nonus Silius Martial", "Aulus Ateius Salvian"};

    public Archer(){
        super();
    }

    @Override
    public String setName() {
        return listOfNames[random.nextInt(listOfNames.length)];
    }

    @Override
    float getBaseHP() {
        return BASE_HP_PARAM * MEDIUM ;
    }

    @Override
    float setBaseSP() {
        return BASE_SP_PARAM * MEDIUM;
    }

    @Override
    int setBaseDEX() {
        return (int) (BASE_DEX_PARAM * HIGH);
    }

}
