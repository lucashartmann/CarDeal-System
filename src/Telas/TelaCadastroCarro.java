package Telas;

import Dados.Carro;
import Dados.GaragemCarros;
import Dados.Vendedora;

import javax.swing.*;
import java.awt.event.*;

public class TelaCadastroCarro extends JDialog {
    private JPanel contentPane;
    private JButton voltarButton;
    private JButton cadastrarButton;
    private JTextField campoPlaca;
    private JTextField campoResultado;
    private JTextField campoMarca;
    private JLabel placaTexto;
    private JLabel marcaTexto;
    private GerenciarTelas gerenciarTelas;
    private String placa;
    private String marca;
    private Carro carro;
    private GaragemCarros garagemCarros;

    public void screen(Vendedora vendedora) {
        setVisible(true);
        setContentPane(contentPane);
        setModal(true);
        setSize(700, 600); //Tamanho da tela
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
                placa = campoPlaca.getName();
                marca = campoPlaca.getName();
                carro = new Carro(placa, marca);
                garagemCarros = vendedora.getGaragem();
                garagemCarros.adicionar(carro);
                campoResultado.setText(garagemCarros.listaCarros());
            }
        });

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

}
