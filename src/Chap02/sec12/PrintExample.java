package Chap02.sec12;

public class PrintExample {
    public static void main(String[] args) {
        int value = 123;
        // %d : 정수
        System.out.printf("상품의 가격 : %d원\n", value);
        // %6d : 6자리 정수. 왼쪽 빈자리 공백
        System.out.printf("상품의 가격 : %6d원\n", value);
        // %-6d : 6자리 정수. 오른쪽 빈자리 공백
        System.out.printf("상품의 가격 : %-6d원\n", value);
        // %06d : 6자리 정수. 왼쪽 빈자리 0 채움
        System.out.printf("상품의 가격 : %06d원\n", value);

        double area = 3.14159 * 10 * 10;
        // %10.2f : 정수 7 자리 + 소수점 + 소수 2자리. 왼쪽 빈자리 공백
        System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area);
        // %-10.2f : 정수 7자리 + 소수점 + 소수 2자리. 오른쪽 빈자리 공백
        // %010.2f : 정수 7자리 + 소수점 + 소수 2자리. 왼쪽 빈자리 0 채움

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1 , name, job);

        // %s : 문자열
        // %6s : 6자리 문자열. 왼쪽 빈자리 공백
        // %-6s : 6자리 문자열. 오른쪽 빈자리 공백


        // 특수 문자
        // \t : 탭(tab)
        // \n : 줄바꿈
        // %% : %
    }
}
