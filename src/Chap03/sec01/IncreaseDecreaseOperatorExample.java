package Chap03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;  // 지금 쓰고 나중에 증가
        ++x;  // 먼저 증가하고 나서 씀
        System.out.println("x = " + x);
        System.out.println("--------------------");

        y--;
        --y;
        System.out.println("y = " + y);
        System.out.println("--------------------");

        z = x++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("---------------------");

        z = ++x;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("---------------------");

        z = ++x + y++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
