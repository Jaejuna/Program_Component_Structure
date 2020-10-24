package Lab.Lab_6;

import java.awt.*;

public class ObstacleWriter {

    private Color bar_color;

    public ObstacleWriter(Color c1){
        bar_color = c1;
    }

    public void paintComponent(Graphics g){
        g.setColor(bar_color);
        g.fillRect(65, 100, 80, 10);
    }
}
