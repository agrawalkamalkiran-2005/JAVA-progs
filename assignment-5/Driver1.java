/*
1. Write a program that creates a class Account that have members customer name, account number. 
Account has constructor to initialize its members and method display() to show the result. 
Create a child class Savings_Account that is derived from Account class. 
Savings_Account have members min_bal and saving_bal. Use show() to display its details. 
Then create another child class Account_details from Savings_Account class have members 
deposit, withdrawl and a method show1() to show its details. 
Child classes have constructors of their own. 
Create a driver class that creates a record of customer and display all its details.
*/
class Account {
    String customerName;
    int accountNumber;
    Account(String name, int accNo) {
        customerName = name;
        accountNumber = accNo;
    }
    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
    }
}
class Savings_Account extends Account {
    double min_bal;
    double saving_bal;
    Savings_Account(String name, int accNo, double min_bal, double saving_bal) {
        super(name, accNo);
        this.min_bal = min_bal;
        this.saving_bal = saving_bal;
    }
    void show() {
        display();
        System.out.println("Minimum Balance: " + min_bal);
        System.out.println("Saving Balance: " + saving_bal);
    }
}
class Account_details extends Savings_Account {
    double deposit, withdrawal;
    Account_details(String name, int accNo, double min_bal, double saving_bal, double deposit, double withdrawal) {
        super(name, accNo, min_bal, saving_bal);
        this.deposit = deposit;
        this.withdrawal = withdrawal;
    }
    void show1() {
        show();
        double balance = saving_bal + deposit - withdrawal;
        System.out.println("Deposit: " + deposit);
        System.out.println("Withdrawal: " + withdrawal);
        System.out.println("Updated Balance: " + balance);
    }
}
public class Driver1 {
    public static void main(String[] args) {
        Account_details obj = new Account_details("Kamal Agrawal", 12345, 10000,7000,2500, 1500);
        obj.show1();
    }
}
