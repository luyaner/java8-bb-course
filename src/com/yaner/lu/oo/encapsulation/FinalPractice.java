package com.yaner.lu.oo.encapsulation;

public class FinalPractice {
    public static void main(String[] args) {
//        Account account = new Account(1, 1000D, 0.034D);
//        account.deposit(-90);
//        account.deposit(100);
//        System.out.println(account.getBalance());// should be 1100
//        account.withdraw(-90);
//        account.withdraw(12000);
//        account.withdraw(200);
//        System.out.println(account.getBalance());// should be 900
        Customer customer = new Customer("Jane", "Smith");
        Account account = new Account(1000, 2000D, 1.23D);
        customer.setAccount(account);
        Account janesAccount = customer.getAccount(); // oo
        janesAccount.deposit(100);
        janesAccount.withdraw(960);
        janesAccount.withdraw(2000);
        System.out.println(customer.getFirstName()
                + customer.getLastName()
                + janesAccount.getId()
                + janesAccount.getBalance()
                + janesAccount.getAnnualInterestRate());
    }
}

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public Account() {
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
            } else System.out.println("Please enter a valid amount.");
        } else System.out.println("Please enter a positive number.");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else System.out.println("Please enter a positive number.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}

class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer() {
    }

    public Customer(String firstName, String lastName, Account account) {
        this(firstName, lastName);
        this.account = account;
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
