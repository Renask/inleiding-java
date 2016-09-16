package H6;

import java.awt.*;
import java.applet.*;


public class h061 extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {
        a = 113;
        b = 0;
        c = 4;
        uitkomst = (a + b) / c;
    }

    public void paint(Graphics g) {
        g.drawString("Jan :€ " + uitkomst, 20, 20);
        g.drawString("Ali:€ " + uitkomst, 20, 40);
        g.drawString("Jeannette :€ " + uitkomst, 20, 60);
        g.drawString("Renas:€ " + uitkomst, 20, 80);


    }
}