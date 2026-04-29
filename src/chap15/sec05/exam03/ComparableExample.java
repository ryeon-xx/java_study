package chap15.sec05.exam03;

import java.util.TreeSet;

// Comparable 인터페이스의 compareTo()에 재정의된 대로
// age 필드로 자동정렬되어 들어간 것을 알 수 있음.
public class ComparableExample {
    public static void main(String[] args) {
        // TreeSet 컬렉션 생성
        TreeSet<Person> treeSet = new TreeSet<Person>();

        // 객체 저장
        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("감자바", 25));
        treeSet.add(new Person("박지원", 31));

        // 객체를 하나씩 가져오기
        for(Person person : treeSet) {
            System.out.println(person.name + " : " + person.age);
        }
    }
}
