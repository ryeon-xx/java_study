package chap12.sec04;

// System 클래스
// - System 클래스의 정적 static 필드와 메소드를 이용하면 프로그램 종료,
//   키보드 입력, 콘솔(모니터) 출력, 현재 시간 읽기, 시스템 프로퍼티 읽기 등이 가능

/*      정적 멤버                   용도
* (필드)  out                 콘솔 (모니터)에 문자 출력
* (필드)  err                 콘솔 (모니터)에 에러 내용 출력
* (필드)  in                  키보드 입력
*
* (메소드) exit(int status)    프로세스 종료
* (메소드) currentTimeMilis()  현재 시간을 밀리초 단위의 long 값으로 리턴
* (메소드) nanoTime()          현재 시간을 나노초 단위의 long 값으로 리턴
* (메소드) getProperty()       운영체제와 사용자 정보 제공
* (메소드) getenv()            운영체제의 환경 변수 정보 제공
*
* */
public class ErrExample {
    public static void main(String[] args) {
        try {
            int value = Integer.parseInt("1oo");
        } catch (NumberFormatException e) {
            System.err.println("[에러 내용]");
            System.err.println(e.getMessage());
        }
    }
}
