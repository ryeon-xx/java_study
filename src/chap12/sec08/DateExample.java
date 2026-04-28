package chap12.sec08;

// java.util 패키지
// Date - 날짜 정보를 전달하기 위해 사용
// Calendar - 다양한 시간대별로 날짜와 시간을 얻을 때 사용
// LocalDateTime - 날짜와 시간을 조작할 때 사용

// Date 클래스
// - 날짜를 표현하는 클래스로 객체 간에 날짜 정보를 주고받을 때 사용
// - Date() 생성자는 컴퓨터의 현재 날짜를 읽어 Date 객체로 만듦
// Date now = new Date();

import java.text.SimpleDateFormat;  // 날짜를 원하는 형식의 문자열로 변환해주는 클래스
import java.util.Date;              // 현재 날짜와 시간 정보를 담는 클래스

public class DateExample {
    public static void main(String[] args) {
        // 현재 날짜와 시간을 Date 객체로 생성
        // new Date() -> 컴퓨터의 현재 날짜 / 시간을 자동으로 읽어옴
        Date now = new Date();

        // Date 객체를 기본 toString()으로 출력
        // 출력 형식 예시 : Tue Apr 28 14:30:00 KST 2026 (영문, 읽기 불편)
        String strNow1 = now.toString();
        System.out.println(strNow1);

        // SimpleDateFormat - 날짜를 원하는 형식으로 바꿔주는 클래스
        // yyyy : 연도 (4자리)   ex) 2026
        // MM   : 월 (2자리)     ex) 04
        // dd   : 일 (2자리)     ex) 28
        // HH   : 시 (24시간)    ex) 14
        // mm   : 분 (2자리)     ex) 30
        // ss   : 초 (2자리)     ex) 00
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

        // sdf.format(now) -> Date 객체를 위에서 지정한 형식의 문자열로 변환
        // 출력 형식 예시 : 2026.04.28 14:30:00 (읽기 편함)
        String strNow2 = sdf.format(now);
        System.out.println(strNow2);
    }
}
