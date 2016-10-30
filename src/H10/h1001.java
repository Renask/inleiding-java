package H10;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class h1001 extends Applet {
    TextField gains;
    Label renas;
    Button knop;

    int a;
    int input;

    public void init() {
        knop = new Button("Haramble");
        gains = new TextField();
        knop.addActionListener(new knoplistener());
        renas = new Label(""+a);
        add(gains);
        add(renas);
        add(knop);
        a = 0;

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
            repaint();
    }

        }  }