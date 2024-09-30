import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleApplet extends Applet implements ActionListener {
    String message = "Welcome to Java Applet!";
    Button button;

    public void init() {
        button = new Button("Click Me");
        button.addActionListener(this);
        add(button);
    }

    public void paint(Graphics g) {
        g.drawString(message, 20, 20);
    }

    public void actionPerformed(ActionEvent e) {
        message = "Button Clicked!";
        repaint();
    }
}
