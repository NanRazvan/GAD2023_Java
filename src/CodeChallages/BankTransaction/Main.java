package CodeChallages.BankTransaction;

public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Alex", 500);
        BankAccount ba2 = new BankAccount("Ina", 700);

        System.out.println(ba1);
        System.out.println(ba2);

        TransactionThread transaction1 = new TransactionThread("Transaction 1", ba1, ba2, 200);
        TransactionThread transaction2 = new TransactionThread("Transaction 2", ba1, ba2, 300);

        transaction1.start();
        transaction2.start();
    }
}
