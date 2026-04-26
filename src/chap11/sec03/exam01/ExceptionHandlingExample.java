package chap11.sec03.exam01;

// 다중 catch로 예외 처리하기
// - catch 블록의 예외 클래스는 try 블록에서 발생된 예외의 종류를 말함.
// - 해당 타입의 예외가 발생하면 catch 블록이 선택되어 실행
// - catch 블록이 여러 개라도 catch 블록은 단 하나만 실행됨.

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = { "100", "1oo" };

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "] : " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과됨 : " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없음 : " + e.getMessage());
            }
        }
    }
}
