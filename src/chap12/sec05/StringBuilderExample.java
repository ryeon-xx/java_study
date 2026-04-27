package chap12.sec05;

// StringBuilder 클래스
// - 잦은 문자열 변경 작업을 해야 한다면 String 보다는 StringBuilder가 좋음.
// - StringBuilder는 내부 버퍼에 문자열을 저장해두고 그 안에서 추가, 수정, 삭제 작업을 하도록 설계

//  리턴 타입           메소드 (매개변수)                    설명
// StringBuilder    append(기본값 | 문자열)            문자열을 끝에 추가
// StringBuilder    insert(위치, 기본값 | 문자열)       문자열을 지정 위치에 추가
// StringBuilder    delete(시작 위치, 끝 위치)          문자열 일부를 삭제
// StringBuilder    replace(시작 위치, 끝 위치, 문자열)  문자열 일부를 대체
// String           toString()                       완성된 문자열을 리턴

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")
                .insert(0, "ABC")
                .delete(3,4)
                .toString();
        System.out.println(data);
    }
}
