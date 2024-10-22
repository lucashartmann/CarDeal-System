package Telas;

import Dados.Carro;
import Dados.GaragemCarros;
import Dados.Vendedora;

import javax.swing.*;
import java.awt.event.*;

public class TelaCadastroCarro extends JDialog {
    private JPanel contentPane;
    private JTextField digiteAquiAMarcaTextField;
    private JButton voltarButton;
    private JButton cadastrarButton;
    private JTextField digiteAquiAPlacaTextField;
    private JTextField textField1;
    private JTextField campoPlaca;
    private JTextField campoResultado;
    private JTextField campoMarca;
    private JLabel placaTexto;
    private JLabel marcaTexto;
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
                String placa = campoPlaca.getName();
                String marca = campoPlaca.getName();
                Carro carro = new Carro(placa, marca);
                GaragemCarros garagemCarros = vendedora.getGaragem();
                garagemCarros.adicionar(carro);
                campoResultado.setText("Carros cadastrados com sucesso!");
            }
        });

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

}
