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
        System.out.println(name + " deposited " + amt + ", New Balance: " + balance);
    }
    void withdraw(double amt) throws MinimumBalanceException {
        if (balance - amt < 500)
            throw new MinimumBalanceException(name + ": Insufficient balance after withdrawal.");
        balance -= amt;
        System.out.println(name + " withdrew " + amt + ", Remaining Balance: " + balance);
    }
    void transfer(Account from, Account to, double amt) throws MinimumBalanceException {
        if (from.balance - amt < 500)
            throw new MinimumBalanceException(from.name + ": Transfer denied! Minimum balance of 500 required.");
        from.balance -= amt;
        to.balance += amt;
        System.out.println("Transferred " + amt + " from " + from.name + " to " + to.name);
    }
}
public class AccountTransferTest {
    public static void main(String[] args) {
        Account acc1 = new Account("Ravi", 101, 2000);
        Account acc2 = new Account("Sita", 102, 1000);

        try {
            acc1.transfer(acc1, acc2, 1700);
        } catch (MinimumBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
