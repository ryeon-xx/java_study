package Chap06.sec10.exam01;

// 정적 멤버 선언
// 정적 멤버 : 메소드 영역의 클래스에 고정적으로 위치하는 멤버
// static 키워드를 추가해 정적 필드와 정적 메소드로 선언

// 정적 멤버 사용
// - 클래스가 메모리로 로딩되면 정적 멤버를 바로 사용할 수 있음
// - 클래스 이름과 함께 도트(.) 연산자로 접근
// - 정적 필드와 정적 메소드는 객체 참조 변수로도 접근
public class Calculator {
    public static double pi = 3.14159;

    public static int plus(int x, int y) {
        return x + y;
    }

    public static int minus(int x, int y) {
        return x - y;
    }
}
