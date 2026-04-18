package Chap05.sec05;

// 문자열 분리
// 구분자가 있는 여러 개의 문자열을 분리할 때 split() 메소드를 사용
public class SplitExample {
    public static void main(String[] args) {
        String board = " 1, 자바 학습, 참조 타입 String을 학습합니다., 홍길동";

        String[] tokens = board.split(",");

        System.out.println("번호 : " + tokens[0]);
        System.out.println("제목 : " + tokens[1]);
        System.out.println("내용 : " + tokens[2]);
        System.out.println("성명 : " + tokens[3]);

        // for 문을 이용한 읽기
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }
}
