package MidTerm;

import javax.swing.JOptionPane;

public class Administration {
	
	private Session session;
	
	public Administration(Session s) {
		session = s;
	}

	public void serviceOn() {
		String message, input;
		boolean processing = true;
		while (processing) {
			message = "다음 중 하나를 입력하세요: T(시험), +(덧셈연습), x(곱셈연습)";
			input = JOptionPane.showInputDialog(message);
			if (input == null)
				processing = false;
			else if (input.equals("T"))
				session.test();
			else if (input.equals("+") || input.equals("x"))
				session.practice(input);
		}
	}

}
