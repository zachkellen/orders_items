import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 2.0;
        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 2.5;
        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 1.5;
        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 3.0;
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.total = 0.0;
        order1.isReady = true;
        order1.items = new ArrayList<Item>();

        order1.items.add(item1);
        order1.total = order1.total + item1.price;

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.total = 0;
        order2.isReady = false;
        order2.items = new ArrayList<Item>();

        order2.items.add(item1);
        order2.total += item1.price;
        order2.isReady = true;

        Order order3 = new Order();
        order3.name = "Noah";
        order3.total = 0;
        order3.isReady = false;
        order3.items = new ArrayList<Item>();

        order3.items.add(item4);
        order3.total += item4.price;

        Order order4 = new Order();
        order4.name = "Sam";
        order4.total = 0;
        order4.isReady = false;
        order4.items = new ArrayList<Item>();

        order4.items.add(item2);
        order4.total += item2.price;
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += (item2.price * 2);
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.isReady);
        System.out.printf("Items: %s\n", order1.items);
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.isReady);
        System.out.printf("Items: %s\n", order2.items);
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.isReady);
        System.out.printf("Items: %s\n", order3.items);
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.isReady);
        System.out.printf("Items: %s\n", order4.items);
    }
}