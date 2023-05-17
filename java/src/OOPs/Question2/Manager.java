package OOPs.Question2;

public class Manager extends Question2 {
    @Override
    public int getSalary(int salary) {
        int incentive =5000;
        return (super.getSalary(salary)+incentive);
    }

}
