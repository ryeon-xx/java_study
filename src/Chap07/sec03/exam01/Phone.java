package Chap07.sec03.exam01;

// 상속시 생성자
// - 부모객체부터 생성자를 호출해서 먼저 만들어 놓아야
//   자식을 만들 때 문제가 없다.

// 부모 생성자 호출
// - 자식 객체를 생성하면 부모 객체가 먼저 생성된 다음에 자식 객체가 생성해야함.
// - 부모의 생성자를 먼저 호출하게 함. super(); super(필드, 필드);
// 자식 클래스 변수 = new 자식클래스();

// - 부모 생성자는 자식 생성자의 맨 첫 줄에 숨겨져 있는 super()에 의해 호출
// // 자식 생성자 선언
//      public 자식클래스() {
//          super();   // super(매개값, ..);
//          ...
//      }

public class Phone {
    // 필드 선언
    public String model;
    public String color;

    // 기본 생성자 선언

    public Phone() {
        System.out.println("Phone() 생성자 실행");
    }
}
