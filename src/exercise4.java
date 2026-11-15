import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args){
        SavingsAccount svAcc = new SavingsAccount(892345098, 1567.53f, 4.3f);
        System.out.printf("Your account number is: %d\n", svAcc.accNumGetter());
        System.out.printf("Your account's balance is: %.3f\n", svAcc.balanceGetter());
        System.out.printf("Your account's interest rate is: %.3f\n", svAcc.interestRateGetter());

    }
}

class BankAccount{
    protected int account_number;
    protected float balance;

    BankAccount(int account_number, float balance){
        this.account_number = account_number;
        this.balance = balance;
    }

}

class SavingsAccount extends BankAccount{
    private float interest_rate;

    SavingsAccount(int account_number, float balance, float interest_rate){
        super(account_number, balance);
        this.interest_rate = interest_rate;
    }

    public int accNumGetter(){
        return this.account_number;
    }

    public float balanceGetter(){
        return this.balance;
    }

    public float interestRateGetter(){
        return this.interest_rate;
    }
}
