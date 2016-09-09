package hoofdstuk4;


import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(40, 180, 150, 10);
        g.drawLine(260, 180, 150, 10);
        g.drawLine(40, 180, 260, 180);
    }
//hmm