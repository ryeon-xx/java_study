package chap12.sec10;

// 정규 표현식
// - 문자 또는 숫자와 관련된 표현과 반복 기호가 결합된 문자열
// - 전화번호를 위한 정규 표현식
//     02-123-1234
//     02-124-5648
//  (02|010)-\d{3,4}-\d{4}
// 02나 010
// - 문자
// 숫자 3자리에서 4자리
// - 문자
// 숫자 4자리

// - 이메일을 위한 정규 표현식
//    white@naver.com
// \W+@\W+\.\W+\.\+)?
// 문자를 하나 이상
// @문자
// 문자를 하나 이상
// .문자
// 문자를 하나 이상
// 문자 문자를 하나 이상이거나 0 또는 1

// Pattern 클래스로 검증
// - java.util.regex 패키지의 Pattern 클래스
//    정규 표현식으로 문자열을 검증하는 matches() 메소드 제공
// boolean result = Pattern.matches("정규식", "검증할 문자열");

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-4567";
        boolean result = Pattern.matches(regExp, data);

        if(result) {
            System.out.println("정규식과 일치합니다.");
        } else {
            System.out.println("정규식과 일치하지 않습니다.");
        }

        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        // mycompany 뒤에 .이 빠짐.
        data = "angel@mycompanycom";
        result = Pattern.matches(regExp, data);
        if(result) {
            System.out.println("정규식과 일치합니다.");
        } else {
            System.out.println("정규식과 일치하지 않습니다.");
        }
    }
}
