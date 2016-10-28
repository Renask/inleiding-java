package H11;
import java.awt.*;
import java.applet.*;


public class h1102 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 20;
        int y = 0;

        while(teller <= 20) {
            y += 26;
            g.drawString("" + teller, 305, y );
            teller --;
        }
    }
}