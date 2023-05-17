package OOPs.Question3;

import java.util.ArrayList;

public class Question3 {
    public static int totalCashInBank(ArrayList<Integer> cash){
        int sum=0;
        for (int c:cash) {
            sum+=c;
        }
        return sum;
    }
//    public int getCash(){}
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        CurrentAccount currentAccount = new CurrentAccount();
        ArrayList<Integer> cash = new ArrayList<Integer>();
        cash.add(savingAccount.total());
        cash.add(currentAccount.total());
        System.out.println(totalCashInBank(cash));
    }
}