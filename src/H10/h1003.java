package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class h1003 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maand en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "Januari 31 dagen";
                    break;
                case 2:
                    tekst = "Februari 28 of 29 dagen";
                    break;
                case 3:
                    tekst = "Maart 31 dagen";
                    break;
                case 4:
                    tekst = "April 30 dagen";
                    break;
                case 5:
                    tekst = "Mei 31 dagen";
                    break;
                case 6:
                    tekst = "Juni 30 dagen";
                    break;
                case 7:
                    tekst = "Juli 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus 30 dagen";
                    break;
                case 9:
                    tekst = "September 31 dagen";
                    break;
                case 10:
                    tekst = "Oktober 30 dagen";
                    break;
                case 11:
                    tekst = "November 31 dagen";
                    break;
                case 12:
                    tekst = "December 30 dagen";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}