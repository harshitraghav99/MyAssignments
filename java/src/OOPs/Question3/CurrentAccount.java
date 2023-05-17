package OOPs.Question3;

public class CurrentAccount extends Bank {
    int totalDeposits=10000;
    int creditLimit =2000;

    @Override
    int total() {
        return totalDeposits+creditLimit;
    }
}
