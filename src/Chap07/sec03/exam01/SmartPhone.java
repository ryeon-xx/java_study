package Chap07.sec03.exam01;

// SmartPhone() 실행 전에 Phone()이 먼저 만들어져야 함.
public class SmartPhone extends Phone{
    // 자식 생성자 선언
    public SmartPhone(String model, String color) {
        super(); // 부모인 Phone()을 호출해서 먼저 객체 생성
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨.");
    }
}
