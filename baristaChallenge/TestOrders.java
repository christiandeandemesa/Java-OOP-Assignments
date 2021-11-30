import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("drip coffee", 1.5);
        Item item3 = new Item("latte", 2.5);
        Item item4 = new Item("cappuccino", 4.5);
    
        // Create 2 orders for unspecified guests (without specifying a name).
        Order order1 = new Order();
        Order order2 = new Order();

        // Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("Christian");
        Order order4 = new Order("Bianca");
        Order order5 = new Order("James");

        // Add at least 2 items to each of the orders using the addItem method.
        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item1);
        order2.addItem(item2);

        order3.addItem(item1);
        order3.addItem(item2);

        order4.addItem(item1);
        order4.addItem(item2);

        order5.addItem(item1);
        order5.addItem(item2);

        // Test your getStatusMessage functionality by setting some orders to ready and printing the messages for each order.
        System.out.println(order1.getStatusMessage());

        order1.setReady(true); 
        System.out.println(order1.getStatusMessage());

        // Test the total by printing the return value.
        System.out.println(order1.getOrderTotal());
        System.out.println(order2.getOrderTotal());
        System.out.println(order3.getOrderTotal());
        System.out.println(order4.getOrderTotal());
        System.out.println(order5.getOrderTotal());

        // Call the display method on all of your orders.
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();

    }
}