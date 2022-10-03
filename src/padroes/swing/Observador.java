package padroes.swing;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Observador");

        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 200);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null); // null = centraliza no meio

        JButton botao = new JButton("Abrir!");
        janela.add(botao);

        botao.addActionListener(e -> {

            System.out.println("Evento Ocorreu");
        });

        janela.setVisible(true);

    }

}
