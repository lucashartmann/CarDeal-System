package Telas;

import Dados.Cliente;
import Dados.Vendedora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

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
    private JButton showClientsButton;
    private GerenciarTelas gerenciarTelas;
    private Cliente cliente;
    private ArrayList<Cliente> clientesCadastrados = new ArrayList<>();

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
                if(campoNome.getName() == null){
                    campoResultado.setText("Erro ao cadastrar o nome. Tente novamente");
                }else if (clientesCadastrados.contains(cliente)){
                    campoResultado.setText("Cliente já cadastrado");
                }else if(!clientesCadastrados.add(cliente)) {
                    campoResultado.setText("Erro ao cadastrar cliente");
                }else {
                    cliente = new Cliente(campoNome.getName());
                    clientesCadastrados.add(cliente);
                    campoResultado.setText(cliente.toString());
                    for (Cliente cliente1 : clientesCadastrados) {
                        vendedora.adicionarCliente(cliente1);
                    }
                }
            }
        });
        showClientsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!clientesCadastrados.isEmpty()) {
                    for(Cliente cliente1 : clientesCadastrados){
                        vendedora.adicionarCliente(cliente1);
                        campoResultado.setText(cliente1.toString());
                    }
                }else {
                    campoResultado.setText("Lista de clientes está vazia");
                }
            }
        });
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}