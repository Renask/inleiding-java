package H11;

        import java.awt.*;
        import java.applet.*;


public class h1105 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int vierkant;
        int y = 50;
        int x = 50;

        for (vierkant = 0; vierkant < 5; vierkant++) {
            y += 50;
            x += 50;
            g.drawRect(x , y, 50 ,50 );

        }
    }
}