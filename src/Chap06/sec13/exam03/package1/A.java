package Chap06.sec13.exam03.package1;

// 필드와 메소드의 접근 제한
// - 필드와 메소드는 public, default, private 접근 제한을 가질 수 있음

// 필드 선언
// [ public | private ] 타입 필드;

// 메소드 선언
// [ public | private ] 리턴타입 메소드( - ) { - }

// 접근 제한자 : public
// 생성자 : 필드 / 메소드 ( - )
// 설명 : 모든 패키지에서 필드를 읽고 변경할 수 있다.
//       모든 패키지에서 메소드를 호출할 수 있다.

// 접근 제한자 : 공백 or default
// 생성자 : 필드 / 메소드 ( - )
// 설명 : 같은 패키지에서만 필드를 읽고 변경할 수 있다.
//       같은 패키지에서만 메소드를 호출할 수 있다.

// 접근 제한자 : private
// 생성자 : 필드 / 메소드 ( - )
// 설명 : 클래스 내부에서만 필드를 읽고 변경할 수 있다.
//       클래스 내부에서만 메소드를 호출할 수 있다.

public class A {
    // public 접근 제한을 갖는 필드 선언
    public int field1;

    // default 접근 제한을 갖는 필드 선언
    int field2;

    // private 접근 제한을 갖는 필드 선언
    private int field3;

    // 생성자 선언
    public A() {
        field1 = 1;  // o
        field2 = 1;  // o
        field3 = 1;  // o

        method1();   // o
        method2();   // o
        method3();   // o
    }

    // public 접근 제한을 갖는 메소드 선언
    public void method1() {  }

    // default 접근 제한을 갖는 메소드 선언
    void method2() {  }

    // private 접근 제한을 갖는 메소드 선언
    private void method3() {  }
}
