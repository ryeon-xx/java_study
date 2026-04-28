package chap13.sec05;

// 와일드카드 타입 파라미터
// - 제네릭 타입을 매개값이나 리턴 타입으로 사용할 때
//   범위에 있는 모든 타입으로 대체할 수 있는 타입 파라미터
// - ?로 표시

public class Person {
}

class Worker extends Person {
}

class Student extends Person{}

class HighStudent extends Student {}

class MiddleStudent extends Student {}
