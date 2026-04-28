package chap12.sec06;

// 포장 객체(Wrapper class, 랩퍼 클래스)
// - 기본 타입(byte, char, short, int, long, float, double, boolean)의 값을 갖는 객체
// - 기본 타입과 관련된 처리를 하는 메소드(기능)를 가지도록 클래스를 만듦.
// - Integer.parseInt(), Float.parseFloat() 등
// - 포장하고 있는 기본 타입의 값을 변경할 수 없고, 단지 객체로 생성하는 목적


// 박싱과 언박싱

// 박싱
// - 기본 타입 값을 포장 객체로 만드는 과정. 포장 클래스 변수에 기본 타입 값이 대입 시 발생

// 언박싱
// - 포장 객체에서 기본 타입 값을 얻어내는 과정. 기본 타입 변수에 포장 객체가 대입 시 발생


// 문자열을 기본 타입 값으로 변환
// - 포장 클래스는 문자열을 기본 타입 값으로 변환할 때도 사용.
// - 대부분의 포장 클래스에는 'parse+기본타입' 명으로 되어 있는 정적 메소드 있음

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        // Boxing
        Integer obj = 100;
        System.out.println("value : " + obj.intValue());

        // Unboxing
        int value = obj;
        System.out.println("value : " + value);

        // 연산 시 Unboxing
        int result = obj + 100;
        System.out.println("result : " + result);
    }
}
