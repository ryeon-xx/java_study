package chap13.sec02.exam01;

// 제네릭 타입
// - 결정되지 않은 타입을 파라미터로 가지는 클래스와 인터페이스
// - 선언부에 '<>' 부호가 붙고 그 사이에 타입 파라미터들이 위치
// public class 클래스명 <A, B, ... > { ... }
// public interface 인터페이스명<A, B, ...> { ... }
// - 타입 파라미터는 일반적으로 대문자 알파벳 한 글자로 표현
// - 외부에서 제네릭 타입을 사용하려면 타입 파라미터에 구체적인 타입을 지정.
// - 지정하지 않으면 Object 타입이 암묵적으로 사용

public class Product <K, M> { // 타입 파라미터와 K와 M 정의
    // 타입 파라미터를 필드 타입으로 사용
    private K kind;
    private M model;

    // 타입 파라미터를 리턴 타입과 매개변수 타입으로 사용

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }

    public K getKind() {
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }
}
