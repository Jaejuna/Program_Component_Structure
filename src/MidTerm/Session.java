package MidTerm;

import javax.swing.JOptionPane;

public class Session {

	public void test() {
		String op, message, input;
		Question q;
		int score = 0;
		for (int i = 1; i <= 5; i++) {
			if (Math.random() < 0.5)
				op = "+";
			else
				op = "x";
			q = new Question(op);
			message = "[문제 " + i + "] " + q.leftOperand() + " " + op + " " + q.rightOperand() + "?";
			input = JOptionPane.showInputDialog(message); // Cancel 버튼은 누르지 않고, 반드시 정수 문자열만 입력한다고 가정  
			if (Integer.parseInt(input) == q.correctAnswer())
				score += 1;
		}
		message = "어린이의 산수 시험 성적은 " + (score * 20) + "점 입니다.";
		JOptionPane.showMessageDialog(null, message);
	}

	public void practice(String op) {
		Question q;
		String equation, input;
		for (int i = 1; i <= 5; i++) {
			q = new Question(op);
			equation = q.leftOperand() + " " + op + " " + q.rightOperand();
			input = JOptionPane.showInputDialog(equation + "?"); // Cancel 버튼은 누르지 않고, 반드시 정수 문자열만 입력한다고 가정
			while (Integer.parseInt(input) != q.correctAnswer()) {
				input = JOptionPane.showInputDialog("오답. 다시 해보세요. " + equation + "?");  // Cancel 버튼은 누르지 않고, 반드시 정수 문자열만 입력한다고 가정
			}
			JOptionPane.showMessageDialog(null, "맞았습니다! "+ equation + " = " + q.correctAnswer());
		}
	}

//	public static void main(String[] args) {
//		Session s = new Session();
//		s.test();
//		s.practice("+");
//		s.practice("x");
//	}
	
}
