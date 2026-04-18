package Chap05.sec04;

// Garbage Collector
// 더 이상 사용하지 않는 메모리 영역(garbage)을 회수 하는 역할
// 자바 가상 머신이 주기적으로 실행
// - 개발자는 메모리 회수에 신경 쓸 필요 없음!
public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null; // "여행"에 해당하는 String 객체를 쓰레기로 만듦

        String kind1 = "자동차";
        String kind2 = kind1;  // kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입

        kind1 = null;  // "자동차"에 해당하는 String 객체는 쓰레기가 아님
        System.out.println("kind2 : " + kind2);
    }
}
