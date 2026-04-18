package Chap04.sec07;

// Outter 는 라벨?(Label)
// 보통 break나 continue가 어느 반복문을 탈출해주는지 지정해주는데
// break는 자기를 감싸는 가장 가까운 반복문 하나만 탈출함
// 이중 for문이라서 이렇게 지정
public class BreakOutterExample {
    public static void main(String[] args) throws Exception {
        Outter: for(char upper='A'; upper <= 'Z'; upper++) {
            for(char lower='a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower);
                if(upper == 'D') {
                    break Outter;
                }
            }
        }
        System.out.println("프로그램 실행 종료");
    }
}
