package practice;

// 컴파일러가 자동으로 넣어줌(주석으로 처리)
// 개발자는 써주지 않음.
// import java.lang.*;


import javax.swing.*;
import java.awt.*;

public class Graphic {
    public static void main(String[] args) {
        // 버튼에 필요한 부품들 생각
        // J 붙어있는 것은 javax에 (extra)에 들어있는 것들
        // 틀 --> JFrame
        // 배치 --> FlowLayout
        // 버튼 --> JButton
        // 글자 --> Font
        // 색 --> Color

        // JFrame 클래스로 객체를 만들기
        // new --> 객체 생성과 관련 된 키워드
        JFrame frame = new JFrame("나의 첫 자바 프로그램");
        FlowLayout layout = new FlowLayout();
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();

        // Font는 변수 3개를 써줘야 가능
        // 객체 생성시 멤버변수들을 내가 원하는 값으로 초기화하고 하고 싶은 경우
        // "클래스 이름과 동일한 메서드" 만들어서 객체생성과
        // 동시에 초기화가 가능함. ==> 생성자 메서드(생성자, CONSTRUCTOR)
        // 객체 생성 시 클래스 이름과 동일한 메서드인 생성자 메서드가 있으면
        // 자동 호출 되면서 멤버변수 자동 초기화
        Font font = new Font("굴림", Font.ITALIC, 25);

        // 프레임은 가로/세로 설정이 꼭 있어야 한다.
        // 프레임은 밑에 설정에 맞게 보여지게 해야함.
        // 기본값은 보이는 것으로 설정을 바꾸어주어야 함.
        frame.setSize(500,500);

        // 프레임에 제목 설정
        // frame.setTitle("나의 첫 자바 프로그램"); or JFrame에 작성

        // 프레임에 레이아웃 설정
        frame.setLayout(layout);  // 왼쪽부터 붙이고, 가운데 정렬
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        // frame.add(new JButton("버튼5"));

        // 버튼에 들어갈 글자 설정
        button1.setText("버튼1");
        button2.setText("버튼2");
        button3.setText("버튼3");
        button4.setText("버튼4");

        // 버튼에 들어갈 색 설정
        button1.setBackground(Color.cyan);
        button2.setBackground(Color.pink);
        button3.setBackground(Color.GREEN);
        button4.setBackground(Color.ORANGE);

        // 버튼에 들어갈 폰트 설정
        button1.setFont(font);
        button2.setFont(font);
        button3.setFont(font);
        button4.setFont(font);

        // 맨 마지막에 써야함.
        frame.setVisible(true);
    }
}
