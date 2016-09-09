package hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(40, 150, 120, 50);
        g.drawLine(200, 150, 120, 50);
        g.drawLine(40, 150, 200, 150);
        g.drawRect(40, 150, 160, 200);
        g.drawRect(60, 290, 30, 60);
        g.drawRect(140, 180, 20, 20);
    }
}