package chap11.sec05;

// 예외 떠넘기기
// - 나열할 예외 클래스가 많으면 throws Exception 또는 throws Throwable로 모든 예외 더넘기기
// 리턴타입 메소드명 (매개변수, ...) throws Exception {
// }

// public static void main(String[] args) throws Exception {
// ...
// }

// 호출한 내가 처리하면 try-catch
// 호출한 나를 부른 메소드로 떠넘기면 throws

// 호출한 메소드에 떠넘겨진 경우에 호출한 메소드는
// 1) 스스로 예외처리를 할 수도 있고,
// 2) 또 떠넘길 수도 있다.

public class ThrowsExample2 {
    public static void main(String[] args) throws Exception {
        findClass();
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
