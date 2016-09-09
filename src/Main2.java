
import java.awt.*;
import java.applet.*;

public class Main2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Renas", 50, 60 );
        g.setColor(Color.RED);
        g.drawString("Khalil", 50, 75 );
    }
}