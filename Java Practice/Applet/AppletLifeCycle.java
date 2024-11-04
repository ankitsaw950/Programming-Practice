import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class AppletLifeCycle extends Applet implements ActionListener {
    private TextField textField;
    private Button button;
    private Label label;

    // Called when the applet is initialized
    public void init() {
        // Set layout manager for the applet
        setLayout(new FlowLayout());

        // Initialize components
        label = new Label("Enter your name:");
        textField = new TextField(20);
        button = new Button("Click Me!");

        // Add components to the applet
        add(label);
        add(textField);
        add(button);

        // Register button event handler
        button.addActionListener(this);

        // Output message in the status window
        showStatus("Applet initialized");
    }

    // Called when the applet starts or resumes execution
    public void start() {
        showStatus("Applet started");
    }

    // Called when the applet is stopped
    public void stop() {
        showStatus("Applet stopped");
    }

    // Called when the applet is destroyed
    public void destroy() {
        showStatus("Applet destroyed");
    }

    // Event handling for button click
    @Override
    public void actionPerformed(ActionEvent e) {
        // Change label text on button click
        label.setText("Hello, " + textField.getText());
        showStatus("Button clicked");
    }
}

  // <applet code="AppletLifeCycle" width="300" height="200" align="center"  >
    // </applet>