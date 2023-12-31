package snakegame;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;
    private boolean running;
    private Thread gameThread;

    public GamePanel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        requestFocus();
        addKeyListener(new GameKeyListener());
    }

    public void startGame() {
        running = true;
        gameThread = new Thread(this::runGame);
        gameThread.start();
    }

    private void runGame() {
        while (running) {
            updateGame();
            repaint();
            try {
                Thread.sleep(100); // Adjust the speed of the game here (in milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void updateGame() {
        // Update the game state here
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Rendering code goes here
    }

    private class GameKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            // Handle user key input here
            int keyCode = e.getKeyCode();
            
            // Handle the key press event
            if (keyCode == KeyEvent.VK_UP) {
                // Handle up arrow key press
                // Example: snake.moveUp();
            } else if (keyCode == KeyEvent.VK_DOWN) {
                // Handle down arrow key press
                // Example: snake.moveDown();
            } else if (keyCode == KeyEvent.VK_LEFT) {
                // Handle left arrow key press
                // Example: snake.moveLeft();
            } else if (keyCode == KeyEvent.VK_RIGHT) {
                // Handle right arrow key press
                // Example: snake.moveRight();
        }
    }

}
