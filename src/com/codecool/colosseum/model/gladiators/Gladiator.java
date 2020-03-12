package com.codecool.colosseum.model.gladiators;

// Zrób metody abstrakcyjne dla wszystkich i indywidualne dla różnych gladiatorów + ew zmienne
// Modyfikatory dostepu protected dla klasy i podklas.
// Domyślnie zaczynamy od private, następnie default, protected, a jak nie da sie to public.
// magic numbers użyte raz to dodać komentarz, a jak wiecej to przypisać do zmiennej.


import java.util.Random;

public abstract class Gladiator {

    static final double LOW = 0.75;
    static final int MEDIUM = 1;
    static final double HIGH = 1.25;

    int BASE_HP_PARAM = (int)(Math.random()*100);
    int BASE_SP_PARAM = (int)(Math.random()*100);
    int BASE_DEX_PARAM = (int) (Math.random()*100);
    private int LVL = (int) (Math.random()*5) + 1;
    Random random;

    private String name;
    private int HP;
    private int SP;
    private int DEX;
    private int lvl;

    Gladiator(){
        random = new Random();
        name = getName();
        lvl = getLVL();
        HP = getHP() * lvl;
        SP = getSP() * lvl;
        DEX = getDEX() * lvl;
        sayHello();
        System.out.println(this);
    }


//    Gladiator(String name, int baseHP, int baseSP, int baseDEX, int lvl){
//        this.lvl = lvl;
//        this.baseSP = baseSP * lvl;
//        this.baseDEX = baseDEX * lvl;
//        this.HP = baseHP * lvl;
//        this.name = name;
//        sayHello();
//        System.out.println(this);
//    }


    private int getLVL(){
        return LVL;
    }

    abstract String getName();

    abstract int getSP();

    abstract int getDEX();

    abstract int getHP();

    int getGladiatorsHP(){
        return this.HP;
    }

    int getGladiatorsSP(){
        return this.SP;
    }

    int getGladiatorsDEX(){
        return this.DEX;
    }


    abstract void attack();

    abstract void defend();

    private void sayHello(){
        System.out.println("Hello, my name is " + name);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": baseHP: " + HP + ", baseSP: " + SP + ", base DEX: " + DEX + ", lvl: " + lvl;
    }

}
