package Chap06.sec08.exam01;

// 메소드 선언
// 리턴 타입 : 메소드 실행 후 호출한 곳으로 전달하는 결과값의 타입
// ex) void (리턴 값 없는), double, int(리턴 값 있음)

// 메소드명 : 메소드명은 첫 문자를 소문자로 시작하고, 캐멀 스타일로 작성
// ex) run(), setSpeed(), getName() 등등

// 매개변수 : 메소드를 호출할 때 전달한 매개값을 받기 위해 사용
// int x, int y 등등?

// 실행 블록 : 메소드 호출 시 실행되는 부분
public class Calculator {
    // 리턴값이 없는 메소드 선언
    public void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    // 리턴값이 없는 메소드 선언
    public void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    // 호출 시 두 정수 값을 전달받고,
    // 호출한 곳으로 결과값 int를 리턴하는 메소드 선언
    public int plus(int x, int y) {
        int result = x + y;
        return result;  // 리턴값 지정;
    }

    // 호출 시 두 정수 값을 전달받고,
    // 호출한 곳으로 결과값 double을 리턴하는 메소드 선언
    public double divide(int x, int y) {
        double result = (double) x / y;
        return result;  // 리턴값 지정;
    }
}
