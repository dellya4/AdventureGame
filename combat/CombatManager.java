package combat;

import level.*;
import player.*;

public class CombatManager {
    Player player;
    LevelManager levelManager;

    public CombatManager(Player player, LevelManager levelManager) {
        this.player = player;
        this.levelManager = levelManager;
    }

    public boolean combat() {
        boolean personFail = false;
        boolean enemyFail = false;
        double random = Math.random();
        if (random < 0.5) {
            personAttack();
        }
        else {
            enemyAttack();
        }
        while (true) {
            if (player.getHealth()==0 || player.getHealth()<0) {
//                personFail = true;
                break;
            }
            if (levelManager.getEnemyForLevel().getHealth()<=0) {
                enemyFail = true;
                break;
            }
            personAttack();
            if (levelManager.getEnemyForLevel().getHealth()<=0) {
                enemyFail = true;
                break;
            }
            enemyAttack();
            if (player.getHealth()==0 || player.getHealth()<0) {
                personFail = true;
                break;
            }
        }
        if (enemyFail) {
            player.setExperience(levelManager.getEnemyForLevel().getExperience()+player.getExperience());
            return true;
        }
        return false;
    }

    public void personAttack() {
        if (player.getDamage()>=levelManager.getEnemyForLevel().getDefence()) {
            levelManager.getEnemyForLevel().setHealth(levelManager.getEnemyForLevel().getHealth()-player.getDamage());
        } else if (player.getDamage()<levelManager.getEnemyForLevel().getDefence()) {
            levelManager.getEnemyForLevel().setDefence(levelManager.getEnemyForLevel().getDefence()-player.getDamage());
        }
    }
    public void enemyAttack() {
        if (player.getDefence()<=levelManager.getEnemyForLevel().getDamage()) {
            player.setHealth(player.getHealth() - levelManager.getEnemyForLevel().getDamage());
        } else if (player.getDefence()<levelManager.getEnemyForLevel().getDamage()) {
            player.setDefence(player.getDefence()-levelManager.getEnemyForLevel().getDamage());
        }
    }
}
