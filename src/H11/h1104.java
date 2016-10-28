package H11;

import java.awt.*;
import java.applet.*;


public class h1104 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 0; teller < 33; teller+=3)  {
            y += 20;
            g.drawString("" + teller, 305, y );
        }
    }
}