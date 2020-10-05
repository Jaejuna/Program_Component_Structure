package HW;

import java.awt.*;
import javax.swing.*;
import java.time.*;
import java.util.Calendar;

public class HW_2 extends JPanel {

    private int width = 200;

    public HW_2() {
        // 프레임 생성
        JFrame clock_frame = new JFrame();

        // 자신(패널)을 프레임에 끼우기
        clock_frame.getContentPane().add(this);

        // 프레임 만들어 보여주기
        clock_frame.setTitle("Clock");
        clock_frame.setSize(width,width);
        clock_frame.setVisible(true);
        clock_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        // 바탕은 흰색으로
        g.setColor(Color.white);
        g.fillRect(0, 0, width, width);

        // 현재 시간 + 시침, 분침, 초 각도 계산
        LocalTime now = LocalTime.now();
        int seconds_angle = 90 - now.getSecond() * 6;
        int minutes_angle = 90 - now.getMinute() * 6;
        int hours_angle = 90 - now.getHour() * 30;

        //디지털 시계 만들기
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);
        int AmPm = calendar.get(Calendar.AM_PM);


        //눈금 추가하기

        // 시계 판 그리기
        int x = 50;
        int y = 50;
        int diameter = 100;

        // 초침 그리기
        g.setColor(Color.black);
        //시계판 setColor 에서 불러와 그리기
        g.drawOval(x, y, diameter, diameter);
        g.fillArc(x+10, x+10, diameter-20, diameter-20, seconds_angle, -3);

        // 분침 그리기
        g.setColor(Color.red);
        g.fillArc(x+5, x+5, diameter-10, diameter-10, minutes_angle, -5);

        // 시침 그리기
        g.setColor(Color.blue);
        g.fillArc(x+25, x+25, diameter-50, diameter-50, hours_angle, -8);
    }

    public static void main(String[] args) {
        new HW_2();
    }
}