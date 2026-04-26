package chap11.sec05;

// 예외 떠넘기기
// - 메소드 내부에서 예외 발생 시 throws 키워드 이용해 메소드를 호출한 곳으로 예외 떠넘기기
// - throws는 메소드 선언부 끝에 작성
// - 떠넘길 예외 클래슬르 쉼표로 구분해서 나열

public class ThrowsExample1 {
    public static void main(String[] args) {
        try {
            findClass();
        } catch(ClassNotFoundException e) {
            System.out.println("예외 처리 : " + e.toString());
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
