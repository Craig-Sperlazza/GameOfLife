package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainFrame extends JFrame {
    private GamePanel gamePanel = new GamePanel();
    public MainFrame(){
        super("Game of Life");
        setLayout(new BorderLayout());
        add(gamePanel, BorderLayout.CENTER);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int code = e.getKeyCode();
                switch (code){
                    case 32 -> System.out.println("SpaceBar");
                    case 8 -> System.out.println("BackSpace");
                    case 10 -> gamePanel.randomize();
                }
            }
        });
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
