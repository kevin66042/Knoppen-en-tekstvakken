package h8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class TweeKnoppen extends Applet {
    Button knop;
    TextField tekstvak;
    Label label;


    public void init() {
        knop = new Button();
        knop.setLabel("Ok");
        KnopListener1 k1 = new KnopListener1();
        knop.addActionListener(k1);
        add(knop);
        knop = new Button();
        knop.setLabel("Reset");
        KnopListener2 k2 = new KnopListener2();
        knop.addActionListener(k2);
        add (knop);
        tekstvak = new TextField("klik op mij",20);
        label = new Label("Type iets in het tekstvakje");
        add (label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("hallo");
            repaint();
        }
    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            repaint();
        }
    }
}
