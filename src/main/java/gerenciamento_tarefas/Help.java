package gerenciamento_tarefas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Help extends JPanel {

    Base base;
    Font qFont, aFont;
    JLabel q1, q2, q3, a1, a2, a3;

    public Help(Base b) {
        base = b;
        q1 = new JLabel("Como o TaskLiner melhora minha produtividade?");
        q2 = new JLabel("Como uso o TaskLiner?");
        q3 = new JLabel("Para quem é este aplicativo feito?");
        a1 = new JLabel("<html>Ele constantemente envia notificações, mantendo você no caminho certo. "
                + "<br>Ele fornece uma interface facilmente compreensível.<br><br></html>");
        a2 = new JLabel("<html>Ao iniciar, você será direcionado para uma página onde poderá inserir os nomes das tarefas<br>"
                + "e horários. Depois disso, uma linha do tempo será criada usando os dados que você forneceu,<br>"
                + "e você pode clicar no botão quando terminar cada tarefa. <br>"
                + "No final, o programa dirá quanto tempo você desperdiçou ou economizou.<br><br></html>");
        a3 = new JLabel("<html>Embora seja voltado para ajudar alunos do ensino médio e universitários <br>"
                + "mantendo o foco em seu trabalho em vez de outras distrações, isso <br>"
                + "aplicação pode ser usada por qualquer pessoa!<br><br></html>");
        qFont = new Font("Verdana", Font.PLAIN, 23);
        aFont = new Font("Verdana", Font.PLAIN, 17);
        q1.setFont(qFont);
        q2.setFont(qFont);
        q3.setFont(qFont);
        a1.setFont(aFont);
        a2.setFont(aFont);
        a3.setFont(aFont);
        add(q1);
        add(a1);
        add(q2);
        add(a2);
        add(q3);
        add(a3);
        JButton bon = new JButton("Volte para a página Inicial");
        add(bon);
        bon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                base.showIt("home");
            }
        });
    }
}
