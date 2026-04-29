package chap15;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        // 많은 양의 데이터를 다루는 부품류를 컬렉션
        // ==> 종류가 많다.
        // ==> 많은 양의 데이터들도 특징이 있고, 그 특징에 따라
        //     컬렉션의 종류가 많음.
        // ==> 배열 <-> 사이즈 조절 + 타입 아무거나 넣을 수 있는 ArrayList

        ArrayList list = new ArrayList();  // 참조형 변수
        list.add("홍길동");
        list.add(100);
        list.add(11.2);
        list.add(true);

        // toString() 생성되어 있어서 가리키는 값들이 프린트 됨.
        System.out.println(list);  // ["홍길동", 100, 11.2, true]

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        // 중간에 삽입
        list.add(0, "김길동");
        System.out.println(list);

        // 제거
        list.remove(0);  // 파괴함수(o), 비파괴함수 ???
        System.out.println(list);

        // 변경
        list.set(0,"정길동");  // 파괴함수(o)
        System.out.println(list);

        // index 위치 확인
        int index = list.indexOf(true);
        System.out.println(index);

        // 포함여부 확인
        boolean result = list.contains(11.2);
        System.out.println(result);

        System.out.println(list.isEmpty());
        list.clear();  // list 내용 전체 삭제!!

        System.out.println(list);
    }
}
