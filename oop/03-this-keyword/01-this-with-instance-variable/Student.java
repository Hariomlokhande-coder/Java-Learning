public class Student {

    // Instance variables belong to each object
    String name;
    int age;

    Student(String name, int age) {

        // this refers to the current object's instance variable
        this.name = name;
        this.age = age;
    }

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}