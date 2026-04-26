package Chap07.sec02;

/* 상속(재사용) 개념
*  상속
*   - 클래스르 만들 때 기존에 있던 클래스를 이용해 확장해 만드는 것
*   - 기존 클래스를 재사용
*   - 부모 클래스의 필드와 메소드를 자식 클래스에게 물려줄 수 있음
*
*  부모 클래스/상위 클래스
*  Parent Class / Super Class
*
*  자식 클래스/하위 클래스
*  Child Class / Sub Class
*
*  직원
*  +name : String (+ : public, 누구든 접근 가능)
*   address : String( (공백) : default, 같은 패키지만 접근 가능)
*  #salary : int (# : protected, 같은 패키지 + 자식 클래스만 접근 가능)
*  -rrn : int (- : private, 자기 클래스 내부만 접근 가능)
*
*  상속의 이점
*   - 이미 개발된 클래스를 재사용하므로 중복 코드를 줄임
*   - 클래스 수정을 최소화
*
*  클래스 상속
*   - 자식 클래스를 선언할 때 어떤 부모로부터 상속받을 것인지를 결정하고,
*     부모 클래스를 다음과 같이 extends 뒤에 기술
*   public class 자식 클래스 extends 부모 클래스 {  }
*
*   - 다중 상속 허용하지 않음. extends 뒤에 하나의 부모 클래스만 상속
*   public class 자식 클래스 extends 부모클래스1, 부모클래스2 {  }  (X)
*
*   ! 단일 상속만!! 부모 크래스는 하나만! !
* */

public class Phone {
    // 필드 선언
    public String model;
    public String color;

    // 메소드 선언
    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String message) {
        System.out.println("자기 : " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("상대방 : " + message);
    }

    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }

}
