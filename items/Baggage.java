package items;

public class Baggage {
    Item[] baggage;
    int index;

    public Baggage() {
        baggage = new Item[5];
        index = 0;
    }

    public void addItem(Item item) {
        if (index < baggage.length) {
            baggage[index] = item;
            index++;
        }
        else {
            System.out.println("In your baggage doesn't have place. Delete some items.");
        }
    }

    public void deleteItem(Item item) {
        for (int i = 0; i < baggage.length; i++) {
            if (baggage[i] == item) {
                baggage[i] = null;
                System.out.println("Item deleted.");
            }
            else {
                System.out.println("You don't have this item.");
            }
        }
    }

    public void clearBaggage() {
        this.baggage = new Item[5];
    }

    public void getItems() {
        System.out.print("Baggage:");
        if (baggage[0] == null) {
            System.out.println(" no item found.");
        } else {
            for (int i = 0; i < index; i++) {
                System.out.println(baggage[i].getName());
            }
        }
    }
}
