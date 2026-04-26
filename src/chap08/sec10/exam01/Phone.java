package chap08.sec10.exam01;

// 추상 클래스(불완전한 클래스, 객체 생성 불가)
// - 객체를 생성할 수 있는 실체 클래스들의 공통적인 필드나 메소드를 추출해서 선언한 클래스
// - 추상 클래스는 실체 클래스의 부모 역할. 공통적인 필드나 메소드를 물려받을 수 있음

// - 추상메소드를 하나라도 가지면 무조건 추상 클래스

// 추상클래스를 상속받은 일반클래스는 무조건 추상메소드를 오버라이드 해주어야 한다.

// 추상 클래스 선언
// - 클래스 선언에 abstract 키워드를 붙임
// - new 연산자를 이용해서 객체를 직접 만들지 못하고 상속을 통해 자식 클래스만 만들 수 있다.

public abstract class Phone {
    // 필드 선언
    String owner;

    // 생성자 선언
    public Phone(String owner) {
        this.owner = owner;
    }

    // 메소드 선언
    void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }

    void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}
