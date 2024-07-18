package com.magicalarena;

public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;

    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public void receiveDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0; // Ensure health doesn't go negative
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int calculateAttackDamage(int diceRoll) {
        return attack * diceRoll;
    }

    public int calculateDefendDamage(int diceRoll) {
        return strength * diceRoll;
    }
}
