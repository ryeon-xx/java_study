package chap12.sec07;

// 랜덤 숫자 얻기
// Math.random()
//   0.0과 1.0 사이의 double 타입 난수를 리턴

// 생성자
// Random() - 현재 시간을 이용해서 종자값을 자동 설정한다.
// Random(long seed) - 주어진 종자값을 사용한다.

// 메소드
// 리턴값          메소드(매개변수)           설명
// boolean        nextBoolean()         boolean 타입의 난수를 리턴
// double         nextDouble()          double 타입의 난수를 리턴(0.0 <= ~ < 1.0)
// int            nextInt()             int 타입의 난수를 리턴(-2^32 <= ~ <= 2^32 -1)
// int            nextInt(int n)        int 타입의 난수를 리턴 (0 <= ~ <= n)

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        // 선택번호
        int[] selectNumber = new int[6];
        // 시드(seed)란?
        // 랜덤처럼 보이지만 정해진 공식으로 숫자를 뽑는 것.
        // 시드값이 같으면 항상 똑같은 순서로 숫자가 나옴
        Random random = new Random(3);
        System.out.print("선택 번호 : ");
        for (int i = 0; i < 6; i++) {
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.print(selectNumber[i] + "  ");
        }
        System.out.println();

        // 당첨번호
        int[] winningNumber = new int[6];
        // seed가 5면 항상 다른 고정된 숫자들
        random = new Random(3);
        System.out.print("당첨번호 : ");
        for (int i = 0; i < 6; i++) {
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.print(winningNumber[i] + "  ");
        }
        System.out.println();

        // 당첨여부, 비교하기 전에 배열 항목을 정렬
        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);
        boolean result = Arrays.equals(selectNumber, winningNumber);  // 배열 항목 비교
        System.out.print("당첨여부 : ");
        if(result) {
            System.out.println("1등에 당첨되셨습니다.");
        } else {
            System.out.println("당첨되지 않았습니다.");
        }
    }
}
