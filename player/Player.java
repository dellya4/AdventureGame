package player;

public class Player {
    private String name;
    private int level;
    private int experience;
    private int health;
    private int damage;
    private int defence;

    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.experience = 0;
        this.health = 100;
        this.damage = 10;
        this.defence = 15;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
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
    public String getInfo() {
        return "Name: "+getName()+"\nLevel: "+getLevel()+"\nExperience: "+getExperience()+"\nHealth: "+getHealth()+"\nDamage: "+getDamage()+"\nDefence: "+getDefence();
    }
}
