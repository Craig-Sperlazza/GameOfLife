package application;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private final static int CELLSIZE = 50;

    private final static Color backgroundColor = Color.BLACK;
    private final static Color foregroundColor = Color.GREEN;
    private final static Color gridColor = Color.GRAY;

    private int topBottomMargin;
    private int leftRightMargin;


    public GamePanel() {
    }

    //note that swing calls this internally and checks for events. We do not call it anywhere
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();

        leftRightMargin = ((width % CELLSIZE) + CELLSIZE) / 2;
        topBottomMargin = ((height % CELLSIZE) + CELLSIZE) / 2;

        g2.setColor(backgroundColor);
        g2.fillRect(0, 0, width, height);

        g2.setColor(foregroundColor);
        g2.fillRect(leftRightMargin, topBottomMargin, width - (2 * leftRightMargin), height - (2 * topBottomMargin));
    }
}
