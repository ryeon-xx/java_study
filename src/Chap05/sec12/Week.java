package Chap05.sec12;

// 한정된 값으로 이루어진 Enum 타입
// - 요일, 계절처럼 한정된 값을 갖는 타입
// - 먼저 열거 타입 이름으로 소스 파일(.java)을 생성하고 한정된 값을 코드로 정의
// - 열거 타입 이름은 첫 문자를 대문자로 하고 캐멀 스타일로 지어주는 것이 관례

    // 여기서 Week는 열거 타입 이름
public enum Week {

    // 열거 상수 목록(한정된 값 목록)
    MONDADY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
