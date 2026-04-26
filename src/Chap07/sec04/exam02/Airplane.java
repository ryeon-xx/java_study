package Chap07.sec04.exam02;

// 부모 메소드 호출
// - 자식 메소드 내에서 super 키워드와 도트(.) 연산자를 사용하면 숨겨진 부모 메소드를 호출
// - 부모 메소드를 재사용함으로써 자식 메소드의 중복 작업 내용을 없애는 효과

public class Airplane {
    // 메소드 선언
    public void land() {
        System.out.println("착륙합니다.");
    }

    public void fly() {
        System.out.println("일반 비행합니다.");
    }

    public void takeOff() {
        System.out.println("이륙합니다.");
    }
}
