package chap15.sec05.exam04;

import java.util.Comparator;


// 방법 2 : 비교하고 싶은 클래스에 사용할 비교 기준을 구현한 compare() 메소드 재정의

// 비교할 때 Fruit 클래스의 필드 중 어떤 필드로 크고 작은 것을 판단할지에 대한
// 기준을 compare() 메소드를 재정의해 정해줌.

public class FruitComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.price < o2.price ) return -1;
        else if (o1.price == o2.price) return 0;
        else return 1;
    }
}
