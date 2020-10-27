package MidTerm;

import javax.swing.JOptionPane;

public class Session {
	public void test() {
		String op, message, input;
		Question q;
		int score = 0;
		for (int i = 1; i <= 5; i++) {
			// 50% 확률로 연산자 선택하기
			if (Math.random() < 0.5)
				op = "+";
			else
				op = "x";
			// 문제 풀기
			if(op =="+")
				q = new Question("+");
				q.correctAnswer() = q.leftOperand() + q.rightOperand();
				score = score +20;

				else
			q = new Question("x");
				q.correctAnswer() = q.leftOperand() + q.rightOperand();
				score = score + 20;


			message = "[문제" + i + "]" + q.leftOperand() + op + q.rightOperand();
			input = JOptionPane.showInputDialog(message);
		}
		// 시험 성적 보여주기
		message = "어린이의 산수 시험 성적은 " + score + "점 입니다.";
		JOptionPane.showMessageDialog(null, message);
	}

	public void practice(String op) {
		Question q;
		String equation, input;
		for (int i = 1; i <= 5; i++) {
			// 1 문제 연습 서비스
			if(op == "+"){
				JOptionPane.showMessageDialog(null, message);
			}
		}
	}

//  테스트 코드
	public static void main(String[] args) {
		Session s = new Session();
		s.test();
		s.practice("+");
		s.practice("x");
	}
	
}
