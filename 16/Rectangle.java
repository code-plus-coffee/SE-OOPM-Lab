// Program to draw rectangle with 
// diagonal and circle enclosed in it
// @Author: D. Kasi Pavan Kumar
// @Date: 20 September 2019

import java.awt.Graphics;
import javax.swing.JApplet;

// <applet code = "Rectangle" width = 300 height = 300> </applet>

public class Rectangle extends JApplet {
    private static final long serialVersionUID = 2970935845558468700L;

    public void paint(Graphics graphic) {
        // Draw rectangle of width = 200 & height = 200
        graphic.drawRect(10, 10, 200, 200);

        // Draw diagonal of the rectangle
        graphic.drawLine(210, 210, 10, 10);

        // Draw circle enclosed inside rectangle
        graphic.drawOval(10, 10, 200, 200);

        graphic.drawString("TUS3F181972", 70, 235);
        graphic.drawString("C61", 100, 250);
    }
} // [END OF PROGRAM]