package javaFinalTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Employee first = new Employee("Vladimir", "Popov", "It-development", 102345);
        Employee second = new Employee("Fedor", "Rasumov", "Logistics", 64990);
        Employee third = new Employee("Andrew", "Konovalov", "Analytics", 84300);
        Employee fourth = new Employee("Fedor", "Rasumov", "PR-manegment", 34000);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);

        System.out.println("Comparison result is " + first.equals(second) + "\n");
        System.out.println("Comparison result is " + second.equals(third) + "\n");
        System.out.println("Comparison result is " + second.equals(fourth) + "\n");

        System.out.println(first.hashCode() == second.hashCode());
        System.out.println(second.hashCode() == third.hashCode());
        System.out.println(second.hashCode() == fourth.hashCode());
    }
}
