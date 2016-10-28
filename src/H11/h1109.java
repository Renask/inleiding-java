package H11;

import java.awt.*;
import java.applet.*;

/**
 * Created by renas on 28-10-2016.
 */


public class h1109{
    public void paint(Graphics g) {
       int y = 50;
       int x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            }
            x += 50;
        }

        //tweede rij
        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);

            }
            x += 50;
        }
    }}
