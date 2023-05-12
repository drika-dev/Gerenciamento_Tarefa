package gerenciamento_tarefas;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main extends JFrame {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        super("TaskLiner");
        setSize(700, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(new Base());
        setResizable(true);
        setVisible(true);
    }
}

class Base extends JPanel {

    CardLayout cards;
    Home home;
    Help help;
    public Schedule sched;
    Timeline time;
    End end;

    public Base() {
        cards = new CardLayout();
        home = new Home(this);
        help = new Help(this);
        sched = new Schedule(this);
        time = new Timeline(this);
        end = new End(this);
        setLayout(cards);
        add(home, "home");
        add(help, "help");
        add(sched, "sched");
        add(time, "time");
        add(end, "end");
    }

    public void showIt(String name) {
        cards.show(this, name);
    }
}
