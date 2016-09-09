package hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(50, 50, 100, 50, 0, 360);
    }
}