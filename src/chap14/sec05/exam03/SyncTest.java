package chap14.sec05.exam03;


// Synchronized X
//  -> 제대로 동작하지 않음
public class SyncTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        Thread t1 = new Thread(bankAccount);
        Thread t2 = new Thread(bankAccount);

        t1.start();
        t2.start();
    }
}
