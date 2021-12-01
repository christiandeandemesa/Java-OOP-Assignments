import java.util.*;
public class CoffeeKiosk {

    // Member variables
    private ArrayList<Item> menu = new ArrayList<Item>();
    private ArrayList<Order> orders = new ArrayList<Order>();

    // Constructor
    public CoffeeKiosk() {
    }

    // Adds an item object to menu array
    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price);
        menu.add(newItem);
        int index = menu.indexOf(newItem);
        newItem.setIndex(index);
    }

    // Displays all of the items in the menu array
    public void displayMenu() {
        for(Item item: this.menu) {
            System.out.printf("%d %s -- $%.2f\n", item.getIndex(), item.getName(), item.getPrice());
        }
    }

    // Takes input from the user in the terminal to create a new order instance and add it to the orders array.
    public void newOrder() {

        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();

        // Creates a new order with the given input string.
        Order newOrder = new Order(name);

        // Show the user the menu, so they can choose items to add.
        displayMenu();

        // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index to continue, or q to quit:");
        String itemNum = System.console().readLine();

        // Write a while loop to collect all user's order items
        while(!itemNum.equals("q")) {
            
            // Get the item object from the menu, and add the item to the order
            int itemIndex = Integer.parseInt(itemNum);
            if(itemIndex < this.menu.size()){
                Item orderItem = menu.get(itemIndex);
                newOrder.addItem(orderItem);
                displayMenu();
            }
            else {
                System.out.println("Please choose a number from 0 - 3");
                displayMenu();
            }

            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter the index of the coffee you would like to order, or press q to exit");
            itemNum = System.console().readLine();

            // After you have collected their order, print the order details.
            newOrder.display();
            this.orders.add(newOrder);
        }

    }

}