package MidTerm;

public class Question {
	
	private int left_operand;
	private int right_operand;
	private int correct_answer;
	
	public Question(String op) {
		left_operand = (int)(Math.random() *10);
		right_operand = (int)(Math.random() *10);
		if (op == "x")
			correct_answer = left_operand * right_operand;
		else
			correct_answer = left_operand + right_operand;
	}
	
	public int leftOperand() {
		return left_operand;
	}
	
	public int rightOperand() {
		return right_operand;
	}
	
	public int correctAnswer() {
		return correct_answer;
}
	
//  테스트 코드
	public static void main(String[] args) {
		Question q;
		q = new Question("+");
		System.out.println(q.leftOperand() + " + " + q.rightOperand());
		System.out.println("answer = " + q.correctAnswer());
		q = new Question("x");
		System.out.println(q.leftOperand() + " x " + q.rightOperand());
		System.out.println("answer = " + q.correctAnswer());
	}
}
