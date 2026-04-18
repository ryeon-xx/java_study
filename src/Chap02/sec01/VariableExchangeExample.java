package Chap02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x : " + x + ", y : " + y);

        // temp : 임시 보관함 느낌
        int temp = x;  // temp = 3 (x값 보관)
        x = y;         // x = 5
        y = temp;      // y = 3(보관해뒀던 값 꺼내기)
        System.out.println("x : " + x + ", y : " + y);
    }
}
