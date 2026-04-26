package chap08.sec02;

// 구현 클래스 선언
// - 인터페이스에 정의된 추상 메소드에 대한 실행 내용이 구현

// - 객체 B
//    인터페이스에 선언된 추상 메소드와 동일한 선언부를 가진(재정의된) 메소드를 가지고 있어야 함.

// - 객체 A
//   인터페이스의 추상 메소드를 호출
//   인터페이스 구현 객체 B의 메소드 실행

// 구현 클래스 선언
// - implements 키워드는 해당 클래스가 인터페이스를 통해 사용할 수 있다는 표시이며,
// - 인터페이스의 추상 메소드를 재정의한 메소드가 있다는 뜻
// public class B implements 인터페이스명 { ... }

public class Television implements RemoteControl{
    @Override
    // 인터페이스에 선언된 turnOn() 추상 메소드 재정의
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
}
