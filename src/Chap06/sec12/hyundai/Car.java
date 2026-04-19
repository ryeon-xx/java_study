package Chap06.sec12.hyundai;

// import 문
// - 다른 패키지에 있는 클래스를 사용하려면 import 문으로 어떤 패키지의 클래스를 사용하는지 명시
// - import 문은 패키지 선언과 클래스 선언 사이에 작성
// - import 키워드 뒤에는 사용하고자 하는 클래스의 전체 이름을 기술
//   -> 일반적으로 IDE의 자동 완성 기능으로 자동 추가 이용

// 다른 패키지에 있는 동일 이름의 클래스를 사용하기
// - 이름 충돌 때문에 import문 사용 불가
//   -> 전체 클래스 경로명을 사용

// import문으로 다른 패키지 클래스 사용을 명시
import Chap06.sec12.hankook.SnowTire;
import Chap06.sec12.kumho.AllSeasonTire;
public class Car {
    // 부품 필드 선언
    Chap06.sec12.hankook.Tire tire1 = new Chap06.sec12.hankook.Tire();
    Chap06.sec12.kumho.Tire tire2 = new Chap06.sec12.kumho.Tire();
    SnowTire tire3 = new SnowTire();
    AllSeasonTire tire4 = new AllSeasonTire();
}
