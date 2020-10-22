package Lab.Lab_6;

import java.awt.*;

/** BounceTheBall - 애니메이션 객체를 생성하고 공 운동 시작 */
public class BounceTheBall { 
	public static void main(String[] args) { 
		// 모델 객체 생성 
		int box_size = 200;
		int balls_radius = 6;
		Box box = new Box(box_size);
		// 공을 상자의 적절한 위치에 둠 
		MovingBall ball_1 = new MovingBall((int)(box_size / 3.0),
                                         	(int)(box_size / 5.0),
											+3, +5,
											balls_radius, box);
		MovingBall ball_2 = new MovingBall((int)(box_size / 5.0),
											(int)(box_size / 3.0),
											-3, 5,
											balls_radius, box);
		BallWriter ball_writer = new BallWriter(ball_1, ball_2, Color.red, Color.blue);
		BoxWriter box_writer  = new BoxWriter(box);
		AnimationWriter writer = new AnimationWriter(box_writer, ball_writer, box_size);
		// 컨트롤러 객체를 생성하고 애니메이션 시작 
		new BounceController(ball_1, ball_2, writer).runAnimation();
	}
}

