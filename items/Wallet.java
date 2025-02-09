package items;

public class Wallet {
    private int summa;

    public Wallet() {
        summa = 0;
    }

    public void getSummaVoid() {
        System.out.println("Coins: " + summa);
    }
    public int getSumma() {
        return summa;
    }
    public void addCoins(int coins) {
        this.summa = (summa+coins);
    }
    public void subtractCoins(int coins) {
        this.summa = (summa-coins);
    }
    public void cleanCoins() {
        this.summa = 0;
    }
}
