package bank.account;

public class Main {
    public static void main(String[] args) {
//        Open Account
        BankAccount bankAccount = new BankAccount("Emil" , 9000);

//        Success Transactions
        bankAccount.deposit(500);
        bankAccount.withDraw(200);
        bankAccount.deposit(300);

//        Failed transactions
        try{
            bankAccount.deposit(-20);
        }catch (IllegalArgumentException e){
            System.out.println("Caught: " + e.getMessage());
        }

        bankAccount.withDraw(20000);
        try{
            bankAccount.withDraw(-90);
        }catch (IllegalArgumentException e){
            System.out.println("Caught: " + e.getMessage());
        }

        bankAccount.printSummary();
    }
}