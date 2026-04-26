package Chap07.sec03.exam02;

// 자식 클래스
// 부모 클래스의 파라메터 생성자 호출하기 위해서는 super(변수, 변수)
public class SmartPhone extends Phone {
    // 자식 생성자 선언
    public SmartPhone(String model, String color) {
        super(model, color);
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨.");
    }
}
