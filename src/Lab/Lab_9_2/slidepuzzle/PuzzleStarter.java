package Lab.Lab_9_2.slidepuzzle;

public class PuzzleStarter {

	public static void main(String[] args) {
		int SIZE = 4;
		SlidePuzzleBoard board = new SlidePuzzleBoard(SIZE);
		
		new PuzzleController(board, new PuzzleWriter(board, SIZE)).play();;
	}
}
