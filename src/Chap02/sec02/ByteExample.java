package Chap02.sec02;

public class ByteExample {
    public static void main(String[] args) {
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
        // byte var6 = 128;  // 컴파일 에러(Type mismatch : cannot convert from in byte)
        // byte 타입은 양수 127까지만 넣을 수 있음.
        // -> 해당 타입에 초과하는 값을 넣는 경우 번역시 (컴파일시) 에러남.

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
    }
}
