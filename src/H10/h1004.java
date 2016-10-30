package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class h1004 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    TextField tekstvak2;
    Label label2;
    String a, tekst2;
    int dag;
    int jaartal;


    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak2 = new TextField("", 40);
        label = new Label("Type het maand en druk op enter");
        label2 = new Label("Type het jaar en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        tekstvak2.addActionListener(new TekstvakListener());
        tekst = "";
        tekst2 = "";
        add(label);
        add(tekstvak);
        add (label2);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
        g.drawString(tekst2, 50, 90);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt(s);
            switch (dag) {
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
                    case 13:
                    a = tekstvak.getText().toString();
                    jaartal = Integer.parseInt(a);
                    if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0) {
                        tekst = "" + jaartal + " is een schrikkeljaar";
                    } else {
                        tekst = "" + jaartal + " is geen schrikkeljaar";
                    }
                    break;


            }
            repaint();
        }
        }
    }
