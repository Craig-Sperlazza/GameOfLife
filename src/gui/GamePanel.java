package gui;

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

        g2.setColor(backgroundColor);
        g2.fillRect(leftRightMargin, topBottomMargin, width - (2 * leftRightMargin), height - (2 * topBottomMargin));

        drawGrid(g2, width, height);
        fillCell(g2, 5, 5, true);
        fillCell(g2, 5, 5, false);
        fillCell(g2, 4, 4, true);
        fillCell(g2, 3, 4, true);
        fillCell(g2, 0, 0, true);
    }

    private void drawGrid(Graphics2D g2, int width, int height) {
        g2.setColor(gridColor);
        //vertical lines
        for (int x = leftRightMargin; x <= width - leftRightMargin; x += CELLSIZE)
            g2.drawLine(x, topBottomMargin, x, height - topBottomMargin);
        //horizontal lines
        for (int y = topBottomMargin; y <= width - topBottomMargin; y += CELLSIZE)
            g2.drawLine(leftRightMargin, y, width - leftRightMargin, y);
    }

    private void fillCell(Graphics2D g2, int row, int col, boolean status) {
        Color color = status ? foregroundColor : backgroundColor;
        g2.setColor(color);
        int x = leftRightMargin + (col * CELLSIZE);
        int y = topBottomMargin + (row * CELLSIZE);
        g2.fillRect(x + 1, y + 1, CELLSIZE - 2, CELLSIZE - 2);
    }
}
