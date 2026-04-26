package chap11.sec06;

// 개발자가 Exception을 만들 수 있음.
// - 기본 생성자, String 매개변수 생성자 2개 만들어 줄 것.

// 사용자 정의 예외
// - 표준 라이브러리에는 없이 직접 정의하는 예외 클래스
// - 일반 예외는 Exception의 자식 클래스로 선언.
// - 실행 예외는 RuntimeException의 자식 클래스로 선언
public class InsufficientException extends Exception{
    public InsufficientException() {
    }

    public InsufficientException(String message) {
        super(message);
    }
}
