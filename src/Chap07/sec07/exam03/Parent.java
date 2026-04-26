package Chap07.sec07.exam03;

// 강제 타입 변환
// - 자식 객체가 부모 타입으로 자동 변환하면
//   부모 타입에 선언된 필드와 메소드만 사용 가능

public class Parent {
    // 필드 선언
    public String field1;

    // 메소드 선언
    public void method1() {
        System.out.println("Parent-method1()");
    }

    // 메소드 선언
    public void method2() {
        System.out.println("Parent-method2()");
    }
}
