import javax.swing.*;
import java.awt.*;

  /*  BullsEyeWriter - 패널에 과녁을 그림*/
public class BullsEyeWriter extends JPanel{
    private int rings;
    private int size;
    private int panel_width;
    private int offset = 20;


/*Constructor BullsEyeWriter - 패널을 만들고 프레임을 씌움
* @param number_of_rings - 과녁 내부 링의 갯수
* @param total_size - 과녁의 직경 */

    public BullsEyeWriter(int number_of_rings, int total_size){
        rings = number_of_rings;
        size = total_size;
        panel_width = size + 2 * offset;

        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle("Bull's Eys");
        f.setSize(panel_width, panel_width +22);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /*paintComponent - 패널에 그림을 그림
    * @param g - 그래픽스 펜*/
    public void paintComponent(Graphics g){
        g.setColor(Color.yellow);
        g.fillRect(0, 0, panel_width, panel_width);
        paintBullsEye(offset,offset, rings, size, g);
    }


    /*paintBullsEye - 과녁을 그림
    * @param x_position - 과녁의 좌상단 구석의 x 좌표
    * @param y_position - 과녁의 좌상단 구석의 y 좌표
    * @param rings - 과녁 내부 링의 갯수
    * @param size - 과녁의 직경
    * @param g - 그래픽스 펜 */
    private void paintBullsEye(int x_position, int y_position, int rings, int size, Graphics g){

        int count = 0;
        int diameter = size;
        int ring_width = size/rings;
        Color color = Color.red;
        while (count != rings) {
            int new_x_position = x_position + ring_width * count / 2;
            int new_y_position = y_position + ring_width * count / 2;
            g.setColor(color);
            g.fillOval(new_x_position, new_y_position, diameter, diameter);
            count = count +1;
            diameter = diameter - ring_width;
            if (color == Color.red)
                color = Color.white;
            else
                color = Color.red;
        }
    }

    public static void main(String[] args) {
        new BullsEyeWriter (10, 200);
    }
}
