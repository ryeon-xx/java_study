package chap14.sec05.exam03;

// 다른 스레드에게 실행 양보
// - yield() 메소드 : 실행되는 스레드는 실행 대기 상태로 돌아가고, 다른 스레드가 실행되도록 양보

// public void run() {
//    while(true) {
//        if(work) {
//            System.out.println("ThreadA 작업 내용");
//        } else {
//            Thread.yield();
//        }
//    }
// }

// 스레드 동기화 문제
// 여러 스레드가 동시에 메소드를 호출하면 이상하게 값이 변하는 문제가 발생한다.
// 스레드는 동시에 처리되는 프로그램임.
// 잔고가 1000인 경우
// 1. 사람1이 withdraw(400)을 호출함. 아직 처리되지 않음.
// 2. 사람1의 인출 과정이 처리 중인데 그 사이 사람2가 withdraw(400)을 호출함.
// 3. 두 사람의 인출 과정이 끝나면 둘 다 시작이 잔고가 1000이었으므로 최종 잔고는 600이 됨.
// 4. 순서가 없었기 때문에 이상한 결과가 나온 것임.

public class BankAccount extends Thread{
    private int balance = 1000;
    public void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " 출금 시도 중...");
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " 출금 완료. 남은 잔액: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " 출금 실패. 잔액 부족.");
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            withdraw(400);
        }
    }
}
