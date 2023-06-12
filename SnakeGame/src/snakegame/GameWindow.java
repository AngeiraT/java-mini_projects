package snakegame;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    public GameWindow() {
        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);


        GamePanel gamePanel = new GamePanel();
        add(gamePanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        gamePanel.startGame();

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GameWindow::new);
    }
}
