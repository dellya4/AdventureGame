import combat.*;
import items.*;
import level.*;
import player.*;

import java.util.Scanner;

public class mainGame {
    static Scanner sc = new Scanner(System.in);
    static Wallet wallet = new Wallet();
    static Shop shop = new Shop();
    static Baggage bag = new Baggage();

    public static void main(String[] args) {
        Player player = createPlayer();
        BaggageManager baggageManager = new BaggageManager(player, bag, shop, wallet);
        LevelManager level = new LevelManager(player);
        game(player, level, wallet, bag, baggageManager);
    }

    private static Player createPlayer() {
        System.out.println("Hello! It is Monolithic Adventure Game! For first step, " +
                "you must create player. Please, write your name!");
        String name = sc.nextLine();
        return new Player(name);
    }
    private static void getInfo(Player player, Wallet wallet, Baggage baggage) {
        System.out.println("Do you want know information about the player? (1 - yes, 2 - no)");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println(player.getInfo());
            wallet.getSummaVoid();
            baggage.getItems();
        }
    }
    private static boolean combat(Player player, LevelManager level) {
        CombatManager combatManager = new CombatManager(player, level);
        if (combatManager.combat()) {
            wallet.addCoins(level.getEnemyForLevel().getCoins());
            System.out.println("Combat with "+level.getEnemyForLevel().getName()+" completed!");
            newLevel(player, level);
            return true;
        } else {
            System.out.println("Combat with "+level.getEnemyForLevel().getName()+" failed!");
        }
        return false;
    }
    private static void newLevel(Player player, LevelManager level) {
        if (player.getExperience()==10) {
            player.setLevel(player.getLevel() + 1);
            level.addLevel();
        } else if (player.getExperience()==30) {
            player.setLevel(player.getLevel() + 1);
            level.addLevel();
        } else if (player.getExperience()==60) {
            player.setLevel(player.getLevel() + 1);
            level.addLevel();
        } else if (player.getExperience()==100) {
            player.setLevel(player.getLevel() + 1);
            level.addLevel();
        }
    }
    private static void playerFail(Player player, LevelManager level, Baggage baggage, Wallet wallet) {
        player.setLevel(1);
        player.setHealth(100);
        player.setDamage(10);
        player.setDefence(5);
        player.setExperience(0);
        level.removeLevel();
        baggage.clearBaggage();
        wallet.cleanCoins();
    }

    private static void game(Player player, LevelManager level, Wallet wallet, Baggage baggage, BaggageManager baggageManager) {
        boolean check = true;
        getInfo(player, wallet, baggage);
        while(check) {
            check = combat(player, level);
            if (!check) {
                getInfo(player, wallet, baggage);
                System.out.println("Do you want to play again? (1 - yes, 2 - no)");
                int choice = sc.nextInt();
                if (choice == 1) {
                    playerFail(player, level, baggage, wallet);
                    check = true;
                } else if (choice == 2) {
                    System.out.println("You fail. Try again this game and choose different options!");
                    break;
                }
            }
            if (player.getExperience() >= 150) {
                System.out.println("You win the game!");
                break;
            }
            getInfo(player, wallet, baggage);
            shop(shop, baggageManager, wallet);
        }
    }

    private static void shop(Shop shop, BaggageManager baggageManager, Wallet wallet) {
        System.out.println("Do you want to go shop? (1 - yes, 2 - no)");
        int choice = sc.nextInt();
        boolean check = true;
        if (choice == 1) {
            while (check) {
                shop.printItems();
                System.out.println("Do you want to know the features of an " +
                        "item? (If yes, enter the item id, if no, then -1)");
                int itemId = sc.nextInt();
                if (itemId == -1) {
                    System.out.println("Shop is closed. Thank you. Good luck in combat!");
                    check = false;
                } else {
                    System.out.println(shop.printItem(itemId));
                    System.out.println("Do you want to buy this item? (1 - yes, 2 - no)");
                    int buy = sc.nextInt();
                    if (buy == 1) {
                        if (wallet.getSumma() >= shop.getItem(itemId).getPrice()) {
                            baggageManager.addItem(shop.getItem(itemId));
                            wallet.subtractCoins(shop.getItem(itemId).getPrice());
                            System.out.println(shop.getItem(itemId).getName() + " add in your baggage!");
                            check = false;
                        } else {
                            System.out.println("You don't have money to buy this item!");
                        }
                    } else {
                        System.out.println("Shop is closed. Thank you. Good luck in combat!");
                        check = false;
                    }
                }
            }
        }
    }
}
