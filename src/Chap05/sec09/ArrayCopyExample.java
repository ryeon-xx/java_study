package Chap05.sec09;

// 배열 복사하기
// System 의 arraycopy() 메소드를 이용해 배열 복사 가능
// System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
// Object src : 원본 배열
// int srcPos : 원본 배열 복사 시작 인덱스
// Object dest : 새 배열
// int desPos : 새 배열 붙여놓기 시작 인덱스
// int length : 복사 항목 수
public class ArrayCopyExample {
    public static void main(String[] args) {
        // 길이 3인 배열
        String[] oldStrArray = { "java", "array", "copy" };

        // 길이 5인 배열
        String[] newStrArray = new String[5];

        // 배열 항목 복사
        System.arraycopy(oldStrArray, 0 ,newStrArray,0, oldStrArray.length);

        // 배열 항목 출력
        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }
}
