package chap08.sec10.exam02;

// 추상 메소드와 재정의
// - 자식 클래스들이 가지고 있는 공통 메소드를 뽑아내어 추상 클래스로 작성할 때,
//   메소드 선언부만 동일하고 실행 내용은 자식 클래스마다 달라야 하는 경우 추상 메소드를 선언할 수 있음
// - 일반 메소드 선언과의 차이점은 abstract 키워드가 붙고, 메소드 실행 내용인 중괄호 {} 가 없다.

public abstract class Animal {
    // 메소드 선언
    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    // 추상 메소드 선언
    public abstract void sound();
}
