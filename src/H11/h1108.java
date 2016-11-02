package H11;

import java.awt.*;
import java.applet.*;


public class h1108 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int oval;
        int y = 470;
        int x = 700;
        int x1 = 0;
        int y1 = 0;

        for (oval = 0; oval < 100; oval++) {
            y -= 5;
            x -= 5;
            x1+=10;
            y1+= 10;
            g.drawOval(x , y, x1, y1);

        }
    }
}