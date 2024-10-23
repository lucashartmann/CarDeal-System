package Telas;

import Dados.Vendedora;

import javax.swing.*;
import java.awt.event.*;

public class TelaEditarClientes extends JDialog {
    private JPanel contentPane;
    private JButton editButton;
    private JLabel cpfText;
    private JTextField fieldCPF;
    private JTextField fieldName;
    private JButton backButton;
    private JTextField fieldResult;
    private JLabel nameText;
    private JTextField newFieldCPF;
    private JTextField newFieldName;
    private JLabel newCpfText;
    private JLabel newNameText;
    private JButton buttonOK;
    private JButton buttonCancel;
    private GerenciarTelas gerenciarTelas;

    public void telaEditarClientes(Vendedora vendedora) {
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
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

}
