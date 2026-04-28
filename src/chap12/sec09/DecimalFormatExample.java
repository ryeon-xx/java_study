package chap12.sec09;

// DecimalFormat
// - 숫자를 형식화된 문자열로 변환 -> 원하는 포맷으로 출력 가능
// DecimalFormat df = new DecimalFormat("#,###.0");
// string result = df.format(1234567.89);  // 1,234,567.9


// Format 형식 클래스
// - 숫자 또는 날짜를 원하는 형태의 문자열로 변환해주는 기능 제공
// - java.text 패키지에 정의


import java.text.DecimalFormat;

public class DecimalFormatExample {
    public static void main(String[] args) {
        double num = 1234567.89;

        DecimalFormat df;

        // 정수 자리까지 표기
        df = new DecimalFormat("#,###");
        System.out.println(df.format(num));

        // 무조건 소수 첫째 자리까지 표기
        df = new DecimalFormat("#,###.0");
        System.out.println(df.format(num));
    }
}
