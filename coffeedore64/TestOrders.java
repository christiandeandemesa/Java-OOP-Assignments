import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {

        CoffeeKiosk kiosk = new CoffeeKiosk();
    
        // Menu items
        kiosk.addMenuItem("mocha", 3.5);
        kiosk.addMenuItem("drip coffee", 1.5);
        kiosk.addMenuItem("latte", 2.5);
        kiosk.addMenuItem("cappuccino", 4.5);
    
        // Orders
        kiosk.newOrder();

    }
}
