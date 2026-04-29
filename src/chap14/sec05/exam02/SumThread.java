package chap14.sec05.exam02;

// 다른 스레드의 종료를 기다림
// - 어떤 스레드 A는 특정 스레드 B의 작업 결과를 바탕으로 동작
// - 스레드 A는 스레드 B의 작업이 끝날 때까지 하는 일 없이 기다려야 함.
//   -> 어떻게 스레드 B의 작업 종료를 인지할 수 있는가

// - join() 메소드
//    해당 스레드가 종료할 때까지 대기 하다가 스레드가 종료하면 실행을 재개

public class SumThread extends Thread{
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100 ; i++) {
            sum += i;
        }
    }
}
