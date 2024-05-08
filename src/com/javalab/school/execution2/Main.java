package com.javalab.school.execution2;

public class Main {
    public static void main(String[] args) {
        // Creating instances of MyClass
        MyClass obj1 = new MyClass(1, "Alice");
        MyClass obj2 = new MyClass(2, "Bob");
        MyClass obj3 = new MyClass(1, "Alice"); // Duplicate of obj1

        // Printing MyClass objects
        System.out.println("Object 1: " + obj1);
        System.out.println("Object 2: " + obj2);
        System.out.println("Object 3: " + obj3);

        // Testing equals() method
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2)); // false
        System.out.println("obj1.equals(obj3): " + obj1.equals(obj3)); // true

        // Testing hashCode() method
        System.out.println("obj1.hashCode(): " + obj1.hashCode());
        System.out.println("obj2.hashCode(): " + obj2.hashCode());
        System.out.println("obj3.hashCode(): " + obj3.hashCode());
    }
}

