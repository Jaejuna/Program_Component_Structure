package Lab.Lab_6;

/** BounceController - 상자 안에서 움직이는 공 제어 */
public class BounceController {
	private MovingBall ball_1, ball_2;  // 공 객체 (Model)
	private AnimationWriter writer; // 애니메이션 객체 (Output-View)

	/** Constructor BounceController 컨트롤러 초기화
	 * @param b1 - 공 객체 (Model)
	 * @param w - 애니메이션 객체 (Output-View)  */
	public BounceController(MovingBall b1, MovingBall b2, AnimationWriter w) {
		ball_1 = b1;
		ball_2 = b2;
		writer = w;
	}

	/** runAnimation - 내부 시계를 활용하여 애니메이션 구동 */
	public void runAnimation() {
		int time_unit = 1;    // 애니메이션 스텝의 시간 단위
		int painting_delay = 20;  // 다시 그리기 사이의 지연 시간 간격
		while (true) {
			delay(painting_delay);
			ball_1.move(time_unit);
			ball_2.move(time_unit);
			System.out.println("A--" + ball_1.xPosition() + ", " + ball_1.yPosition());
			System.out.println("B--" + ball_2.xPosition() + ", " + ball_2.yPosition());
			writer.repaint();
		}
	}

	/** delay - how_long millisecond 동안 실행 정지  */
	private void delay(int how_long) {
		try { Thread.sleep(how_long); }
		catch (InterruptedException e) { }
	}
}