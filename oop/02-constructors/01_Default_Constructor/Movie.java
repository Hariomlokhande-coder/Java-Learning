public class Main {

    public static void main(String[] args) {

        // Original object
        Order order1 = new Order("Laptop", 50000);

        // copy constructor
        Order order2 = new Order(order1);

        System.out.println("Original Order:");
        order1.display();

        System.out.println("\nCopied Order:");
        order2.display();

        System.out.println("\nAre they same object? " + (order1 == order2));
    }
}