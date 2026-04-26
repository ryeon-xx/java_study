package chap11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length();  // data가 null 일 경우 NullPointerException 발생
        // 예외 발생 시 프로그램이 중단된다.
        System.out.println("문자 수 : " + result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisisJava");
        printLength(null);  // 매개값으로 null 대입
        System.out.println("[프로그램 종료]");
    }
}
