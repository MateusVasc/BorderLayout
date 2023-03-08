package seminario_border_layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx1 {
    JFrame frame;
    BorderLayoutEx1() {

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // criando os botões
        JButton botao1 = new JButton("NORTH");; // o botão será rotulado como NORTH
        JButton botao2 = new JButton("SOUTH");; // o botão será rotulado como SOUTH
        JButton botao3 = new JButton("EAST");; // o botão será rotulado como EAST
        JButton botao4 = new JButton("WEST");; // o botão será rotulado como WEST
        JButton botao5 = new JButton("CENTER");; // o botão será rotulado como CENTER

        frame.add(botao1, BorderLayout.NORTH); // botao1 será colocado na posição North
        frame.add(botao2, BorderLayout.SOUTH);  // botao2 será colocado na posição South
        frame.add(botao3, BorderLayout.EAST);  // botao3 será colocado na posição East
        frame.add(botao4, BorderLayout.WEST);  // botao4 será colocado na posição West
        frame.add(botao5, BorderLayout.CENTER);  // botao5 será colocado na posição Center

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {

        new BorderLayoutEx1();
    }
}


// https://www.javatpoint.com/java-layout-manager