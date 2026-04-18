package Chap06.sec07.exam04;

/* 생성자 오버로딩
*  - 매개변수를 달리하는 생성자를 여러 개 선언하는 것
*  - 매개변수의 타입, 개수, 순서가 똑같을 경우 매개변수 이름만 바꾸는 것은 생성자 오버로딩이 아님
*  - 생성자가 오버로딩 되어 있을 경우, new 연산자로 생성자를 호출할 때 제공되는
*    매개값의 타입과 수에 따라 실행될 생성자가 결정
* */
public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자 선언
    Car() {}

    Car(String model) {
        this.model = model;
    }

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
