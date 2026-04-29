package chap15.sec05.exam04;

import java.util.TreeSet;

// 방법 2는 TreeSet 객체 생성 시 비교기준을 구현한 클래스를 매개변수로 넣어줌.
// -> TreeSet이 자동 정렬 시 기준되는 compare()메소드에 따라 정렬됨.
public class ComparatorExample {
    public static void main(String[] args) {
        // 비교자를 제공한 TreeSet 컬렉션 생성
        TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());

        // 객체 저장
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));

        // 객체를 하나씩 가져오기
        for(Fruit f : treeSet) {
            System.out.println(f.name + " : " + f.price);
        }
    }
}
