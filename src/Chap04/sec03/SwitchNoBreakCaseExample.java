package Chap04.sec03;

// switch case는 break가 없으면 stop하지 않고 계속 진행.
public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = (int)(Math.random()*4) + 8;
        System.out.println("현재 시간 : " + time + "시");

        switch (time) {
            case 8 :
                System.out.println("출근합니다.");
            case 9 :
                System.out.println("회의를 합니다.");
            case 10 :
                System.out.println("업무를 봅니다.");
            default :
                System.out.println("외근을 나갑니다.");
        }
    }
}
