package Chap02.sec02;
// int 범위를 넘는 숫자를 long에 넣을 때는 L 또는 l을 붙어주어야 함.
public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
        // long var3 = 1000000000000;  // 컴파일러는 int로 간주하기 때문에 에러 발생
        long var4 = 1000000000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}
