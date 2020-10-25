package HW;

import java.awt.*;
import javax.swing.*;
import java.time.*;
import java.util.Calendar;

public class HW_5 extends JPanel {

    private int width = 400;
    private int height = 400;
    Font clockFont;

    public HW_5() {

        // 프레임 생성
        JFrame clock_frame = new JFrame();

        // 자신(패널)을 프레임에 끼우기
        clock_frame.getContentPane().add(this);

        // 프레임 만들어 보여주기
        clock_frame.setTitle("Clock");
        clock_frame.setSize(width, height);
        clock_frame.setVisible(true);
        clock_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        clockFont = new Font("Serif", Font.BOLD, 20);

    }

    public void paintComponent(Graphics g) {
        // 바탕은 흰색으로
        g.setColor(Color.white);
        g.fillRect(0, 0, width, height);

        // 현재 시간 + 시침, 분침, 초 각도 계산
        LocalTime now = LocalTime.now();
        int s_angle = 90 - now.getSecond() * 6;
        int m_angle = 90 - now.getMinute() * 6;
        int h_angle = 90 - now.getHour() * 30;

        // 시계 판 그리기
        int x = 50;
        int y = 50;
        int diameter = 100;

        // 초침 그리기
        g.setColor(Color.black);
        g.drawOval(x + 70, y, diameter, diameter);       //검은색 시계판
        g.fillArc(x + 80, x + 10, diameter - 20, diameter - 20, s_angle, -3);

        g.drawRect(50, 170, 260, 40);      //디지털 시계 직사각형
        g.setFont(clockFont);                             //Font Setting
        g.drawString(timeNow(), 70, 200);

        //눈금 추가하기
        g.fillArc(x + 115, 50, 10, 20, 90, -1);   //12시 눈금
        g.fillArc(x + 125, 55, 30, 30, 60, -5);   //1시 눈금
        g.fillArc(x + 135, 70, 30, 30, 30, -5);   //2시 눈금
        g.fillArc(x + 160, 90, 10, 20, 0, -1);   //3시 눈금
        g.fillArc(x + 135, 100, 30, 30, -30, -5);   //4시 눈금
        g.fillArc(x + 125, 115, 30, 30, -60, -5);   //5시 눈금
        g.fillArc(x + 115, 140, 10, 20, 90, -1);   //6시 눈금
        g.fillArc(x + 90, 115, 30, 30, -120, -5);   //7시 눈금
        g.fillArc(x + 75, 105, 30, 30, -150, -5);   //8시 눈금
        g.fillArc(x + 65, 90, 10, 20, 0, -1);   //9시 눈금
        g.fillArc(x + 75, 70, 30, 30, 150, -5);   //10시 눈금
        g.fillArc(x + 85, 55, 30, 30, 120, -5);   //11시 눈금

        // 분침 그리기
        g.setColor(Color.red);
        g.fillArc(x + 75, x + 5, diameter - 10, diameter - 10, m_angle, -5);

        // 시침 그리기
        g.setColor(Color.blue);
        g.fillArc(x + 95, x + 25, diameter - 50, diameter - 50, h_angle, -8);


        runAnimation();
    }

    public void runAnimation() {
        int painting_delay = 20;
        while (true) {
            delay(painting_delay);
            repaint();
        }
    }

    private void delay(int how_long) {
        try {
            Thread.sleep(how_long);
        } catch (InterruptedException e) {
        }
    }

    public String timeNow() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        String time = year + "년:" + month + "월:" + date + "일:" +
                zero(hour) + ":" + zero(minute) + ":" + zero(second);

        return time;
    }

    public String zero(int num) {
        String number = (num < 10) ? ("0" + num) : ("" + num);

        return number;
    }

    public static void main(String[] args) {
        new HW_5();
    }
}