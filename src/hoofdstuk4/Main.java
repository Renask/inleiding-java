package hoofdstuk4;

import java.awt.*; //Methodes importeren uit java.awt.*
import java.applet.*; //Alle methode uit java.applet.* importeren

public class Main extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) { //Dit is een methode uit java.applet.*
        g.setColor(Color.yellow);
        g.drawString("Renas", 50, 60 );
    }
}
