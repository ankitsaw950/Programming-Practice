import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.AppletContext;
import java.net.URL;

public class AppletContextExample extends Applet {
    Button loadGoogleButton;

    public void init() {
        // Create a button to load a real-life URL (Google)
        loadGoogleButton = new Button("Load Google");

        // Add an action listener to the button
        loadGoogleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the current AppletContext
                    AppletContext appletContext = getAppletContext();

                    // Specify the real-life URL (Google)
                    URL googleURL = new URL("https://www.google.com");

                    // Use showDocument to load the URL in the browser
                    appletContext.showDocument(googleURL);
                } catch (Exception ex) {
                    System.out.println("Error loading URL: " + ex.getMessage());
                }
            }
        });

        // Add the button to the applet
        add(loadGoogleButton);
    }
}
// <applet code="AppletContextExample" width="300" height="300">
// </applet>