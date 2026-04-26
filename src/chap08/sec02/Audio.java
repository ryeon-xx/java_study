package chap08.sec02;

public class Audio implements RemoteControl{
    @Override
    // 인터페이스에 선언된 turnOn() 추상 메소드 재정의
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }
}
