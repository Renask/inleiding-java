package H6;

import java.awt.*;
import java.applet.*;


public class h062 extends Applet {
    int seconde = 1;
    int minuten = 60;
    int uur = minuten * 60;
    int dag = uur * 24;
    int jaar = dag * 365;

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawString("in een uur zitten" + uur + "seconde", 100, 100);
        g.drawString("in een dag zitten"  + dag + " seconde", 100, 120);
        g.drawString("in een jaar zitten"  + jaar + " seconde", 100, 140);
    }
}