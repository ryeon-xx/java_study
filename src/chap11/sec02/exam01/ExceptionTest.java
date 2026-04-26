package chap11.sec02.exam01;

// 발생한 문제만 실행하지 않는 예외라고 하고
// 이어서 실행할 수 있다.
// try-catch 이용.
public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("1. 나는 프린트가 잘 될 예정");

        try {
            // 문제가 발생할 것 같은 코드를 넣어주는 부분.
            System.out.println("2. 문제발생 코드 " + 10/0);
        } catch (Exception e) {
            System.out.println("에러 발생");
            System.out.println(e.getMessage());
        }
        System.out.println("3. 나는 과연 프린트가 될까요?");
    }
}
