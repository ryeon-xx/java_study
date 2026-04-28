package chap12.sec08;

// 날짜와 시간 비교
// - LocalDateTime 클래스는 날짜와 시간을 비교할 수 있는 메소드 제공
// 리턴 타입        메소드(매개변수)           설명
// boolean        isAfter(other)         이후 날짜인지?
// boolean        isBefore(other)        이전 날짜인지?
// boolean        isEqual(other)          동일 날짜인지?
// long           until(other, unit)      주어진 단위(unit) 차이를 리턴

// 특정 날짜, 시간 만들기
// LocalDateTime target = LocalDateTime.of(year, month, dayOfMonth, hour, minute, second);

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");

        LocalDateTime sdt = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
        System.out.println("시작일 : " + sdt.format(dtf));

        LocalDateTime edt = LocalDateTime.of(2021,12,31,0,0,0);
        System.out.println("종료일 : " + edt.format(dtf));

        if (sdt.isBefore(edt)) {
            System.out.println("진행중입니다.");
        } else if(sdt.isEqual(edt)) {
            System.out.println("종료합니다.");
        } else if (sdt.isAfter(edt)) {
            System.out.println("종료했습니다.");
        }


        // sdt.until(edt, ChronoUnit.XXX)
        // -> sdt(시작 날짜)부터 edt(끝 날짜)까지 남은 기간을 XXX 단위로 계산
        // -> ChronoUnit : 날짜/시간 단위를 나타내는 열거형 클래스

        // 남은 기간을 연도 단위로 계산
        // ex) 2026.04.28 ~ 2030.04.28 = 4년
        long remainYear = sdt.until(edt, ChronoUnit.YEARS);
        // 남은 기간을 월 단위로 계산 (연도 무시하고 전체 개월 수)
        // ex) 2026.04.28 ~ 2027.04.28 = 12개월
        long remainMonth = sdt.until(edt, ChronoUnit.MONTHS);
        // 남은 기간을 일 단위로 계산 (전체 날짜 수)
        // ex) 2026.04.28 ~ 2026.05.28 = 30일
        long remainDay = sdt.until(edt, ChronoUnit.DAYS);
        // 남은 기간을 시간 단위로 계산 (전체 시간 수)
        // ex) 1일 = 24시간
        long remainHour = sdt.until(edt, ChronoUnit.HOURS);
        // 남은 기간을 분 단위로 계산 (전체 분 수)
        // ex) 1시간 = 60분
        long remainMinute = sdt.until(edt, ChronoUnit.MINUTES);
        // 남은 기간을 초 단위로 계산 (전체 초 수)
        // ex) 1분 = 60초
        long remainSecond = sdt.until(edt, ChronoUnit.SECONDS);


        System.out.println("남은 해 : " + remainYear);
        System.out.println("남은 월 : " + remainMonth);
        System.out.println("남은 일 : " + remainDay);
        System.out.println("남은 시간 : " + remainHour);
        System.out.println("남은 분 : " + remainMinute);
        System.out.println("남은 초 : " + remainSecond);
    }
}
