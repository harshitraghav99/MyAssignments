package OOPs.Question2;

public class Labour extends Question2{
    @Override
    public int getSalary(int salary) {
        int overtime=500;
        return (super.getSalary(salary)+overtime);
    }
}
