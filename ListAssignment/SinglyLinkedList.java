public class SinglyLinkedList {

    // Method variable
    public Node head;

    // Constructor
    public SinglyLinkedList() {
        this.head = null;
    }

    // Return a statement if the list is empty
    private void isEmpty() {
        if(head == null) {
            System.out.println("Empty list");
        }
    }

    // Adds an integer to the end of the list
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            this.head = newNode;
            printValues();
        } 
        else {
            Node runner = this.head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
            printValues();
        }
    }

    // Removes the last integer of the list
    public void remove() {
        Node runner = head;
        int temp;
        if(head == null) {
            isEmpty();
        }
        if(head.next == null) {
            temp = head.value;
            head = null;
            printValues();
        }
        else {
            while(runner.next.next != null) {
                runner = runner.next;
            }
            temp = runner.next.value;
            runner.next = null;
            printValues();
        }
    }

    // Displays the list
    public void printValues() {
        if(head == null) {
            isEmpty();
        }
        Node runner = this.head;
        while(runner.next != null) {
            System.out.println(String.format("Node Value: %s --- Next Value: %s", runner.value, runner.next.value));
            runner = runner.next;
        }
        System.out.println(String.format("Node Value: %s --- Next Value: null", runner.value));
        System.out.println("________________________________________________________________");
    }

}