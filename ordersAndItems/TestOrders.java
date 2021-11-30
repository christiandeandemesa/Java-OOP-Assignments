import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 3.5;

        Item item2 = new Item();
        item2.name = "drip coffee";
        item2.price = 1.5;

        Item item3 = new Item();
        item3.name = "latte";
        item3.price = 2.5;

        Item item4 = new Item();
        item4.name = "cappuccino";
        item4.price = 4.5;
    
        // Order variables
        Order order1 = new Order();
        order1.name = "Cindhuri's order"; 

        Order order2 = new Order();
        order2.name = "Sam's order"; 

        Order order3 = new Order();
        order3.name = "Jimmy's order"; 

        Order order4 = new Order();
        order4.name = "Noah's order"; 
    
        // Application Simulations
        System.out.printf("Order 1: %s\n", order1);

        order2.items.add(item1);
        order2.total += item1.price;
        System.out.printf("Order 2's items cost %.2f\n", order2.total);
        // "Order 2's items cost 3.50"

        order3.items.add(item4);
        order3.total += item4.price;
        System.out.printf("Order 3's items cost %.2f\n", order3.total);
        // "Order 3's items cost 4.50"

        order4.items.add(item2);
        order4.total += item3.price;
        System.out.printf("Order 4's items cost %.2f\n", order4.total);
        // "Order 4's items cost 2.50"

        order1.ready = true;
        System.out.printf("%s is %s\n", order1.name, order1.ready);
        // "Cindhuri's order is true"

        order2.items.add(item3);
        order2.items.add(item3);
        order2.total += item3.price * 2;
        System.out.printf("%s's items cost %.2f\n", order2.name, order2.total);
        // "Sam's order's items cost 8.50"

        order3.ready = true;
        System.out.printf("%s is %s\n", order3.name, order3.ready);
        // "Jimmy's order is true"

    }
}