package com.magicalarena;

import java.util.Random;

public class Arena {
    private Player player1;
    private Player player2;
    private Random random;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.random = new Random();
    }

    private int rollDice() {
        return random.nextInt(6) + 1;
    }

    public void startFight() {
        Player currentAttacker = player1;
        Player currentDefender = player2;

        System.out.println("The fight begins between " + player1.getName() + " and " + player2.getName() + "!");
        System.out.println("Initial health - " + player1.getName() + ": " + player1.getHealth() + ", " + player2.getName() + ": " + player2.getHealth());

        while (player1.isAlive() && player2.isAlive()) {
            // Attacker rolls dice
            int attackRoll = rollDice();
            int attackDamage = currentAttacker.calculateAttackDamage(attackRoll);

            // Defender rolls dice
            int defendRoll = rollDice();
            int defendDamage = currentDefender.calculateDefendDamage(defendRoll);

            // Calculate damage
            int damageDealt = Math.max(0, attackDamage - defendDamage);
            currentDefender.receiveDamage(damageDealt);

            // Print fight log
            System.out.println(currentAttacker.getName() + " attacks with roll " + attackRoll + " dealing " + damageDealt + " damage to " + currentDefender.getName() + " (Defend roll: " + defendRoll + ").");
            System.out.println(currentDefender.getName() + " now has " + currentDefender.getHealth() + " health.");

            // Swap roles for next turn
            Player temp = currentAttacker;
            currentAttacker = currentDefender;
            currentDefender = temp;
        }

        // Determine the winner and loser
        Player winner = player1.isAlive() ? player1 : player2;
        Player loser = player1.isAlive() ? player2 : player1;

        System.out.println("The fight ends! " + winner.getName() + " is the winner!");

        // Ensure the loser is properly marked as dead
        if (loser.isAlive()) {
            throw new IllegalStateException("TestFight - " + loser.getName() + " should be dead.");
        }
    }
}
