package Generics.Question1;

import java.util.HashSet;

public class Question1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Harsh",30000,"EE");
        Employee e2 = new Employee(2,"Darsh",80000,"ECE");
        Employee e3 = new Employee(3,"Harshit",70000,"CSE");
        int a = 5;

        HashSet<Employee> hs = new HashSet<>();
        hs.add(e1);
        hs.add(e2);
        hs.add(e3);
        for (Employee e:hs
             ) {
            e.displayDetails();

        }

    }
}
