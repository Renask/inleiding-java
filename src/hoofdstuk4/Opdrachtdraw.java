package hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Opdrachtdraw extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(100, 100, 150, 100);
        g.drawString("Lijn", 100, 120);
        g.drawRect(100, 150, 50, 50);
        g.drawString("Vierkant", 100, 215);
        g.drawRoundRect(100, 250, 50, 20, 10, 10);
        g.drawString("Afgeronde vierkant", 100, 290);
        g.drawRect(200, 150, 100, 50);
        g.setColor(Color.magenta);
        g.fillRect(200, 150, 100, 50);
        g.setColor(Color.black);
        g.drawOval(200, 150, 100, 50);
        g.drawString("Gevuld rechthoek met ovaal", 200, 215);
        g.setColor(Color.magenta);
        g.fillOval(200, 225, 100,50);
        g.drawOval(200, 225, 100, 50);
        g.setColor(Color.black);
        g.drawString("Ovaal", 210, 290);
        g.drawOval(375, 150, 100, 50);
        g.setColor(Color.magenta);
        g.fillArc(375, 150, 100, 50, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 375, 215);
        g.drawOval(375, 225, 50, 50);
        g.drawString("Circle", 375, 290);

    }
}