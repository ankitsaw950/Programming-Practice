import java.applet.Applet;
import java.awt.Graphics;

public class ParameterPassing extends Applet{
    public void paint(Graphics g) {
        String greeting = getParameter("greeting");
        g.drawString(greeting, 50, 50);
    }
}

// <applet code="ParameterPassing" width="300" height="300">
//     <param name="greeting" value="Hello, Ankit!" />
// </applet>
