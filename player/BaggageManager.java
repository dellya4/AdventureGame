package player;

import items.*;

public class BaggageManager {
    Player player;
    Baggage bag;
    Shop shop;
    Wallet wallet;

    public BaggageManager(Player player, Baggage bag, Shop shop, Wallet wallet) {
        this.player = player;
        this.bag = bag;
        this.shop = shop;
        this.wallet = wallet;
    }

    public void addItem(Item item) {
        bag.addItem(item);
        player.setHealth(player.getHealth()+item.getHealth());
        player.setDefence(player.getDefence()+item.getDefence());
        player.setDamage(player.getDamage()+item.getDamage());
    }
}
