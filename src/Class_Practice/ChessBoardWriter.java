import javax.swing.*;
import java.awt.*;

/*ChessBoardWriter - 패널에 과녁을 그림*/
public class ChessBoardWriter extends JPanel {
    private int number_of_rows;
    private int square_size;
    private int panel_width;
    private int offset = 20;

    /*Constructor ChessBoardWriter - 패널을 만들고 프레임을 씌움
     * @param rows - 각 열별 칸의 갯수
     * @param size - 한 칸의 길이 */
    public ChessBoardWriter(int rows, int size) {
        number_of_rows = rows;
        square_size = size;
        panel_width = number_of_rows * square_size + 2 * offset;

        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle("Chess Board");
        f.setSize(panel_width, panel_width + 22);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /*paintComponent - 패널에 그림을 그림
     * @param g - 그래픽스 펜*/
    public void paintComponent(Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(0, 0, panel_width, panel_width);
        paintBoard(offset, offset, number_of_rows, square_size, g);
    }

    private void paintBoard(int start_x, int start_y, int rows, int size, Graphics g) {
        for (int x = 0; x < rows; x = x + 1) {
            // loop invariant: x열까지 그렸음 (x증가 전)
            int x_position = start_x + x * size;
            for (int y = 0; y < rows; y = y + 1) {
                // loop invariant: x열의 y칸까지 그렸음 (x 증가 후, y 증가 전)
                int y_position = start_y + y * size;
                if ((x + y) % 2 == 0) //빨간색 칠하기
                    g.setColor(Color.red);
                else
                    g.setColor(Color.white);
                g.fillRect(x_position, y_position, size, size);
            }
        }
    }
}
