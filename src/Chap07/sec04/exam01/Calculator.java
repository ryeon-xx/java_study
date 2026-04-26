package Chap07.sec04.exam01;

// 오버라이드
// - 부모 클래스의 필드와 메서드를 자식 클래스에서 재정의해 사용 가능

// 메소드 오버라이딩
// - 상속된 메소드를 자식 클래스에서 재정의하는 것.
// - 해당 부모 메소드는 숨겨지고, 자식 메소드가 우선적으로 사용
// - 부모 메소드의 선언부(리턴 타입, 메소드 이름, 매개변수)와 동일해야 함 -> 완전히 같아야함.
// - 접근 제한을 더 강하게 오버라이딩할 수 없음(public -> private으로 변경 불가)
// - 새로운 예외를 throws 할 수 없음

public class Calculator {
    // 메소드 선언
    public double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return 3.14159 * r * r;
    }
}
