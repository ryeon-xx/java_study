package chap14.sec05.exam03;

// Synchronized O
// -> 제대로 동작함.

public class SyncTest2 {
    public static void main(String[] args) {
        BankAccount2 bankAccount2 = new BankAccount2();

        Thread t1 = new Thread(bankAccount2);
        Thread t2 = new Thread(bankAccount2);

        t1.start();
        t2.start();
    }
}
