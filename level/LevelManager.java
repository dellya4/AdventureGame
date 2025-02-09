package level;

import enemies.*;
import player.Player;
import java.util.HashMap;
import java.util.Map;

public class LevelManager {
    Map<Integer, Enemy> enemies;
    int level;

    public LevelManager(Player player) {
        this.level = player.getLevel();
        enemies = new HashMap<>();

        enemies.put(1, new Skeleton("Skeleton",30, 10, 0, 20, 10));
        enemies.put(2, new Zombie("Zombie",45, 20, 10, 30, 20));
        enemies.put(3, new Spider("Spider",60, 40, 30, 40, 30));
        enemies.put(4, new Vampire("Vampire",80, 60, 60, 80, 40));
        enemies.put(5, new Minotaur("Minotaur", 100, 80, 100, 100, 50));
    }

    public Enemy getEnemyForLevel() {
        return enemies.get(level);
    }
    public void addLevel() {
        this.level = level+1;
    }
    public void removeLevel() {
        this.level = 1;
    }
}
