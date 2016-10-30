package H10;


        import java.awt.*;
        import java.applet.*;
        import java.awt.event.*;


public class h1002   extends Applet {
    TextField gains;
    Label renas;
    Button knop;
    Label renas2;

    int a;
    int b;
    int input;

    public void init() {
        knop = new Button("Haramble");
        gains = new TextField();
        knop.addActionListener(new knoplistener());
        renas = new Label("");
        renas2 = new Label("");
        add(gains);
        add(renas);
        add(knop);
        add(renas2);
        a = 0;
        b = 2147483647;

    }

    public void paint(Graphics g) {

    }

    public class knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = Integer.parseInt(gains.getText());
            if ( a < input ) {
                a = input;
                renas.setText("" + a);
            }
            if ( b > input ) {
                b = input;
                renas2.setText("" + b);
            }
            repaint();
        }

    }  }