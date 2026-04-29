package chap15.sec05.exam03;

// 방법 1 : 비교하고 싶은 클래스 내 compareTo() 메소드 재정의
// TreeSet에 넣어주는 경우 자동정렬 기능이 있는데,
// 어떤 필드를 기준으로 정렬을 해야할지 모를 때 그 기준으로
// age로 하고 싶으면 Comparable 인터페이스의 compareTo() 메소드를 재정의해주면 됨.
// 크면 1, 같으면 0, 작으면 -1을 리턴하면서 자동으로 정렬함.

public class Person implements Comparable<Person>{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if(age < o.age) return -1;
        else if (age == o.age) return 0;
        else return 1;
    }
}
