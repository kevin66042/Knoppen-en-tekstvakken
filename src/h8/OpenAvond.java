package h8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class OpenAvond extends Applet{
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    TextField tekstvak;
    TextField tekstvak1;
    TextField tekstvak2;
    TextField tekstvak3;
    TextField tekstvak4;
    int teller;
    int teller1;
    int teller2;
    int teller3;
    String vrouw, man, ManLL, VrouwLL, Totaal;

    public void init() {
        tekstvak = new TextField("Man", 40);
        tekstvak1 = new TextField("Vrouw", 40);
        tekstvak2 = new TextField("ManLL", 40);
        tekstvak3 = new TextField("VrouwLL", 40);
        tekstvak4 = new TextField("Totaal",40);
        knop = new Button("Man");
        knop.addActionListener( new KnopListener() );
        knop2 = new Button("Vrouw");
        knop2.addActionListener( new Knop2Listener() );
        knop3 = new Button("ManLL");
        knop3.addActionListener( new Knop3Listener() );
        knop4 = new Button("VrouwLL");
        knop4.addActionListener( new Knop4Listener() );
        add(knop);
        add(knop2);
        add(knop3);
        add(knop4);
        vrouw ="";
        man = "";
        ManLL = "";
        VrouwLL = "";
        Totaal = "";
        teller=0;
        teller1=0;
        teller2=0;
        teller3=0;
    }

    public void paint(Graphics g) {
        g.drawString("Man: " +teller, 50,60);
        g.drawString("Vrouw: " +teller1, 50,80);
        g.drawString("ManLL: " +teller2, 50,100);
        g.drawString("VrouwLL: " +teller3, 50,120);
        g.drawString("Totaal: " +(teller + teller1 + teller2 + teller3),50,140);
    }

    class KnopListener implements ActionListener {

        public void actionPerformed( ActionEvent e ) {
            teller++;
            vrouw = tekstvak.getText();
            repaint();
        }
    }

    class Knop2Listener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            teller1++;
            man = tekstvak1.getText();
            repaint();
        }
    }

    class Knop3Listener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            teller2++;
            ManLL = tekstvak2.getText();
            repaint();
        }
    }

    class Knop4Listener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            teller3++;
            VrouwLL = tekstvak3.getText();
            repaint();
        }
    }
}