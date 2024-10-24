package Telas;

import Dados.Vendedora;

import javax.swing.*;
import java.awt.event.*;

public class TelaMenu extends JDialog {
    private JPanel contentPane;
    private JButton cadastroCarroButton;
    private JButton cadastroClienteButton;
    private GerenciarTelas gerenciarTelas;
    private JLabel titulo;
    private JButton editCarsButton;
    private JButton editClientsButton;
    private JButton dealershipButton;

    public void screen(Vendedora vendedora) {
        setVisible(true);
        setContentPane(contentPane);
        setModal(true);
        setSize(700, 600); // Definindo o tamanho da tela
        setLocationRelativeTo(null); // Centralizando a tela
        gerenciarTelas = new GerenciarTelas();

         cadastroCarroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gerenciarTelas.trocarTela(1, vendedora);
                dispose();
            }
        });
        cadastroClienteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gerenciarTelas.trocarTela(2, vendedora);
                dispose();
            }
        });
        editCarsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gerenciarTelas.trocarTela(3, vendedora);
                dispose();
            }
        });
        editClientsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gerenciarTelas.trocarTela(4, vendedora);
                dispose();
            }
        });
        dealershipButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gerenciarTelas.trocarTela(5, vendedora);
                dispose();
            }
        });
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public JPanel getJPanel() {
        return contentPane;
    }

}
