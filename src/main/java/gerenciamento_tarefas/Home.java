package gerenciamento_tarefas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Home extends JPanel {

    Base base;
    Intro intro;
    Buttons botones;

    public Home(Base b) {
        base = b;
        intro = new Intro(base);
        botones = new Buttons(base);
        setLayout(new BorderLayout());
        add(botones, BorderLayout.SOUTH);
        add(intro, BorderLayout.CENTER);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    class Intro extends JPanel {

        Base base;
        JPanel blankPanel, textPanel;
        Image img;

        public Intro(Base b) {
            setLayout(new GridLayout(2, 1));
            base = b;
            textPanel = new DisplayText();
            img = Toolkit.getDefaultToolkit().getImage("./images/time-management-while-work-from-home.jpg");
            JPanel imgr = new JPanel() {
                public void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(img, 230, 0, 800, 300, this);
                }
            };
            add(textPanel);
            add(imgr);
        }
    }

    class DisplayText extends JPanel {

        JLabel title, subtitle, desc;
        Font titleFont, subtitleFont, descFont;

        public DisplayText() {
            setLayout(new GridLayout(3, 1));
            title = new JLabel("TaskLiner", SwingConstants.CENTER);
            titleFont = new Font("Verdana", Font.PLAIN, 35);
            title.setFont(titleFont);
            add(title);
            subtitle = new JLabel("Gerenciamento de tarefas facilitado", SwingConstants.CENTER);
            subtitleFont = new Font("Verdana", Font.PLAIN, 23);
            subtitle.setFont(subtitleFont);
            add(subtitle);
            desc = new JLabel("<html>O TaskLiner ajuda você a aumentar sua produtividade concentrando-se <br>"
                    + "em tarefas individuais, uma de cada vez.</html>", SwingConstants.CENTER);
            descFont = new Font("Verdana", Font.PLAIN, 16);
            desc.setFont(descFont);
            add(desc);
        }
    }

    class Buttons extends JPanel implements ActionListener {

        Base base;
        JButton begin;
        JButton help;

        public Buttons(Base b) {
            base = b;
            setLayout(new GridLayout(1, 2));
            begin = new JButton("Comece agora");
            help = new JButton("Ajuda");
            begin.addActionListener(this);
            help.addActionListener(this);
            add(begin);
            add(help);
        }

        public void actionPerformed(ActionEvent e) {
            requestFocus();
            if (e.getSource() == begin) {
                base.showIt("sched");
            } else {
                base.showIt("help");
            }
        }

    }
}
