package seminario_border_layout;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx1ComGaps {

    JFrame frame;
    BorderLayoutEx1ComGaps() {

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // criando os botões
        JButton botao1 = new JButton("NORTH");
        JButton botao2 = new JButton("SOUTH");
        JButton botao3 = new JButton("EAST");
        JButton botao4 = new JButton("WEST");
        JButton botao5 = new JButton("CENTER");
        // criando um objeto da classe BorderLayout passando
        // parâmetros para o construtor de um gap horizontal de 20
        // e um gap vertical de 20.
        frame.setLayout(new BorderLayout(20, 15));
        frame.add(botao1, BorderLayout.NORTH);
        frame.add(botao2, BorderLayout.SOUTH);
        frame.add(botao3, BorderLayout.EAST);
        frame.add(botao4, BorderLayout.WEST);
        frame.add(botao5, BorderLayout.CENTER);

        frame.setSize(400,300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {

        new BorderLayoutEx1ComGaps();
    }
}
