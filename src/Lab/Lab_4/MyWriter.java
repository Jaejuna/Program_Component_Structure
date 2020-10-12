package Lab.Lab_4;

import java.awt.*;
import javax.swing.*;

/* MyWriter - 문장를 디스플레이할 그래픽스 윈도를 만듬 */
public class MyWriter extends JPanel {
    private int width; // 프레임 너비
    private int height; // 프레임 높이
    private String sentence = ""; // 인쇄할 문장
    private int x_position; // 문장 위치 x 좌표
    private int y_position; // 문장 위치 y 좌표

    /* MyWriter - constructor 메소드
     * @param w - 창의 너비
     * @param h - 창의 높이 */
    public MyWriter(int w, int h) {
        width = w;
        height = h;
        x_position = width / 5;
        y_position = height / 2;
        JFrame my_frame = new JFrame();
        my_frame.getContentPane().add(this);
        my_frame.setTitle("MyWriter");
        my_frame.setSize(width + 16 , height + 39);
        my_frame.setVisible(true);
        my_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /* paintComponent - 화가 메소드
     * @param g - 그래픽 펜 */
    public void paintComponent(Graphics g) {
        makeBorder(g);
        g.setColor(Color.red);
        g.drawString(sentence, x_position, y_position);
    }

    /* making the border - 창 프레임에 테두리 두르기
     * @param pen - 그래픽 펜 */
    private void makeBorder(Graphics pen){
        pen.setColor(Color.darkGray);
        pen.fillRect(0, 0, width, height);
        pen.setColor(Color.LIGHT_GRAY);
        int size = 15;
        pen.fillRect(size, size, width - 2 * size, height - 2 * size);
    }

    /* writeSentence - 창에 문자열 인쇄
     * @param s - 인쇄할 문자열 */
    public void writeSentence(String s) {
        sentence = s;
        this.repaint();
    }

    /* repositionSentence - 위치를 이동하여 창에 문자열 인쇄
     * @param x - x 좌표
     * @param y - y 좌표 */
    public void positionSentence(int x, int y) {
        x_position = x;
        y_position = y;
        this.writeSentence(sentence); // this 생략 가능
    }
}