package Telas;

import Dados.Cliente;
import Dados.Vendedora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaCadastroCliente extends JDialog {
    private JPanel contentPane;
    private JFrame clienteJFrame;
    private JTextField campoCPF;
    private JTextField campoNome;
    private JTextField campoResultado;
    private JButton voltarButton;
    private JButton cadastrarButton;
    private JLabel nome;
    private JLabel cpf;
    private GerenciarTelas gerenciarTelas;
    private String nomeCliente;
    private Cliente cliente;

    public void screen(Vendedora vendedora) {
        setVisible(true);
        setContentPane(contentPane);
        setModal(true);
        setSize(700, 600); //Tamanho da tela
        setLocationRelativeTo(null);
        gerenciarTelas = new GerenciarTelas();
        //campoNome.setBackground(Color.darkGray);

        voltarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gerenciarTelas.trocarTela(0, vendedora);
                dispose();
            }
        });
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nomeCliente = campoNome.getName();
                cliente = new Cliente(nomeCliente);
                vendedora.adicionarCliente(cliente);
                campoResultado.setText("Nome: " + nomeCliente);
               //campoResultado.setText(vendedora.listaClientes());
            }
        });
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}