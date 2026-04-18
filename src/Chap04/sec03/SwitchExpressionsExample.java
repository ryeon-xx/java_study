package Chap04.sec03;

// Java 12 이후, 표현식 사용하기
public class SwitchExpressionsExample {
    public static void main(String[] args) {
        char grade = 'a';

        switch (grade) {
            case 'A', 'a' -> {
                // 중괄호 생략 가능
                System.out.println("우수 회원입니다.");
            }
            case 'B', 'b' -> {
                System.out.println("일반 회원입니다.");
            }
            default -> {
                System.out.println("손님입니다.");
            }
        }
    }
}
