package MidTerm;

public class Question {
	
	private int left_operand;
	private int right_operand;
	private int correct_answer;
	
	public Question(String op) {
		left_operand = (int)(Math.random() * 10);
		right_operand = (int)(Math.random() * 10);
		if (op.equals("+"))
			correct_answer = left_operand + right_operand;
		else if (op.equals("x"))
			correct_answer = left_operand * right_operand;
		else
			System.out.println("This will never happen.");
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
	
//	public static void main(String[] args) {
//		Question q;
//		q = new Question("+");
//		System.out.println(q.leftOperand() + " + " + q.rightOperand());
//		System.out.println("answer = " + q.correctAnswer());
//		q = new Question("x");
//		System.out.println(q.leftOperand() + " x " + q.rightOperand());
//		System.out.println("answer = " + q.correctAnswer());
//	}
}
