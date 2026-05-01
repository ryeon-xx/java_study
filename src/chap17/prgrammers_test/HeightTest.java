package chap17.prgrammers_test;

import java.util.Arrays;

public class HeightTest {
    public static void main(String[] args) {
        int[] array = { 149, 180, 192, 170 };
        int height = 167;
        // int height = 190;

        long result = Arrays.stream(array)
                .filter(value -> value > height)
                .count(); // long
        System.out.println(result);
    }
}