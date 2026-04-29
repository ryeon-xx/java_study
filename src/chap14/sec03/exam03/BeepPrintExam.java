package chap14.sec03.exam03;

import java.awt.*;

// Thread 자식 클래스로 생성
// 방법 2) Thread 클래스를 상속한 다음 run() 메소드를 재정의
//     스레드가 실행할 코드를 작성
// 방법 3) 객체를 생성 혹은 Thread 익명 자식 객체를 사용 가능
/*
* public class WorkerThread extends Thread {
*   @Override
*   public void run() {
*       // 스레드가 실행할 코드
*   }
* }
*
* // 스레드 객체 생성
* Thread thread = new WorkerThread();
* thread.start();
*
* // 익명 클래스
* Thread thread = new Thread() {
*   @Override
*   public void run() {
*       // 스레드가 실행할 코드
*   }
* };
* thread.start();
*
* 1. Thread 객체를 만들어주고
* 2. start() 메소드 호출하면 스레드 대기상태가 됨.
*
* 스레드가 실행되는 내용은 run()메소드 안에 있는 처리 내용
*
* */
public class BeepPrintExam {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {

                    }
                }
            }
        };
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
        }
    }
}
