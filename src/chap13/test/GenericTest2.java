package chap13.test;

import java.util.ArrayList;

// 객체 생성 시 타입을 정하고 싶을 때

public class GenericTest2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // new를 가지고 ArrayList 객체를 만들어 쓸 때 타입을 결정해서 쓸 수 있음.
        // 뒤에 나오는 <> 에는 타입 생략 가능
        // 하나의 타입만을 넣을 예정이면 불필요한 형변환 필요없음.
        // 객체 생성 시 타입을 정해서 사용 가능

        list.add("홍길동");
        list.add("김길동");
        list.add("송길동");
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(50);
        list2.add(10);
        System.out.println(list2);
    }
}
