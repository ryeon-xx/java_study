package Chap06.sec14;

/* 객체의 필드(데이터) 은닉
*  - 외부에서 직접 접근하는 경우 잘못된 데이터 입력 가능
*    -> 객체의 무결성(결점이 없는 성질)이 깨짐
*       - private 또는 디폴트 접근 제한자로 보호
*
* Setter 메서드
* - 데이터를 검증해서 유효한 값만 필드에 저장하는 메소드
*
* Getter 메서드
* - 필드값이 객체 외부에서 사용하기에 부적절한 경우, 적절한 값으로 변환해서 리턴할 수 있는 메소드
*
* - 필드에 대한 접근은 Getter, Setter 메서드로 접근
*
* - boolean 타입에 대한 Getter 메서드는 isXxxx()가 관례
* */
public class Car {
    // 필드 선언
    private int speed;
    private boolean stop;

    // speed 필드의 Getter/Setter 선언
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }

    // stop 필드의 Getter/Setter 선언
    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        if(stop == true) this.speed = 0;
    }
}
