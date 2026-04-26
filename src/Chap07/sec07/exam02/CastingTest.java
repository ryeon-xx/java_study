package Chap07.sec07.exam02;

// 다시보기. 뭔가 잘 안되는..

// 강제 타입 변환
// - 부모 타입은 자식 타입으로 자동 변환되지 않음.
//   대신 캐스팅 연산자로 강제 타입 변환 가능
// 자식타입 변수 = (자식타입) 부모타입객체;
//              캐스팅 연산자

// Parent parent = new Child(); // 자동 타입 변환
// Child child = (Child) parent; // 객체 타입 변환

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Date;

public class CastingTest {
    public static void main(String[] s0) {
        List list = new ArrayList();
        list.add(new String("test")); // 자동형변환
        list.add(new Random());
        list.add(new Date());

        Object o = list.get(0);
        // System.out.println(o.charAt(0)); // 불가능
        String s = (String)list.get(0); // 강제형변환
        System.out.println(s.charAt(0)); // 가능
    }
}
