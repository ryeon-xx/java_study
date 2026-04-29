package chap14.sec05.exam01;

// 일시 정지 상태
// - 스레드가 실행할 수 없는 상태
// - 스레드가 다시 실행 상태로 가기 위해서는 일시 정지 상태에서 실행 대기 상태로 가야 함.
// - Thread 클래스의 sleep() 메소드
//     실행 중인 스레드를 일정 시간 멈추게 함.
//     매개값 단위는 밀리세컨드(1/1000)

// - 자바에서는 초를 설정할 때 밀리세컨즈 단위를 사용함. 1000밀리세컨츠가 1초
// - For문 실행할 때마다 3초씩 잠깐 실행하지 않음.
// - CPU를 연결하는 것이므로 예외처리 반드시 필요함. (try-catch)

import java.awt.*;

public class SleepExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 10; i++) {
            toolkit.beep();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
        }
    }
}
