package chap12.sec04;

// 진행 시간 읽기
// long currentTimeMillis  - 1/1000 초 단위로 진행된 시간을 리턴
// long nanoTime           - 1/10^9초 단위로 진행된 시간을 리턴

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        // 서버 성능 체크 시 소요 시간을 계산할 때 많이 사용.
        long time1 = System.nanoTime();
        int sum = 0;
        for (int i = 0; i <= 100000; i++) {
            sum += i;
        }
        long time2 = System.nanoTime();

        System.out.println("1~100000까지의 합 : " + sum);
        System.out.println("계산에 " + (time2 - time1) + " 나노초가 소요되었습니다.");
    }
}
