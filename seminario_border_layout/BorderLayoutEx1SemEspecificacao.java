package seminario_border_layout;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx1SemEspecificacao {

    JFrame frame;
    BorderLayoutEx1SemEspecificacao() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // criando os botões
        JButton botao1 = new JButton("NORTH");
        JButton botao2 = new JButton("SOUTH");
        JButton botao3 = new JButton("EAST");
        JButton botao4 = new JButton("WEST");
        JButton botao5 = new JButton("CENTER");
        // adicionando parâmetros de um gap horizontal e vertical de 7,
        // entretando, como as regiões não são especificadas, eles não tem utilidade.
        frame.setLayout(new BorderLayout(7, 7));
        // cada botão adicionado consome toda a área dispinível
        // porém, como o botão5 foi o último adicionado,
        // ele é o único apresentado.
        frame.add(botao1);
        frame.add(botao2);
        frame.add(botao3);
        frame.add(botao4);
        frame.add(botao5);

        frame.setSize(400,300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new BorderLayoutEx1SemEspecificacao();
    }
}
