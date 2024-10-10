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

    public void screen(Vendedora vendedora, GerenciarTelas gerenciarTelas) {
        setVisible(true);
        setContentPane(contentPane);
        setModal(true);
        setSize(700, 600); // Definindo o tamanho da tela
        setLocationRelativeTo(null);

        voltarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gerenciarTelas.setTrocaTela(0);
                gerenciarTelas.trocarTela(0, vendedora, gerenciarTelas);
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
