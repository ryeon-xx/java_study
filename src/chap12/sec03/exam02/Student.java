package chap12.sec03.exam02;

// 필드 하나당 값을 넣거나 꺼내는 메소드를 만들어 많이 사용함.
// 넣는 메소드 : setter, set필드명(매개변수) 메소드 형태
// 꺼내는 메소드 : getter, get필드명() 메소드 형태

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
