# Monolithic Adventure Game

## Project Description
**Monolithic Adventure Game** is a text—based RPG game in which the player controls a character, participates in battles, purchases items from a store, and completes levels. Basic mechanics include inventory management, a level system, and a combat system.

## Project structure
The project consists of the following packages:

- **combat** — contains the logic of the combat system (`CombatManager`).
- **enemies** — contains classes of enemies (`Enemy`, `Minotaur', `Skeleton`, `Spider`, `Vampire`, `Zombie`).
- **items** — responsible for items and store (`Baggage`, `HealthElixir', `Item`, `MagicScroll`, `Shop`, `Wallet`).
- **level** — manages the level system (`LevelManager`).
- **player** — contains the classes of the player and his inventory management (`BaggageManager`, `Player`).

## Launching the game

1. Compile and run `MainGame.java`.
2. When you start the game, you will be prompted to create a character by specifying his name.
3. The game includes the following stages:
   - Output of information about the character.
   - Fighting with enemies.
   - Gain experience and level up.
   - The ability to visit the store to purchase items.
   - Continue fighting until victory or defeat.

## Basic Mechanics

### 1. Combat system
The game has a combat system with opponents. The battle takes place in a turn-based mode, where an attack can be made randomly either by the player or by the opponent. The player or enemy wins when the opponent's health drops to 0.

### 2. Levels and Experience
The player gets experience for defeating enemies. When a certain amount of experience is achieved, the level increases.

### 3. Inventory and store
The player can buy items in the store, which are added to his inventory. In-game currency is used for purchases.

## Opportunities for improvement
- Add more enemies and items.
- Introduce a quest system and a storyline.
- Improve the combat system by adding skills and magic.
- Implement saving the player's progress.

## Author
The project was created for educational purposes for the practice of Java programming, by a student of Narxoz University, Adel Abdrakhmanova.