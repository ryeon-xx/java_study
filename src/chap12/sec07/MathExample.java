package chap12.sec07;

// Math 클래스
// - 수학 게산에 사용할 수 있는 정적 메소드 제공
// 절대값 : Math.abs()
// 올림값 : Math.ceil()
// 버림값 : Math.floor()
// 최대값 : Math.max()
// 최소값 : Math.min()
// 랜덤값 : Math.random()
// 반올림값 : Math.round()
public class MathExample {
    public static void main(String[] args) {
        // 큰 정수 또는 작은 정수 얻기
        double v1 = Math.ceil(5.3);
        double v2 = Math.floor(5.1);
        System.out.println("v1 = " + v1); // 6.0
        System.out.println("v2 = " + v2); // 5.0

        // 큰 값 또는 작은 값 얻기
        long v3 = Math.max(3, 7);
        long v4 = Math.min(1,9);
        System.out.println("v3 = " + v3);  // 7
        System.out.println("v4 = " + v4);  // 1

        // 소수 이하 두 자리 얻기
        double value = 12.3456;
        double temp1 = value * 100;
        long temp2 = Math.round(temp1);
        double v5 = temp2 / 100.0;
        System.out.println("temp1 = " + temp1);
        System.out.println("temp2 = " + temp2);
        System.out.println("v5 = " + v5);
    }
}
