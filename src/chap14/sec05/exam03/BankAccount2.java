package chap14.sec05.exam03;

// 동기화 메소드와 블록
// - 스레드 작업이 끝날 때까지 객체에 잠금을 걸어 스레드가
//   사용 중인 객체를 다른 스레드가 변경할 수 없게 함.

// 동기화 (순서를 정한다라는 의미 <-> 비동기) 메소드 및 블록 선언
// - 인스턴스와 정적 메소드에 synchronized 키워드 붙임
// - 동기화 메소드를 실행 즉시 객체는 잠금이 일어나고, 메소드 실행이 끝나면 잠금 풀림
// - 메소드 일부 영역 실행 시 객체 잠금을 걸고 싶다면 동기화 블록을 만듦

// 동기화 방법 1) 메소드
// 동기화 방법 2) 객체
// synchronized -> 스레드간 메소드, 변수 등을 접근 시 순서 제어 가능
public class BankAccount2 extends Thread{
    private int balance = 1000;
    public synchronized void withdraw(int amount) {
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
