/*
Author: Mr. Guglielmi
Date: 01/12/2023
Description: Maze Runner game featuring two players. Players navigate levels while avoiding lasers and obstacles.
Includes functionality to restart (press 'r') or quit (press 'q').
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window {
    JFrame f;
    JLabel l;
    int level = 1;
    final int LASER_SPEED = 1; // Keep laser speed the same for all levels

    public Window() {
        f = new JFrame("Maze Runner");

        // Create label with larger font
        JTextArea l = new JTextArea("Welcome to Maze Runner!");
        l.setFont(new Font("Arial", Font.PLAIN, 40)); 
        l.setWrapStyleWord(true);
        l.setLineWrap(true); 
        l.setOpaque(false); 
        l.setEditable(false); 
        l.setFocusable(false); 
        l.setPreferredSize(new Dimension(400, 100)); 
        l.setAlignmentX(JTextArea.CENTER_ALIGNMENT); 

        JButton bContinue = new JButton("Start Game");
        bContinue.setFont(new Font("Arial", Font.PLAIN, 40)); 
        bContinue.setPreferredSize(new Dimension(400, 80)); 
        bContinue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showSplashScreen();
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 200));
        buttonPanel.add(bContinue);

        f.setLayout(new BorderLayout());
        f.add(l, BorderLayout.NORTH); 
        f.add(buttonPanel, BorderLayout.CENTER); 

        f.setLayout(new BorderLayout());
        f.add(l, BorderLayout.NORTH);
        f.add(buttonPanel, BorderLayout.SOUTH);
        f.setSize(800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void drawStickman(Canvas canvas, int x, int y, Color color) {
    canvas.setColor(color);
    canvas.draw(new Ellipse(x, y, 20, 20)); // Head
    canvas.drawLine(x + 10, y + 20, x + 10, y + 50); // Body
    canvas.drawLine(x + 10, y + 30, x - 10, y + 40); // Left arm
    canvas.drawLine(x + 10, y + 30, x + 30, y + 40); // Right arm
    canvas.drawLine(x + 10, y + 50, x - 10, y + 70); // Left leg
    canvas.drawLine(x + 10, y + 50, x + 30, y + 70); // Right leg
}

public void showSplashScreen() {

        Canvas canvas = new Canvas();
        canvas.setSize(800, 600);

        for (int i = 0; i < 800; i++) {
            Rectangle bg = new Rectangle(0, 0, 800, 600);
            bg.setColor(new graphics.Color(0, 0, 0));
            bg.fill();
            drawStickman(i, 150);
            drawStickman(i, 200);
        }
    }

    public void drawStickman(int x, int y) {
        Ellipse stickman = new Ellipse(x, y, 20, 20);
        stickman.setColor(new graphics.Color(255, 0, 0));
        stickman.fill();

        Line body = new Line(x + 10, y + 20, x + 10, y + 50);
        body.setColor(new graphics.Color(255, 0, 0));
        body.draw();

        Line leftArm = new Line(x + 10, y + 30, x - 10, y + 40);
        leftArm.setColor(new graphics.Color(255, 0, 0));
        leftArm.draw();

        Line rightArm = new Line(x + 10, y + 30, x + 30, y + 40);
        rightArm.setColor(new graphics.Color(255, 0, 0));
        rightArm.draw();

        Line leftLeg = new Line(x + 10, y + 50, x - 10, y + 70);
        leftLeg.setColor(new graphics.Color(255, 0, 0));
        leftLeg.draw();

        Line rightLeg = new Line(x + 10, y + 50, x + 30, y + 70);
        rightLeg.setColor(new graphics.Color(255, 0, 0));                
        rightLeg.draw();

        // g.drawOval(x, y, 20, 20); // Head
        // g.drawLine(x + 10, y + 20, x + 10, y + 50); // Body
        // g.drawLine(x + 10, y + 30, x - 10, y + 40); // Left arm
        // g.drawLine(x + 10, y + 30, x + 30, y + 40); // Right arm
        // g.drawLine(x + 10, y + 50, x - 10, y + 70); // Left leg
        // g.drawLine(x + 10, y + 50, x + 30, y + 70); // Right leg
    }

    public void showGameInstructions() {
        JTextArea l2 = new JTextArea("Player 1 (red): W, A, S, D | Player 2 (blue): Arrow keys");
        l2.setFont(new Font("Arial", Font.PLAIN, 30)); 
        l2.setPreferredSize(new Dimension(400, 100)); 
        l2.setWrapStyleWord(true); 
        l2.setLineWrap(true);
        l2.setEditable(false);
        l2.setOpaque(false); 
        l2.setFocusable(false); 

        // Set up a panel for the button
        JPanel buttonPanel = new JPanel();
        JButton bStart = new JButton("Start Game");
        bStart.setPreferredSize(new Dimension(400, 200));
        bStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GamePanel gamePanel = new GamePanel();
                f.setContentPane(gamePanel);
                gamePanel.requestFocusInWindow();
                f.revalidate();
            }
        });

        // Add the button to its panel
        buttonPanel.add(bStart);

        // Use BorderLayout to add the label and button to specific regions
        f.setLayout(new BorderLayout());
        f.add(l2, BorderLayout.NORTH); // Place label at the top
        f.add(buttonPanel, BorderLayout.CENTER); // Place button at the bottom

        f.revalidate();
    }

    class GamePanel extends JPanel {
        Rectangle player1 = new Rectangle(50, 150, 20, 20);
        Rectangle player2 = new Rectangle(50, 200, 20, 20);
        Rectangle laser = new Rectangle(-100, 0, 50, 600);
        int laserSpeed = LASER_SPEED; // Keep laser speed the same for all levels

        // Arrays for falling objects and walls
        Rectangle[] fallingObjects = new Rectangle[8];
        Rectangle[] walls = new Rectangle[5];
        int fallingObjectSpeed = 2;

        boolean gameOver = false;
        String winner = "";
        boolean levelComplete = false;
        String continueMessage = "";

        public GamePanel() {
            setBackground(Color.BLACK);
            javax.swing.Timer gameTimer = new javax.swing.Timer(30, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    gameLoop();
                }
            });
            gameTimer.start();

            // Setup key listeners for both players
            addKeyListener(new KeyListener() {
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_W)
                        player1.translate(0, -10);
                    if (e.getKeyCode() == KeyEvent.VK_S)
                        player1.translate(0, 10);
                    if (e.getKeyCode() == KeyEvent.VK_A)
                        player1.translate(-10, 0);
                    if (e.getKeyCode() == KeyEvent.VK_D)
                        player1.translate(10, 0);

                    if (e.getKeyCode() == KeyEvent.VK_UP)
                        player2.translate(0, -10);
                    if (e.getKeyCode() == KeyEvent.VK_DOWN)
                        player2.translate(0, 10);
                    if (e.getKeyCode() == KeyEvent.VK_LEFT)
                        player2.translate(-10, 0);
                    if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                        player2.translate(10, 0);

                    repaint();
                }

                public void keyReleased(KeyEvent e) {
                }

                public void keyTyped(KeyEvent e) {
                }
            });

            addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyChar() == 'r') {
                        restartGame();
                    } else if (e.getKeyChar() == 'q') {
                        System.exit(0);
                    } else if (e.getKeyChar() == 'g') {
                        if (levelComplete) {
                            nextLevel();
                        }
                    }
                }
            });

            setFocusable(true);
            requestFocusInWindow();

            generateLevel(); // Generate level when game starts
        }

        public void gameLoop() {
            if (!gameOver) {
                // Move laser
                laser.x += laserSpeed;
                if (laser.x > getWidth())
                    laser.x = -laser.width;

                // Move falling objects
                for (Rectangle obj : fallingObjects) {
                    if (obj != null) {
                        obj.y += fallingObjectSpeed;
                        if (obj.y > getHeight()) {
                            obj.y = -50; // Reset position when it falls off screen
                        }

                        if (obj.intersects(player1) || obj.intersects(player2)) {
                            gameOver = true;
                            winner = "Game Over! Hit by obstacle!";
                        }
                    }
                }

                for (Rectangle wall : walls) {
                    if (wall != null) {
                        if (wall.intersects(player1) || wall.intersects(player2)) {
                            gameOver = true;
                            winner = "Game Over! Hit by wall!";
                        }
                    }
                }

                // Check if players reach the end goal
                if (player1.x > getWidth() - 50 && player2.x > getWidth() - 50) {
                    levelComplete = true;
                    continueMessage = "Level complete! Press Q to quit or G to go to next level.";
                }

                // Check if laser hits any player
                if (laser.intersects(player1) || laser.intersects(player2)) {
                    gameOver = true;
                    winner = "Game Over! Laser hit!";
                }

                repaint();
            }
        }

        public void restartGame() {
            level = 1;
            laserSpeed = LASER_SPEED; // Reset laser speed
            player1.setLocation(50, 150);
            player2.setLocation(50, 200);
            laser.setLocation(-100, 0);
            resetObjects();
            gameOver = false;
            levelComplete = false;
            winner = "";
            continueMessage = "";
            generateLevel(); // Generate level when restarting the game
            repaint();
        }

        public void nextLevel() {
            if (level < 3) {
                level++;
                laserSpeed = LASER_SPEED; // Keep laser speed the same
                player1.setLocation(50, 150);
                player2.setLocation(50, 200);
                laser.setLocation(-100, 0);
                resetObjects();
                gameOver = false;
                levelComplete = false;
                winner = "";
                continueMessage = "";
                generateLevel();
                repaint();
            } else {
                winner = "You completed all levels! Game Over!";
                gameOver = true;
            }
        }

        public void generateLevel() {
            if (level == 1) {
                // Level 1: Few larger falling objects at predefined positions
                fallingObjects[0] = new Rectangle(200, -50, 30, 30);
                fallingObjects[1] = new Rectangle(400, -100, 30, 30);
                fallingObjects[2] = new Rectangle(600, -150, 30, 30);
            } else if (level == 2) {
                // Level 2: More falling objects and walls at predefined positions
                fallingObjects[0] = new Rectangle(200, -50, 30, 30);
                fallingObjects[1] = new Rectangle(350, -100, 30, 30);
                fallingObjects[2] = new Rectangle(500, -150, 30, 30);
                fallingObjects[3] = new Rectangle(650, -200, 30, 30);
                fallingObjects[4] = new Rectangle(300, -250, 30, 30);
                walls[0] = new Rectangle(400, 100, 100, 20); // Horizontal wall
                walls[1] = new Rectangle(600, 300, 100, 20); // Horizontal wall
            } else if (level == 3) {
                // Level 3: More falling objects and vertical walls
                fallingObjects[0] = new Rectangle(150, -50, 30, 30);
                fallingObjects[1] = new Rectangle(250, -100, 30, 30);
                fallingObjects[2] = new Rectangle(350, -150, 30, 30);
                fallingObjects[3] = new Rectangle(450, -200, 30, 30);
                fallingObjects[4] = new Rectangle(550, -250, 30, 30);
                walls[0] = new Rectangle(200, 100, 20, 150); // Vertical wall
                walls[1] = new Rectangle(600, 250, 20, 150); // Vertical wall
                walls[2] = new Rectangle(400, 400, 20, 150); // Vertical wall
            }
        }

        private void resetObjects() {
            for (int i = 0; i < fallingObjects.length; i++) {
                fallingObjects[i] = null;
            }
            for (int i = 0; i < walls.length; i++) {
                walls[i] = null;
            }
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillRect(laser.x, laser.y, laser.width, laser.height);

            g.setColor(Color.RED);
            g.fillRect(player1.x, player1.y, player1.width, player1.height);
            g.setColor(Color.BLUE);
            g.fillRect(player2.x, player2.y, player2.width, player2.height);

            // Draw falling objects
            g.setColor(Color.GREEN);
            for (Rectangle obj : fallingObjects) {
                if (obj != null) {
                    g.fillRect(obj.x, obj.y, obj.width, obj.height);
                }
            }

            // Draw walls
            g.setColor(Color.YELLOW);
            for (Rectangle wall : walls) {
                if (wall != null) {
                    g.fillRect(wall.x, wall.y, wall.width, wall.height);
                }
            }

            g.setColor(Color.WHITE);
            g.drawString("Level: " + level, 10, 20);

            g.drawString("Press R to restart", 10, getHeight() - 30);
            g.drawString("Press Q to quit", 10, getHeight() - 10);

            if (gameOver) {
                g.drawString(winner, getWidth() / 2 - 100, getHeight() / 2);
            } else if (levelComplete) {
                g.drawString(continueMessage, getWidth() / 2 - 100, getHeight() / 2);
            }
        }
    }

    public static void main(String[] args) {
        new Window();
    }
}

