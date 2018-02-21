package h8;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class BTW extends Applet {
    Button knop;
    Label label;
    TextField tekstvak;
    Double getal;

    public void init() {
        label = new Label("Type je bedrag");
        add(label);

        tekstvak = new TextField("", 10);
        add (tekstvak);

        knop = new Button("Ok");
        KnopListener k1 = new KnopListener();
        knop.addActionListener(k1);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Het bedrag inclusief BTW: " + getal,20,50);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal = Double.parseDouble(tekstvak.getText())*1.21;
            repaint();
        }
    }
}
