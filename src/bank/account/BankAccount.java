package bank.account;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String owner;
    private double balance;
    private List<String> transactions;

    public BankAccount(String owner, double initialBalance){
        setOwner(owner);
        setBalance(initialBalance);
        this.transactions = new ArrayList<>();
        transactions.add("Account opened with $" + initialBalance);
    }
//    GETTER
    public String getOwner(){return owner;}
    public double getBalance(){return balance;}
    public List<String> getTransactions(){return new ArrayList<>(transactions);}

//    SETTER
    public void setOwner(String owner){
        if (owner == null || owner.isEmpty()){
            throw new IllegalArgumentException("Owner cannot be empty.");
        }
        this.owner=owner;
    }
    public void setBalance(Double balance){
        if (balance < 0){
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance=balance;
    }
//    Transactions Methods
    public void deposit(double amount){
        if (amount <= 0 ){
            throw new IllegalArgumentException("Deposit amount must be positive. Got: " + amount);
        }
        balance += amount;
        transactions.add("Deposited:  $" + amount + "  →  Balance: $" + balance);
    }
    public void withDraw(double amount){
        if (amount <=0 ){
            throw new IllegalArgumentException("Withdrawal amount must be positive. Got: " + amount);
        }
        if (amount > balance) {
            System.out.println("Insufficient funds! Balance: $" + balance + " | Requested: $" + amount);
            transactions.add("FAILED withdrawal: $" + amount + " (insufficient funds)");
            return;
        }
        balance -=amount;
        transactions.add("Withdrawn:  $" + amount + "  →  Balance: $" + balance);
    }
//    Print Summary
    public void printSummary(){
        System.out.println("============================================");
        System.out.println("Account Owner: "+ owner);
        System.out.println("Current Balance: $"+ balance);
        System.out.println("============================================");
        System.out.println("Transaction history:");
        for (String t : transactions){
            System.out.println(" -" + t);
        }
        System.out.println("============================================");
    }
}