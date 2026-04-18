package Chap06.sec08.exam02;

// 가변길이 매개변수
// - 메소드가 가변길이 매개변수를 가지고 있다면 매개변수의 개수와 상관없이 매개값을 줄 수 있음
// int sum(int ...values) { }
// - 메소드 호출 시 매개값을 쉼표로 구분해서 개수와 상관없이 제공할 수 있음
// - 매개값들은 자동으로 배열 항목으로 변환되어 메소드에서 사용됨
public class Computer {
    // 가변길이 매개변수를 갖는 메소드 선언
    int sum(int ...values) {
        // sum 변수 선언
        int sum = 0;

        // values는 배열 타입의 변수처럼 사용
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        // 합산 결과를 리턴
        return sum;
    }
}
