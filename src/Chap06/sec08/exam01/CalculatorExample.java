package Chap06.sec08.exam01;

// 메소드 호출
// - 메소드 블록을 실제로 실행하는 것
// - 클래스로부터 객체가 생성된 후에 메소드는 생성자와 다른 메소드 내부에서
//   호출될 수 있고, 객체 외부에서도 호출될 수 있음
// - 외부 객체에서는 참조 변수와 도트(.) 연산자로 호출
public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();  // Calculator 객체 생성
        myCalc.powerOn();  // 리턴값이 없는 powerOn() 메소드 호출

        // plus 메소드 호출 시 5와 6을 매개값으로 제공하고,
        // 덧셈 결과를 리턴 받아 result1 변수에 대입
        int result1 = myCalc.plus(5,6);
        System.out.println("result1 : " + result1);


        int x = 10;
        int y = 4;
        //divide() 메소드 호출 시 변수 x와 y의 값을 매개값으로 제공하고,
        // 나눗셈 결과를 리턴 받아 result2 변수에 대입
        double result2 = myCalc.divide(x, y);
        System.out.println("result2 : " + result2);

        // 리턴값이 없는 powerOff() 메소드 호출
        myCalc.powerOff();
    }
}
