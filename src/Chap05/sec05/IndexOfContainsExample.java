package Chap05.sec05;

// 문자열 찾기
// 문자열에서 특정 문자열의 위치를 찾고자 할 때에는 indexOf() 메소드 사용

// 포함 여부 결과만 알고 싶은 경우 contains() 메소드 사용
public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println("프로그래밍이 시작 된 위치 : " + location);

        String substring = subject.substring(location);
        System.out.println(substring);

        location = subject.indexOf("자바");
        if(location != -1) {
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련 없는 책이군요.");
        }

        boolean result = subject.contains("Vue");
        if(result) {
            System.out.println("Vue와 관련된 책이군요.");
        } else {
            System.out.println("Vue와 관련 없는 책이군요.");
        }
    }
}
