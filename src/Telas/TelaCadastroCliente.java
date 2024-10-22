package Telas;

import Dados.Cliente;
import Dados.Vendedora;

import javax.swing.*;
import java.awt.event.*;

public class TelaCadastroCliente extends JDialog {
    private JPanel contentPane;
    private JTextField campoCPF;
    private JFrame clienteJFrame;
    private JButton voltarButton;
    private JButton cadastrarButton;
    private JTextField campoNome;
    private JTextField campoResultado;
    private JLabel nome;
    private JLabel cpf;
    private JTextField textField1;
    private GerenciarTelas gerenciarTelas;

    public void screen(Vendedora vendedora) {
        setVisible(true);
        setContentPane(contentPane);
        setModal(true);
        setSize(700, 600); // Definindo o tamanho da tela
        setLocationRelativeTo(null);
        gerenciarTelas = new GerenciarTelas();

        voltarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gerenciarTelas.trocarTela(0, vendedora);
                dispose();
            }
        });

        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeCliente = campoNome.getName();
                Cliente cliente = new Cliente(nomeCliente);
                vendedora.adicionarCliente(cliente);
                campoResultado.setText("Clientes cadastrados com sucesso!");
            }
        });


        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

}
