package com.codecool.colosseum.model.gladiators;

import java.util.Random;

public abstract class Gladiator {

    static final double LOW = 0.75;
    static final int MEDIUM = 1;
    static final double HIGH = 1.25;

    int BASE_HP_PARAM = (int) (Math.random() * 100) + 1;
    int BASE_SP_PARAM = (int) (Math.random() * 100) + 1;
    int BASE_DEX_PARAM = (int) (Math.random() * 100) + 1;
    private int LVL = (int) (Math.random() * 5) + 1;
    Random random;

    private String name;
    private float HP;
    private float SP;
    private int DEX;
    private int lvl;

    Gladiator() {
        random = new Random();
        name = setName();
        lvl = setBaseLVL();
        HP = getBaseHP();
        SP = setBaseSP();
        DEX = setBaseDEX();
        System.out.println(this);
    }

    public void getDamage(float damage) { this.HP = HP - damage; }

    public boolean isAlive() { return HP > 0; }

    private int setBaseLVL() {
        return LVL;
    }

    public void setBaseLVL(int lvl) {
        this.lvl += lvl;
    }

    abstract String setName();

    abstract float setBaseSP();

    abstract int setBaseDEX();

    abstract float getBaseHP();

    public float getHP() {
        return this.HP * this.lvl;
    }

    public float getSP() {
        return this.SP * this.lvl;
    }

    public int getDEX() {
        return this.DEX * this.lvl;
    }

    public String getName() { return name; }

    public String toString() {
        return "Hello, I am " + this.getClass().getSimpleName() + ", my name is " + this.getName() + ": HP: " + HP + ", SP: " + SP + ", DEX: " + DEX + ", lvl: " + lvl;
    }
}
