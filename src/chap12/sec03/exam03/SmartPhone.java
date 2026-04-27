package chap12.sec03.exam03;

// Object으로 부터 상속받은 toString()을 오버라이드로 재정의해서 많이 씀.
public class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        return company + ", " + os;
    }
}
