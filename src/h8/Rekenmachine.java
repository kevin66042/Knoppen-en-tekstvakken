package h8;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Rekenmachine extends Applet{
    TextField tekstvak;
    TextField tekstvak2;
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    Double getal;
    Double getal2;


    public void init() {
        tekstvak = new TextField("",10);
        add (tekstvak);
        tekstvak2 = new TextField("",10);
        add (tekstvak2);

        knop = new Button("*");
        knop.addActionListener( new KnopListener ());
        add (knop);
        knop2 = new Button("/");
        knop2.addActionListener( new Knop2Listener ());
        add (knop2);
        knop3 = new Button("+");
        knop3.addActionListener( new Knop3Listener ());
        add (knop3);
        knop4 = new Button("-");
        knop4.addActionListener( new Knop4Listener ());
        add (knop4);

    }

    public void paint(Graphics g) {
        //g.drawString("Het antwoord is " + (getal * getal2),20,50);
        //g.drawString("Het antwoord is " + (getal / getal2),20,50);
        //g.drawString("Het antwoord is " + (getal + getal2),20,50);
        //g.drawString("Het antwoord is " + (getal - getal2),20,50);
    }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            getal = Double.parseDouble(tekstvak.getText());
            getal2 = Double.parseDouble( tekstvak2.getText ());
            tekstvak.setText(""+ (getal * getal2));
            tekstvak2.setText("");
            repaint();
        }
    }

    class Knop2Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            getal = Double.parseDouble(tekstvak.getText());
            getal2 = Double.parseDouble( tekstvak2.getText ());
            tekstvak.setText(""+ (getal / getal2));
            tekstvak2.setText("");
            repaint();
        }
    }

    class Knop3Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            getal = Double.parseDouble(tekstvak.getText());
            getal2 = Double.parseDouble( tekstvak2.getText ());
            tekstvak.setText(""+ (getal + getal2));
            tekstvak2.setText("");
            repaint();
        }
    }

    class Knop4Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            getal = Double.parseDouble(tekstvak.getText());
            getal2 = Double.parseDouble( tekstvak2.getText ());
            tekstvak.setText(""+ (getal - getal2));
            tekstvak2.setText("");
            repaint();
        }
    }

}
