package chap12.sec04;

// 프로세스 종료
// - 프로세스 process
//    운영체제는 실행 중인 프로그램을 프로세스로 관리
//    자바 프로그램을 시작하면 JVM 프로세스가 생성
//      - 이 프로세스가 main() 메소드 호출
// - System.exit() 메소드로 현재 프로세스를 강제 종료 가능
//    System.exit(int status)
//    매개변수로 종료 상태 코드 지정
//      - 0 : 정상 종료(관례)
//      - 그 외 에러 상태를 나타내는 정수 지정

public class ExitExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // i값 출력
            System.out.println(i);
            if(i == 5) {
                // JVM 프로세스 종료
                System.out.println("프로세스 강제 종료");
                System.exit(0);
            }
        }
    }
}
