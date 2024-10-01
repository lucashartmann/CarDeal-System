package Telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Dados.Carro;
import Dados.Cliente;
import Dados.GaragemCarros;
import Dados.Vendedora;

public class Cadastro_carro {
    private JPanel carroJPanel;
    private JFrame carroJFrame;
    private JButton voltarButton;
    private JButton cadastrarButton;
    private JTextField campoPlaca;
    private JTextField campoResultado;
    private JTextField campoMarca;
    private JLabel placaTexto;
    private JLabel marcaTexto;

    public void screen(Vendedora vendedora, GerenciarTelas gerenciarTelas) {
        carroJPanel = new JPanel();
        carroJFrame = new JFrame("Cadastro Carro");
        voltarButton = new JButton("Voltar");
        campoMarca = new JTextField("Digite aqui a marca");
        placaTexto = new JLabel();
        campoPlaca = new JTextField();
        marcaTexto = new JLabel();
        campoResultado = new JTextField();
        cadastrarButton = new JButton("Cadastrar carro");

        voltarButton.addActionListener(e -> {
            gerenciarTelas.setTrocaTela(0);
            gerenciarTelas.trocarTela(0, vendedora, gerenciarTelas);
        });

        cadastrarButton.addActionListener(e -> {
            String placa = campoPlaca.getName();
            String marca = campoPlaca.getName();
            Carro carro = new Carro(placa, marca);
            GaragemCarros garagemCarros = vendedora.getGaragem();
            garagemCarros.adicionar(carro);
            campoResultado.setText("Carros cadastrados com sucesso!");
        });

        placaTexto.setText("Digite a placa do carro:");
        marcaTexto.setText("Digite a marca do carro:");

        carroJFrame.setSize(700, 600);
        carroJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        carroJFrame.add(carroJPanel);
        carroJFrame.setVisible(true);

        carroJPanel.add(voltarButton);
        carroJPanel.add(campoMarca);
        carroJPanel.add(campoPlaca);
        carroJPanel.add(campoResultado);
        carroJPanel.add(cadastrarButton);
        carroJPanel.add(marcaTexto);
        carroJPanel.add(placaTexto);
    }

    public JPanel getJPanel() {
        return carroJPanel;
    }
}
