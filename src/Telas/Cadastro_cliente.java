package Telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Dados.Cliente;
import Dados.Vendedora;

import javax.swing.JLabel;

public class Cadastro_cliente {
    private JPanel clienteJPanel;
    private JFrame clienteJFrame;
    private JButton voltarButton;
    private JButton cadastrarButton;
    private JTextField campoNome;
    private JTextField campoResultado;
    private JLabel nome;

    public void screen(Vendedora vendedora, GerenciarTelas gerenciarTelas) {
        clienteJPanel = new JPanel();
        clienteJFrame = new JFrame("Cadastro cliente");
        nome = new JLabel();
        campoNome = new JTextField("Digite aqui");
        campoResultado = new JTextField();
        voltarButton = new JButton("Voltar");
        cadastrarButton = new JButton("Cadastrar");

        voltarButton.addActionListener(e -> {
            gerenciarTelas.setTrocaTela(0);
            gerenciarTelas.trocarTela(0, vendedora, gerenciarTelas);
        });

        cadastrarButton.addActionListener(e -> {
            String nomeCliente = campoNome.getName();
            Cliente cliente = new Cliente(nomeCliente);
            vendedora.adicionarCliente(cliente);
            campoResultado.setText("Clientes cadastrados com sucesso!");
        });

        nome.setText("Digite o nome do cliente:");
        campoNome.setSize(400, 40);

        clienteJFrame.setSize(700, 600);
        clienteJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clienteJFrame.setVisible(true);
        clienteJFrame.add(clienteJPanel);

        clienteJPanel.add(nome);
        clienteJPanel.add(campoNome);
        clienteJPanel.add(voltarButton);
        clienteJPanel.add(cadastrarButton);
    }

    public JPanel getJPanel() {
        return clienteJPanel;
    }
}
