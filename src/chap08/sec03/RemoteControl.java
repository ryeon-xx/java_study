package chap08.sec03;

// 상수 필드
// - 인터페이스는 public static final 특성을 갖는 불변의 상수 필드를 멤버로 가질 수 있음
// [public static final] 타입 상수명 = 값;
// - 인터페이스에 선언된 필드는 모두 public static final 특성
// - public static final 생략 가능
// - 상수명은 대문자로 작성하되. 서로 다른 단어로 구성되어 있을 경우에는 언더바(_)로 연결

public interface RemoteControl {
    // 상수 선언
    // - public static final이 앞에 생략됨
    // - 구현된 클래스들에 공유할 목적으로 인터페이스에 상수 선언 가능
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
}
