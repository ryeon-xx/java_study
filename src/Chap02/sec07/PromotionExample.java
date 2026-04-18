package Chap02.sec07;

public class PromotionExample {
    public static void main(String[] args) {
        // 자동 타입 변환

        // int <- byte
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue : " + intValue);

        // int <- char
        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드 : " + intValue);

        // long <- int
        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue : " + longValue);

        // float <- long
        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue : " + floatValue);

        // double <- float
        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue : " + doubleValue);
    }
}
