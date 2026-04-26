package Chap07.sec08.exam02;

// 매개변수 다형성
// - 메소드가 클래스 타입의 매개변수를 가지고 있을 경우.
//    호출할 때 동일한 타입의 자식 객체를 제공할 수 있음
// - 어떤 자식 객체가 제공되느냐에 따라서 메소드의 실행 결과가 달라짐(전략 strategy 패턴)
public class Vehicle {
    // 메소드 선언
    public void run() {
        System.out.println("차량이 달립니다.");
    }
}
