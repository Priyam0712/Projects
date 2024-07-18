# Magical Arena

Welcome to the Magical Arena! This project simulates a turn-based combat game where two players engage in a battle until one of them perishes. Each player is equipped with unique attributes such as health, strength, and attack power. The game alternates turns between the players, allowing them to roll dice to determine the effectiveness of their attacks and defenses. The player who depletes the opponent's health first wins the match.

## Features

- **Player Attributes**: Each player has health, strength, and attack attributes.
- **Turn-Based Combat**: Players take turns to attack and defend.
- **Dice Rolls**: The outcome of attacks and defenses are determined by dice rolls.
- **Fight Logs**: Detailed logs of each turn are printed, showing the actions and outcomes.

## Project Structure

MagicalArena/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── magicalarena/
│                   ├── Main.java
│                   ├── Player.java
│                   └── Arena.java
└── test/
    └── java/
        └── com/
            └── magicalarena/
                └── ArenaTest.java
├── README.md
├── .gitignore
└── .git/


## Classes


### Player

- **Attributes**: `name`, `health`, `strength`, `attack`
- **Methods**:
  - `getName()`
  - `getHealth()`
  - `getStrength()`
  - `getAttack()`
  - `receiveDamage(int damage)`
  - `isAlive()`
  - `calculateAttackDamage(int diceRoll)`
  - `calculateDefendDamage(int diceRoll)`

### Arena

- **Attributes**: `player1`, `player2`, `random`
- **Methods**: `startFight()`

### Main

- **Methods**: `main(String[] args)`

## How to Run

To run the Magical Arena game, follow these steps in a terminal (Command Prompt, PowerShell, or Terminal).:

1. **Clone the repository:**

  "" git init ""  [ or if it is publicly/online "" git clone <repository-url> " ]

[ ## Git Integration

This project uses Git for version control. Make sure to have Git installed on your machine to clone, manage, and contribute to the project. If you're new to Git, you can download it from git-scm.com (if already not installed in system). ]


2. **Navigate to the project directory:**

  "" cd MagicalArena ""



3. **Compile the main source files:**

  "" javac -d out src/main/java/com/magicalarena/*.java ""



4. **Compile the test source files:**

  "" javac -d out -cp out test/java/com/magicalarena/*.java ""



5. **Run the main program:**

  "" java -cp out com.magicalarena.Main ""



6. **Run the tests:**

  "" java -cp out com.magicalarena.ArenaTest ""



## Usage

Upon running the main program (`Main.java`), the game will simulate a fight between two predefined players, "Player A" and "Player B". The detailed actions and outcomes of each turn will be printed to the console, showing the dice rolls, damage dealt, and remaining health of each player.

## Tests

The `ArenaTest.java` class includes various tests to verify the functionality of the Player and Arena classes. These tests cover:

- Player attribute retrieval and modification.
- Damage calculation and reception.
- Fight simulation and winner determination.

Running `ArenaTest` ensures the correctness of the game's logic and verifies that the fight simulation accurately reflects the outcome based on both players' health.

## Commit Frequently

To maintain a clean and organized development process, commit your changes frequently with meaningful commit messages. Here are some examples of commit messages for this project:

1. `Initial project setup`
2. `Implement Player class with attributes and methods`
3. `Implement Arena class with fight logic`
4. `Add Main class to start the game`
5. `Write unit tests for Player and Arena classes`
6. `Update README with instructions`

## Contact

For any questions, please contact me(Priyam Pandey) at priyampandey077@gmail.com.


 

