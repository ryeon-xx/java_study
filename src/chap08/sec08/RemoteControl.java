package chap08.sec08;

// 다중 인터페이스
// - 구현 객체는 여러 개의 인터페이스를 통해 구현 객체를 사용할 수 있음
// - 인터페이스는 다중 상속도 가능하다.
// - 클래스는 여러 인터페이스를 구현할 수 있다.

// - 구현 클래스는 인터페이스 A와 인터페이스 B를 implements 뒤에 쉼표로 구분해서 작성해,
//   모든 인터페이스가 가진 추상 메소드를 재정의
// public class 구현클래스명 implements 인터페이스 A, 인터페이스 B {
//      // 모든 추상 메소드 재정의
//  }
public interface RemoteControl {
    // 추상 메소드
    void turnOn();
    void turnOff();
}
