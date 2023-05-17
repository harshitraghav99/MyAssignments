package ExceptionHandling.Question3;

class SavingAccount {

    long id;
    double balance;
    public SavingAccount(long id, double balance){
        this.id=id;
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

    double withdraw(double amount) {
        balance=balance - amount;
        return balance;
    }

    double deposit(double amount) {
        balance+=amount;
        return balance;
    }
}
