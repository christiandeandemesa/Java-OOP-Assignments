import java.util.ArrayList;
public class Order {
    
    // Member variables
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items = new ArrayList<Item>(); // defaults to null
    
    // Constructor
    public Order() {
        this.name = "guest";
        this.ready = false;
    }

    // Overloaded constructor
    public Order(String name) {
        this.name = name;
        this.ready = false;
    }
    
    // Adds an item to an array
    public void addItem(Item item) {
        this.items.add(item);
    }
    
    // Returns a string depending on the value of ready
    public String getStatusMessage() {
        if(this.ready == true) {
            return "Your order is ready.";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    // Returns the sum of all the item's prices in the array
    public double getOrderTotal() {
        double total = 0;
        for(Item i: this.items) {
            total += i.getPrice();
        }
        return total;
    }

    // Displays information in the terminal
    public void display() {
        System.out.printf("Customer Name: %s\n", this.name);
        for(Item i: this.items) {
            System.out.printf("%s - $%.2f\n", i.getName(), i.getPrice());
        }
        System.out.printf("Total: $%.2f\n\n", this.getOrderTotal());
    }
    
    // name getter
    public String getName() {
        return this.name;
    }

    // ready getter
    public boolean getReady() {
        return this.ready;
    }

    // items getter
    public ArrayList<Item> getItems() {
        return items;
    }
    
    // name setter
    public void setName(String name) {
        this.name = name;
    }

    // ready setter
    public void setReady(boolean ready) {
        this.ready = ready;
    }

    // items setter
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
}