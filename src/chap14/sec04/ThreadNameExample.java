package chap14.sec04;

// 작업 스레드의 이름
// - 작업 스레드 이름을 Thread-n 대신 다른 이름으로 설정하려면
//   Thread 클래스의 setName() 메소드 사용
// thread.setName("스레드 이름");

// - 디버깅할 때 어떤 스레드가 작업을 하는지 조사하기 위해 주로 사용
// - 어떤 스레드가 실행하고 있는지 확인하려면 정적 메소드인 currentThread()로 스레드 객체의 참조를 얻은 다음 getName()메소드로 이름을 출력
// Thread thread = Thread.currentThread();
// System.out.println(thread.getName());

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        System.out.println(mainThread.getName() + "실행");  // 스레드 이름 리턴

        for (int i = 0; i < 3; i++) {
            Thread threadA = new Thread() {
                @Override
                public void run() {
                    System.out.println(getName() + "실행");  // 스레드 이름 리턴
                }
            };

            threadA.start();
        }

        Thread chatThread = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + "실행"); // 스레드 이름 리턴
            }
        };
        chatThread.setName("chat-thread");  // 작업 스레드 이름 변경
        chatThread.start();
    }
}
