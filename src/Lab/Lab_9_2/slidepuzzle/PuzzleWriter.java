package Lab.Lab_9_2.slidepuzzle;

import java.awt.*;
import javax.swing.*;

/** PuzzleWriter displays the contents of a slide puzzle */ 
public class PuzzleWriter extends JPanel { 
	private SlidePuzzleBoard board; 
	private int size; // 보드의 크기 
	private int piece_size = 30; // 퍼즐 조각의 크기 (단위: pixel)
	private int panel_width;  // 패널의 너비 
	private int panel_height; // 패널의 높이 
	
	/** Constructor - PuzzleWriter 그래픽스 윈도 
	 * @param b - 슬라이드 퍼즐 보드 
	 * @param s - 퍼즐 보드의 크기 s x s */
	public PuzzleWriter(SlidePuzzleBoard b, int s) { 
		board = b;
		size = s;
		panel_width = piece_size * size + 60; 
		panel_height = piece_size * size + 60; 
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("Slide Puzzle");
		f.setSize(panel_width, panel_height+22); 
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	/** paintPiece - 창의  i,j 위치에 퍼즐 조각 p를 그림 */ 
	private void paintPiece(Graphics g, PuzzlePiece p, int i, int j) { 
		int initial_offset = piece_size;
		int x_pos = initial_offset + (piece_size * j); 
		int y_pos = initial_offset + (piece_size * i);
		if (p != null) {
			g.setColor(Color.white);
			g.fillRect(x_pos, y_pos, piece_size, piece_size); 
			g.setColor(Color.black);
			g.drawRect(x_pos, y_pos, piece_size, piece_size); 
			g.drawString(p.valueOf() + "", x_pos + 10, y_pos + 20);
		} 
		else {
			g.setColor(Color.black);
			g.fillRect(x_pos, y_pos, piece_size, piece_size);
		} 
	}

	/** paintComponent - 프레임에 퍼즐 보드 그림 */ 
	public void paintComponent(Graphics g) { 
		g.setColor(Color.yellow);
		g.fillRect(0, 0, panel_width, panel_height); 
		PuzzlePiece[][] r = board.contents(); 
		for (int i = 0; i != size; i = i + 1) {
			for (int j = 0; j != size; j = j + 1) { 
				paintPiece(g, r[i][j], i, j); 
			}
		} 
	}
	
	/** displayPuzzle - 프레임에 현재 퍼즐 보드 그림 */ 
	public void displayPuzzle() { 
		this.repaint(); 
	}

	/** printError - 움직일 수 없는 퍼즐 조각을 선택한 경우 오류메시지 출력  
	 * @param s - 오류 메시지  */
	public void printError(String s) { 
		JOptionPane.showMessageDialog(null, "오류: " + s ); 
	} 
}

