package Chap04.sec04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100 ; i++) {
            sum = sum + i;
            // sum += i; 도 가능
        }
        System.out.println("1 ~ 100까지의 합 : " + sum);
    }
}
