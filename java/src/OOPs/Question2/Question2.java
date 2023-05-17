package OOPs.Question2;

import java.util.ArrayList;

public class Question2 {
    int salary = 10000;
    public int getSalary(int salary){
        return salary;
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        int sum = 0;
        for (int salary:employeeSalaries) {
//            System.out.println(salary);
            sum=sum + salary;
//            System.out.println(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        //Question 2 class treated as employee class
        Question2 employee = new Question2();
        Manager manager = new Manager();
        Labour labour = new Labour();
//        System.out.println(manager.getSalary(employee.salary));
//        System.out.println(labour.getSalary(employee.salary));
        ArrayList<Integer> employeeSalaries = new ArrayList<Integer>();
        employeeSalaries.add(manager.getSalary(employee.salary));
        employeeSalaries.add(labour.getSalary(employee.salary));
        employeeSalaries.add(employee.salary);
        System.out.println(employee.totalEmployeesSalary(employeeSalaries));

    }
}

