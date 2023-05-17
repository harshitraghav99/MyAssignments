package Generics.Question1;

class Employee {
    int id;
    String name;
    int salary;
    String department;
    Employee(int id, String name, int salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary + ", Department: " + department);
    }
}
