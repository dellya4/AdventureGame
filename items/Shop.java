package items;

public class Shop {
    Item[] items;

    public Shop() {
        items = new Item[10];
        items[0] = new HealthElixir("Small elixir", "A small potion that " +
                "restores some health. Pleasant herbal taste.", 15, 30, 0, 0);
        items[1] = new HealthElixir("Medium elixir", "A medium healing " +
                "potion that quickly restores strength.", 25, 50, 0, 0);
        items[2] = new HealthElixir("Large elixir", "A powerful potion " +
                "that can completely restore health.", 50, 100, 0, 0);
        items[3] = new MagicScroll("Rusty Dagger ", "Old rusty dagger. " +
                "It is unlikely that he will withstand a serious fight.",
                10, 0,10, 0);
        items[4] = new MagicScroll("Steel Sword", "High-quality steel " +
                "sword with a comfortable handle. Reliable and durable.",
                30, 0,30, 0);
        items[5] = new MagicScroll("Knight’s Blade", "A brilliant blade " +
                "forged by masters. Symbol of valor and strength.",
                50, 0, 50, 0);
        items[6] = new MagicScroll("Iron Shield", "A durable iron shield " +
                "that can withstand blows from swords and arrows.",
                10, 0, 0, 10);
        items[7] = new MagicScroll("Guardian Amulet", "A mysterious amulet " +
                "that creates an invisible protective barrier around the owner.",
                40, 0, 0, 40);
        items[8] = new MagicScroll("Battle Gauntlets", "Heavy combat gloves " +
                "that increase the force of impact and protect hands from injury.",
                35, 0, 20, 15);
        items[9] = new MagicScroll("Berserker’s Cloak", "Berserker's cloak, which " +
                "gives the owner rage in battle - increases attack and reduces incoming damage.",
                80, 0, 50, 100);
    }
    public void printItems() {
        for (int i = 0; i < items.length; i++) {
            System.out.println("id: "+i+" Name: "+items[i].getName()+" Price: "+items[i].getPrice());
        }
    }
    public String printItem(int id) {
        return "Name: "+items[id].getName()+"\nDescription: "+items[id].getDescription()+
                "\nPrice: "+items[id].getPrice()+ "\nHealth: "+items[id].getHealth()+
                "\nDamage: "+items[id].getDamage()+"\nDefence: "+items[id].getDefence();
    }
    public Item getItem(int id) {
        return items[id];
    }
}
