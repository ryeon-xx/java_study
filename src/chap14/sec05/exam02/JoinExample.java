package chap14.sec05.exam02;

/*
*
* 1. main, sumThread 2개가 동시에 돌아가게 됨.
* 2. sumThread를 start()하면 run()과 main()이 동시에 실행됨.
* 3. 숫자를 다 더하는 sumThread가 먼저 끝나야 main스레드에서 총합을 프린트할 수 있음.
* 4. main 스레드에서 총합을 프린트하기 전에 main스레드는 sumThread가
*    다 run() 되기를 기다렸다가 프린트해야함.
*
* */


public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            sumThread.join();
        } catch (InterruptedException e) {

        }
        System.out.println("1 ~ 100 합 : " + sumThread.getSum());
    }
}
