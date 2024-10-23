package Telas;

import Dados.GaragemCarros;
import Dados.Vendedora;
import Dados.Carro;

import javax.swing.*;
import java.awt.event.*;

public class TelaEditarCarros extends JDialog {
    private JPanel contentPane;
    private JButton editButton, backButton;
    private JLabel placaTexto, marcaTexto;
    private JTextField campoPlaca, campoResultado, campoMarca, fieldNewPlaca, fieldNewMarca;
    private GerenciarTelas gerenciarTelas;
    private GaragemCarros garagemCarros;
    private String placa, marca, novaPlaca, novaMarca;

    public void telaEditarCarros(Vendedora vendedora) {
        setVisible(true);
        setContentPane(contentPane);
        setModal(true);
        setSize(700, 600); //Tamanho da tela
        setLocationRelativeTo(null);
        gerenciarTelas = new GerenciarTelas();
        garagemCarros = vendedora.getGaragem();

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gerenciarTelas.trocarTela(0, vendedora);
                dispose();
            }
        });
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                placa = campoPlaca.getText();
                marca = campoMarca.getText();
                if (placa != null && marca != null) {
                    Carro carro = garagemCarros.consultarCarro(placa);
                    campoResultado.setText("Carro antes: ");
                    novaMarca = fieldNewMarca.getText();
                    novaPlaca = fieldNewPlaca.getText();
                    carro.setMarca(novaMarca);
                    carro.setPlaca(novaPlaca);
                    campoResultado.setText("Carro antes: ");
                }
            }
        });
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
