package application;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private GamePanel gamePanel = new GamePanel();
    public MainFrame(){
        super("Game of Life");
        setLayout(new BorderLayout());
        add(gamePanel, BorderLayout.CENTER);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
