package items;

public abstract class Item {
    private String name;
    private String description;
    private int price;
    private int health;
    private int damage;
    private int defence;

    public Item(String name, String description, int price,  int health, int damage, int defence) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.health = health;
        this.damage = damage;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getPrice() {
        return price;
    }
    public int getHealth() {
        return health;
    }
    public int getDamage() {
        return damage;
    }
    public int getDefence() {
        return defence;
    }

}
