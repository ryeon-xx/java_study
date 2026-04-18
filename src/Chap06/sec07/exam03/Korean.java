package Chap06.sec07.exam03;

/* 생성자에서의 변수명
*   - 지역변수와 필드 변수명이 동일한 경우 지역변수로 해석
*   - 서로 다른 이름을 부여하는 경우 변수명 관리 힘들어짐
*   - this 키워드
*     : 현재 인스턴스에 대한 참조 변수
*     : 자동으로 생성됨
*     : this.변수명으로 필드 변수에 접근 가능
*  */

public class Korean {
    // 필드 선언
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자 선언
    public Korean (String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
