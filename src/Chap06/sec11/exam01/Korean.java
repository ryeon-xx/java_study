package Chap06.sec11.exam01;

// final 필드 선언
// - final 필드는 초기값이 저장되면 최종적인 값이 되어서
//   프로그램 실행 도중에 수정할 수 없게 됨
// final 타입 필드 [=초기값];

// final 필드 초기화
// - 필드 선언 시에 초기값을 대입
// - 생성자에서 초기값을 대입
public class Korean {
    // 인스턴스 final 필드 선언
    final String nation = "대한민국";
    final String ssn;

    // 인스턴스 필드 선언
    String name;

    // 생성자 선언
    public Korean (String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
