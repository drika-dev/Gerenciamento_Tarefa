package gerenciamento_tarefas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class End extends JPanel implements ActionListener {

    Messagey ma;
    JButton b;
    Base base;
    String s;
    int h;
    int m;

    public End(Base ba) {
        base = ba;
        setLayout(new BorderLayout());
    }

    public void setValues(String sa, int ha, int mar) {
        s = sa;
        h = ha;
        m = mar;
        ma = new Messagey(s, h, m);
        b = new JButton("Voltar para tela inicial");
        b.addActionListener(this);
        add(b, BorderLayout.SOUTH);
        add(ma, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        base.showIt("home");
    }
}

class Messagey extends JPanel {

    String message;
    int hours;
    int minutes;

    public Messagey(String s, int h, int m) {
        message = s;
        hours = h;
        minutes = m;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Você tem " + message + " " + hours + " horas e " + minutes + " minutos.", (getWidth() / 2) - 10, getHeight() / 2);
    }
}
