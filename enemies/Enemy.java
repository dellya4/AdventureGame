package enemies;

public abstract class Enemy {
    String name;
    int level;
    int health;
    int damage;
    int defence;
    int coins; //give for player if he wins enemy
    int experience; //give for player if he wins enemy

    Enemy(String name, int health, int damage, int defence, int coins, int experience) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defence = defence;
        this.coins = coins;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getDefence() {
        return defence;
    }
    public void setDefence(int defence) {
        this.defence = defence;
    }
    public int getCoins() {
        return coins;
    }
    public int getExperience() {
        return experience;
    }
}
