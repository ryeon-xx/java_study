package Chap05.sec06;

// 마지막 위치의 인덱스 값은 전체 개수보다 하나 작다.
public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        // 배열 변수 선언과 배열 생성
        String[] season = { "Sptring", "Summer", "Fall", "Winter" };

        // 배열의 항목값 읽기
        System.out.println("season[0] : " + season[0]);
        System.out.println("season[1] : " + season[1]);
        System.out.println("season[2] : " + season[2]);
        System.out.println("season[3] : " + season[3]);

        System.out.println("--------------------------------");

        // 인덱스 1번 항목의 값 변경
        season[1] = "여름";
        System.out.println("season[1] : " + season[1]);

        System.out.println("--------------------------------");

        // 배열 변수 선언과 배열 생성
        int[] scores = { 83, 57, 90 };

        // 총합과 평균 구하기
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        System.out.println("총합 : " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("평균 : " + avg);
    }
}
