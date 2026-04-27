package chap12.sec05;

// StringTokenizer 클래스
// - 문자열에 여러 종류가 아닌 한 종류의 구분자만 있다면 StringTokenizer를 사용할 수도 있음
//   StringTokenizer 객체를 생성 시 첫 번째 매개값으로 전체 문자열을 주고,
//   두 번째 매개값으로 구분자를 줌. 구분자를 생략하면 공백이 기본 구분자가 됨.

//     리턴 타입        메소드(매개변수)           설명
//       int           countTokens()        분리할 수 있는 문자열의 총 수
//      boolean        hasMoreTokens()      남아 있는 문자열이 있는지 여부
//      String         nextToken()          문자열을 하나씩 가져옴

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String[] arr = data1.split("&|,");

        for(String token : arr) {
            System.out.println(token);
        }
        System.out.println();

        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2, "/");
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
