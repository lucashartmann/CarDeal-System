package Telas;

import Dados.Vendedora;

import javax.swing.*;
import java.awt.event.*;

public class TelaMenu extends JDialog {
    private JPanel contentPane;
    private JButton cadastroCarroButton;
    private JButton cadastroClienteButton;

    public void screen(Vendedora vendedora, GerenciarTelas gerenciarTelas) {
        setVisible(true);
        setContentPane(contentPane);
        setModal(true);
        setSize(700, 600); // Definindo o tamanho da tela
        setLocationRelativeTo(null); // Centralizando a tela

        cadastroCarroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gerenciarTelas.setTrocaTela(1);
                gerenciarTelas.trocarTela(1, vendedora, gerenciarTelas);
            }
        });

        cadastroClienteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gerenciarTelas.setTrocaTela(2);
                gerenciarTelas.trocarTela(2, vendedora, gerenciarTelas);
            }
        });


        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public JPanel getJPanel() {
        return contentPane;
    }

}
