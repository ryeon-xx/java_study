package Chap06.sec08.exam03;

// return 문
// - 메소드의 실행을 강제 종료하고 호출한 곳으로 돌아간다는 의미
// - 메소드 선언에 리턴 타입이 있을 경우에는 return문 뒤에 리턴값을 추가로 지정해야함
// return [리턴값];

// - return문 이후에 실행문을 작성하면 'Unreachable code'라는 컴파일 에러가 발생
public class Car {
    // 필드 선언
    int gas;

    // 리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
    public void setGas(int gas) {
        this.gas = gas;
    }

    // 리턴값이 boolean인 메소드로 gas 필드값이 0이면 false를, 0이 아니면 true를 리턴
    public boolean isLetGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;  // false를 리턴하고 메소드 종료
        }
        System.out.println("gas가 있습니다.");
        return true;  // true를 리턴하고 메소드 종료
    }

    // 리턴값이 없는 메소드로 gas 필드값이 0이면 return 문으로 메소드를 종료
    public void run() {
        while(true) {
            if(gas > 0) {
                System.out.println("달립니다. (gas잔량 : " + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다. (gas잔량 : " + gas + ")");
                return;  // 메소드 종료
            }
        }
    }
}
