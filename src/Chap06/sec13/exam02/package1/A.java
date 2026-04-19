package Chap06.sec13.exam02.package1;

// 생성자의 접근 제한
// - 생성자는 public, default, private 접근 제한을 가질 수 있음

// 생성자 선언
// [ public | private ] ClassName( - ) { - }

// 접근 제한자 : public
// 생성자 : 클래스( - )
// 설명 : 모든 패키지에서 생성자를 호출할 수 있다. = 모든 패키지에서 객체를 생성할 수 있다.

// 접근 제한자 : 공백 or default
// 생성자 : 클래스 ( - )
// 설명 : 같은 패키지에서만 생성자를 호출할 수 있다. = 같은 패키지에서만 객체를 생성할 수 있다.

// 접근 제한자 : private
// 생성자 : 클래스 ( - )
// 설명 : 클래스 내부에서만 생성자를 호출할 수 있다. = 클래스 내부에서만 객체를 생성할 수 있다.
public class A {
    // 필드 선언
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");

    // public 접근 제한 생성자 선언
    public A(boolean b) {
    }

    // default 접근 제한 생성자 선언
    A(int b) {
    }

    // private 접근 제한 생성자 선언
    private A(String s) {
    }
}
