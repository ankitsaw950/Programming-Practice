import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class AppletDisplay extends Applet implements ActionListener {
    private int counter = 0;
    private Button incrementButton;

    // Initialize the applet
    public void init() {
        // Set layout for the applet
        setLayout(new FlowLayout());

        // Create and add button
        incrementButton = new Button("Increment Counter");
        add(incrementButton);

        // Register button click event
        incrementButton.addActionListener(this);
    }

    // Draw something on the screen
    public void paint(Graphics g) {
        g.drawString("Counter: " + counter, 50, 50);
    }

    // Increment counter and request a repaint
    public void updateCounter() {
        counter++;
        repaint(); // Triggers paint() indirectly
    }

    // Handle button click
    @Override
    public void actionPerformed(ActionEvent e) {
        updateCounter(); // Increment counter on button click
    }

    // Start the applet
    public void start() {
        showStatus("Applet started");
    }
}


 // <applet code="AppletDisplay" width="300" height="200" align="center"  >
    // </applet>