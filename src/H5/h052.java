package H5;

import java.awt.*;
import java.applet.*;

public class h052 extends Applet {

    public void init() {
    }

    int x = 40;

    public void paint(Graphics g) {
        g.drawString("100", 60, 70);
        g.drawString("80", 60, 100);
        g.drawString("60", 60, 130);
        g.drawString("40", 60, 160);
        g.drawString("20", 60, 190);
        g.drawLine(57, 210, 57, 55);
        g.drawString("Valerie", 90, 221);
        g.drawString("Jeroen", 160, 221);
        g.drawString("Hans", 230, 221);
        g.setColor(Color.red);
        g.fillRect(90, 144, x, 66);
        g.setColor(Color.cyan);
        g.fillRect(160, 55, x, 155);
        g.setColor(Color.green);
        g.fillRect(230, 90, x, 120);
    }
}
