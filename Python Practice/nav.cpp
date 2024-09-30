import java.awt.Component;
import javax.swing.JFrame;
public
class App
{
public
    static void main(String[] args) throws Exception
    {
        int boardWidth = 600;
        int boardHeight = boardWidth;
        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        10 frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SnakeGame snakeGAme = new SnakeGame(boardWidth,
                                            boardHeight);
        frame.add(snakeGAme);
        frame.pack();
        snakeGAme.requestFocus();
    }
} import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;
11 public class SnakeGame extends JPanel implements ActionListener,
    KeyListener
{
private
    class Tile
    {
        int x;
        int y;
        Tile(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    } int boardWidth;
    int boardHeight;
    int tileSize = 25;
    // Snake
    Tile snakeHead;
    ArrayList<Tile> snakeBody;
    // Food
    Tile food;
    Random random;
    // Game logic
    int velocityX;
    12 int velocityY;
    Timer gameLoop;
    boolean gameOver = false;
    SnakeGame(int boardWidth, int boardHeight)
    {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        setPreferredSize(new Dimension(this.boardWidth,
                                       this.boardHeight));
        setBackground(Color.black);
        addKeyListener(this);
        setFocusable(true);
        snakeHead = new Tile(5, 5);
        snakeBody = new ArrayList<Tile>();
        food = new Tile(10, 10);
        random = new Random();
        placeFood();
        velocityX = 1;
        velocityY = 0;
        // Game timer
        gameLoop = new Timer(100, this); // Milliseconds between frames
        gameLoop.start();
        13
    }
    @Override public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        draw(g);
    }
public
    void draw(Graphics g)
    {
        // Grid Lines
        g.setColor(Color.gray);
        for (int i = 0; i < boardWidth / tileSize; i++)
        {
            g.drawLine(i * tileSize, 0, i * tileSize, boardHeight);
            g.drawLine(0, i * tileSize, boardWidth, i * tileSize);
        }
        // Food
        g.setColor(Color.red);
        g.fill3DRect(food.x * tileSize, food.y * tileSize, tileSize, tileSize, true);
        // Snake Head
        g.setColor(Color.green);
        g.fill3DRect(snakeHead.x * tileSize, snakeHead.y * tileSize, tileSize,
                     tileSize, true);
        // Snake Body
        for (Tile snakePart : snakeBody)
        {
            14 g.fill3DRect(snakePart.x * tileSize, snakePart.y * tileSize, tileSize,
                            tileSize, true);
        }
        // Score
        g.setFont(new Font("Arial", Font.PLAIN, 16));
        if (gameOver)
        {
            g.setColor(Color.red);
            g.drawString("Game Over: " + String.valueOf(snakeBody.size()),
                         10, 20);
        }
        else
        {
            g.setColor(Color.white);
            g.drawString("Score: " + String.valueOf(snakeBody.size()), 10,
                         20);
        }
    }
public
    void placeFood()
    {
        food.x = random.nextInt(boardWidth / tileSize);
        food.y = random.nextInt(boardHeight / tileSize);
    }
public
    void move()
    {
        // Eat food
        if (collision(snakeHead, food))
        {
            snakeBody.add(new Tile(food.x, food.y));
            placeFood();
        }
        15
            // Move snake body
            for (int i = snakeBody.size() - 1; i >= 0; i--)
        {
            Tile snakePart = snakeBody.get(i);
            if (i == 0)
            { // Right before the head
                snakePart.x = snakeHead.x;
                snakePart.y = snakeHead.y;
            }
            else
            {
                Tile prevSnakePart = snakeBody.get(i - 1);
                snakePart.x = prevSnakePart.x;
                snakePart.y = prevSnakePart.y;
            }
        }
        // Move snake head
        snakeHead.x += velocityX;
        snakeHead.y += velocityY;
        // Game over conditions
        for (Tile snakePart : snakeBody)
        {
            if (collision(snakeHead, snakePart))
            {
                gameOver = true;
            }
        }
        if (snakeHead.x < 0 || snakeHead.x >= boardWidth / tileSize || //
            Passed left or right border 16 snakeHead.y < 0 || snakeHead.y >= boardHeight / tileSize)
        { //
            Passed top or bottom border
                              gameOver = true;
        }
    }
public
    boolean collision(Tile tile1, Tile tile2)
    {
        return tile1.x == tile2.x && tile1.y == tile2.y;
    }
    @Override public void actionPerformed(ActionEvent e)
    {
        if (!gameOver)
        {
            move();
            repaint();
        }
        else
        {
            gameLoop.stop();
        }
    }
    @Override public void keyPressed(KeyEvent e)
    {
        switch (e.getKeyCode())
        {
        case KeyEvent.VK_UP:
            if (velocityY != 1)
            {
                velocityX = 0;
                velocityY = -1;
                17
            }
            break;
        case KeyEvent.VK_DOWN:
            if (velocityY != -1)
            {
                velocityX = 0;
                velocityY = 1;
            }
            break;
        case KeyEvent.VK_LEFT:
            if (velocityX != 1)
            {
                velocityX = -1;
                velocityY = 0;
            }
            break;
        case KeyEvent.VK_RIGHT:
            if (velocityX != -1)
            {
                velocityX = 1;
                velocityY = 0;
            }
            break;
        }
    }
    @Override public void keyTyped(KeyEvent e)
    {
        // Not needed
    }
    18
        @Override public void
        keyReleased(KeyEvent e)
    {
        // Not needed
    }
}
