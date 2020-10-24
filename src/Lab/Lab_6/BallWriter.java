package Lab.Lab_6;

import java.awt.*;

/** BallWriter - 움직이는 공을 그림 */
public class BallWriter {

	private MovingBall ball_1;   // 공 객체
	private MovingBall ball_2;
	private Color balls_color_1; // 공의 색깔
	private Color balls_color_2;

	/** Constructor BallWriter
	 * @param x1 - 공 객체
	 * @param c1 - 공의 색깔 */
	public BallWriter(MovingBall x1,MovingBall x2, Color c1, Color c2) {
		ball_1 = x1;
		ball_2 = x2;
		balls_color_1 = c1;
		balls_color_2 = c2;
	}

	/** paint - 공 그리기
	 * @param g - 그래픽스 펜  */
	public void paintComponent(Graphics g) {
		g.setColor(balls_color_1);
		int radius1 = ball_1.radiusOf();
		g.fillOval(ball_1.xPosition() - radius1, ball_1.yPosition() - radius1,
				radius1 * 2, radius1 * 2);
		g.setColor(balls_color_2);
		int radius2 = ball_2.radiusOf();
		g.fillOval(ball_2.xPosition() - radius2, ball_2.yPosition() - radius2,
				radius2 * 2, radius2 * 2);
	}
}

