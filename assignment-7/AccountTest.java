class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String msg) {
        super(msg);
    }
}
class Account {
    String name;
    int acc_no;
    double balance;
    Account(String name, int acc_no, double balance) {
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }
    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt + ", New Balance: " + balance);
    }
    void withdraw(double amt) throws MinimumBalanceException {
        if (balance - amt < 500)
            throw new MinimumBalanceException("Withdrawal denied! Minimum balance of 500 must be maintained.");
        balance -= amt;
        System.out.println("Withdrawn: " + amt + ", Remaining Balance: " + balance);
    }
}
public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account("Rahul", 101, 1000);
        try {
            a1.withdraw(600);
        } catch (MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
