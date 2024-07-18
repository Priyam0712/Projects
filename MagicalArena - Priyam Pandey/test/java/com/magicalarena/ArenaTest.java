package com.magicalarena;

public class ArenaTest {
    public static void main(String[] args) {
        testPlayerAttributes();
        testPlayerDamageCalculation();
        testPlayerReceivesDamage();
        testFight();
    }

    private static void assertEqual(String testName, int expected, int actual) {
        if (expected != actual) {
            System.out.println(testName + " failed: expected " + expected + ", got " + actual);
        } else {
            System.out.println(testName + " passed.");
        }
    }

    private static void assertTrue(String testName, boolean condition) {
        if (!condition) {
            System.out.println(testName + " failed.");
        } else {
            System.out.println(testName + " passed.");
        }
    }

    public static void testPlayerAttributes() {
        Player player = new Player("Test Player", 50, 5, 10);
        assertEqual("testPlayerAttributes - Health", 50, player.getHealth());
        assertEqual("testPlayerAttributes - Strength", 5, player.getStrength());
        assertEqual("testPlayerAttributes - Attack", 10, player.getAttack());
    }

    public static void testPlayerDamageCalculation() {
        Player player = new Player("Test Player", 50, 5, 10);
        assertEqual("testPlayerDamageCalculation - Attack", 50, player.calculateAttackDamage(5));
        assertEqual("testPlayerDamageCalculation - Defend", 10, player.calculateDefendDamage(2));
    }

    public static void testPlayerReceivesDamage() {
        Player player = new Player("Test Player", 50, 5, 10);
        player.receiveDamage(20);
        assertEqual("testPlayerReceivesDamage", 30, player.getHealth());
    }

    public static void testFight() {
        Player player1 = new Player("Player A", 50, 5, 10);
        Player player2 = new Player("Player B", 100, 10, 5);
        Arena arena = new Arena(player1, player2);
        arena.startFight();

        // Check that the loser (either Player 1 or Player 2) is dead
        assertTrue("testFight - Player 1 or Player 2 should be dead", !player1.isAlive() || !player2.isAlive());
    }
}
