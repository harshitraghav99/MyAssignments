package OOPs.Question3;

public class SavingAccount extends Bank{
    int totalDeposits=10000;
    int fixedDepositAmount=5000;

    @Override
    int total() {
        return totalDeposits+fixedDepositAmount;
    }
}
