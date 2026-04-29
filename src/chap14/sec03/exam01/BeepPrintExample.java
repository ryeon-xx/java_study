package chap14.sec03.exam01;

// 비프음이 5번 끝나고 난 뒤 띵 5번 출력
import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();  // 비프음 블사애

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // 0.5초 간 일시 정지
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // 0.5초간 일시 정지
            }
        }
    }
}
