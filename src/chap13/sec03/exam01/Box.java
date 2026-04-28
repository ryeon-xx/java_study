package chap13.sec03.exam01;


// 제네릭 메소드
// - 타입 파라미터를 가지고 있는 메소드. 타입 파라미터가 메소드 선언부에 정의
// - 리턴 타입 앞에 < > 기호 추가하고 타입 파라미터 정의 후 리턴 타입과 매개변수 타입에서 사용
// - 타입 파라미터 T는 매개값의 타입에 따라 컴파일 과정에서 구체적인 타입으로 대체

public class Box <T>{
    // 필드
    private T t;

    // Getter 메소드
    public T get() {
        return t;
    }

    // Setter 메소드
    public void set(T t) {
        this.t = t;
    }
}
