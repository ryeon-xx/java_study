package chap13.test;

// 제네릭(Generic) 이란?
// - 객체 생성 시 타입을 정할 수 있음.
// - 매개변수와 리턴 타입에 대해 타입 지정 가능
// - 형변환 불필요
// - 컴파일 시 강한 타입 체크 가능
// - 제네릭 타입이란 타입 파라미터를 가지는 제네릭 클래스와 인터페이스를 말함.

import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        // new를 가지고 ArrayList 객체를 만들어 쓸 때 Object으로 형변환되어 들어감.

        list.add("홍길동");  // 자동형변환 (업캐스팅)
        list.add("김길동");
        list.add("송길동");

        System.out.println(list);
        System.out.println(((String) list.get(0)).equals("홍길동")); // 강제형변환 (다운캐스팅)

        ArrayList list2 = new ArrayList();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        System.out.println(list2);
    }
}
