package chap09.sec07.exam02;

// 익명 구현 객체
// - 인터페이스를 구현해서 생성되는 객체
// - 인터페이스 타입의 필드, 로컬변수, 매개변수의 값으로 대입할 수 있음
// - 안드로이드와 같은 UI 프로그램에서 이벤트를 처리하는 객체로 많이 사용
// new 인터페이스() {
//    // 필드
//    // 메소드
// }

public interface RemoteControl {
    // 추상 메소드
    void turnOn();
    void turnOff();
}
