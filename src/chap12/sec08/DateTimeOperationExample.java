package chap12.sec08;

// 날짜와 시간 조작
// - java.time 패키지의 LocalDateTime 클래스가 제공하는 메소드를 이용해 날자와 시간을 조작 가능
// - 책 대여일이 20일 경우 plusDays()로 해당 날짜를 구할 수 있음.
// - 날짜 / 시각을 원하는 포맷으로 출력 가능
// LocalDateTime now = LocalDateTime.now();


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();  // 년 월 일 시 분 초 구해온다.
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");  // 패턴 설정하는 객체
        System.out.println("현재 시간 : " + now.format(dtf));  // 패턴 설정하는 객체를 년 월 일 시 분 초 에 적용

        LocalDateTime result1 = now.plusYears(1);
        System.out.println("1년 덧셈 : " + result1.format(dtf));

        LocalDateTime result2 = now.minusMonths(2);
        System.out.println("2월 뺄셈 : " + result2.format(dtf));

        LocalDateTime result3 = now.plusDays(7);
        System.out.println("7일 덧셈 : " + result3.format(dtf));
    }
}
