package ExceptionHandling.Question3;
import java.util.Scanner;
public class Question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingAccount s = new SavingAccount(132123123l,5000);
        System.out.println("Withdraw(w) or Deposit(d) ?");
        char a = sc.next().charAt(0);
        System.out.println("Enter amount: ");
        double amount = sc.nextDouble();

        try {
            if(amount<0) {
                throw new IllegalBankTransactionException();
            }
            else if(amount>s.getBalance() || s.getBalance()==0) {
                throw new InsufficientBalanceException();
            }
            if(a=='w') {
                System.out.println("Amount Withdrawed: " + amount);
                System.out.println("Available Balance: " + s.withdraw(amount));
            }
            if(a=='d') {
                System.out.println("Amount Deposited: " + amount);
                System.out.println("Available Balance: " + s.deposit(amount));
            }
        }
        catch(IllegalBankTransactionException e1) {
            System.out.println(e1.getMessage());
        }
        catch(InsufficientBalanceException e2) {
            System.out.println(e2.getMessage());
        }

    }

}