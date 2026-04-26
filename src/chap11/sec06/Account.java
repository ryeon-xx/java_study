package chap11.sec06;

// 예외 발생시키기
// - throw 키워드와 함께 예외 객체를 제공해 사용자 정의 예외를 직접 코드에서 발생시킬 수 있음
// - 예외의 원인에 해당하는 메시지를 제공하려면 생성자 매개값으로 전달

// 예외를 발생시켜서 던지겠다는 의미
// 던져진 Exception은
// 1) catch 블록으로 처리할 수 있고,
// 2) 메소드를 호출한 곳으로 떠넘길 수 있음.

public class Account {
    private long balance;

    public Account() {
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws InsufficientException {
        if(balance < money) {
            // 잔고보다 인출하는 금액이 많으면
            // InsufficientException 예외 발생.
            // 예외 관련 정보는 withdraw()를 호출한 메소드로 떠넘김.
            throw new InsufficientException("잔고 부족 : " + (money-balance) + "모자람");
        }
        balance -= money;
    }
}
