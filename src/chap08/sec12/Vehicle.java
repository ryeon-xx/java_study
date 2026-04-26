package chap08.sec12;

// instanceof 연산자
// - 인터페이스에도 객체 타입을 확인하기 위해 instanceof 연산자를 사용 가능
// if (vehicle instanceof Bus) {
//      // vehicle에 대입된 객체가 Bus일 경우 실행
// }

// - Java 12부터는 instanceof 연산의 결과가 true일 경우
//      -> 우측 타입 변수를 사용할 수 있기 때문에 강제 타입 변환이 필요 없음
// if (vehicle instanceof Bus bus) {
//      // bus 변수 사용
// }

public interface Vehicle {
    void run();
}
