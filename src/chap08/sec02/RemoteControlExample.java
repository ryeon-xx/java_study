package chap08.sec02;

// 변수 선언과 구현 객체 대입
// - 인터페이스는 참조 타입에 속하므로 인터페이스 변수에는
//   객체를 참조하고 있지 않다는 뜻으로 null을 대입할 수 있음
// RemoteControl rc;
// RemoteControl rc = null;

// - 인터페이스를 통해 구현 객체를 사용하려면, 인터페이스 변수에 구현 객체의 번지를 대입해야 함
// rc = new Television();
public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        // rc 변수에 Television 객체를 대입
        rc = new Television();  // 자동형변환
        rc.turnOn();

        // rc 변수에 Audio 객체를 대입(교체시킴)
        rc = new Audio();  // 자동형변환
        rc.turnOn();
    }
}
