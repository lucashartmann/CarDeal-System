package Telas;

import Dados.Vendedora;

import javax.swing.*;
import java.awt.event.*;

public class TelaVendedora extends JDialog {
    private JPanel contentPane;
    private JButton vehiclesButton;
    private JButton clientsButton;
    private JTextField fieldResult;
    private JButton backButton;
    private JButton buttonOK;
    private JButton buttonCancel;
    private GerenciarTelas gerenciarTelas;

    public void telaVendedora(Vendedora vendedora) {
        setVisible(true);
        setContentPane(contentPane);
        setModal(true);
        setSize(700, 600); //Tamanho da tela
        setLocationRelativeTo(null);
        gerenciarTelas = new GerenciarTelas();

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gerenciarTelas.trocarTela(0, vendedora);
                dispose();
            }
        });
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
