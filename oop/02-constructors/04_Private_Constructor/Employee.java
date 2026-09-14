public class Employee {

    private String name;

    // Private constructor
    private Employee(String name) {
        this.name = name;
    }

    // Public method to create object
    public static Employee createEmployee(String name) {
        return new Employee(name);
    }

    public void display() {
        System.out.println("Employee: " + name);
    }
}