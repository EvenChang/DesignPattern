package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public int getCost() {
        int cost = 0;
        for (Item item : items) {
            cost = cost + item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Item : " + item.name());
            System.out.println("Packing : " + item.packing().packing());
            System.out.println("Price : " + item.price());
        }
    }
}
