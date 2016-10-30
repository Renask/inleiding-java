package H11;
import java.awt.*;
import java.applet.*;
public class h1109 extends Applet {
    public void paint(Graphics g) {
        g.drawRect(49, 49, 81, 81);
        int y = 50;
        for (int i = 0; i < 4; i++) {
            int x = 50;
            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, 10, 10);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, 10, 10);
                }
                x += 10;
            }
            y += 10;
            x = 50;
            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, 10, 10);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, 10, 10);
                }
                x += 10;
            }
            y += 10;
        }
    }
}