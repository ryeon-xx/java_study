package chap17.test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = { "홍길동", "신용권", "김미나" };

        // int, long, double 값 이외에는 "객체 스트림"으로 생성됨.
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(name -> System.out.print(name + " "));

        System.out.println();

        // int, long, double은 "기본 스트림"으로 생성됨.
        int[] intArray = { 1, 2, 3, 4, 5 };
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(n -> System.out.print(n + " "));

        System.out.println();
    }
}
