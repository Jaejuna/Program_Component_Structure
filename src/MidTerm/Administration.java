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
			if(input == "T"){
				session.test();
			}
			else if (input == "+"){
				session.practice("+");
			}
			else
				session.practice("x");
			// 서비스 선택
			// Cancel 버튼을 누르면 루프를 빠져나와 서비스를 끝내야 한다.
			// 힌트: Cancel 버튼을 선택하면 (input == null) 조건을 만족한다.
			// 주의: 문자열의 비교는 == 가 아닌 equals 메소드를 써야 한다.
		}
	}

}
