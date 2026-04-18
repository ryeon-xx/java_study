package Chap04.sec04;
// 카운트 변수로 float 사용은 피해야 함
public class FloatCounterExample {
    public static void main(String[] args) {
        for (float x = 0.1f; x <=1.0f; x+=0.1f) {
            System.out.println(x);
        }
    }
}
