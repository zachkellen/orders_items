import java.util.ArrayList;
public class TestOrders2 {
    public static void main(String[] args) {

        // Creating Orders
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Zach");
        Order order4 = new Order("Chris");
        Order order5 = new Order("Joe");

        // Creating Items
        Item item1 = new Item("Mocha", 2.0);
        Item item2 = new Item("Latte", 2.5);
        Item item3 = new Item("Drip Coffee", 1.5);
        Item item4 = new Item("Capuccino", 3.0);

        // Adding Items
        order1.addItem(item1);
        order1.addItem(item1);
        order2.addItem(item2);
        order2.addItem(item2);
        order3.addItem(item3);
        order3.addItem(item3);
        order4.addItem(item4);
        order4.addItem(item4);
        order5.addItem(item1);
        order5.addItem(item4);

        // Status Message Testing
        order2.setIsReady(true);
        order4.setIsReady(true);
        // System.out.println(order1.getStatusMessage());
        // System.out.println(order2.getStatusMessage());
        // System.out.println(order3.getStatusMessage());
        // System.out.println(order4.getStatusMessage());
        // System.out.println(order5.getStatusMessage());

        // Order Total Testing
        // System.out.println(order1.getOrderTotal());
        // System.out.println(order2.getOrderTotal());
        // System.out.println(order3.getOrderTotal());
        // System.out.println(order4.getOrderTotal());
        // System.out.println(order5.getOrderTotal());

        // Display Testing
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}