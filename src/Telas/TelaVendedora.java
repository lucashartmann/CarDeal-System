package Telas;

import Dados.GaragemCarros;
import Dados.Vendedora;

import javax.swing.*;
import java.awt.event.*;

public class TelaVendedora extends JDialog {
    private JPanel contentPane;
    private JButton vehiclesButton;
    private JButton clientsButton;
    private JTextField fieldResult;
    private JButton backButton;
    private JButton allDataButton;
    private GerenciarTelas gerenciarTelas;
    private GaragemCarros garagem;

    public void telaVendedora(Vendedora vendedora) {
        setVisible(true);
        setContentPane(contentPane);
        setModal(true);
        setSize(700, 600); //Tamanho da tela
        setLocationRelativeTo(null);
        gerenciarTelas = new GerenciarTelas();
        garagem = vendedora.getGaragem();

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gerenciarTelas.trocarTela(0, vendedora);
                dispose();
            }
        });
        vehiclesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String resultadoConsulta = "Quantidade de carros: " + garagem.getQuantidadeCarros() + "\n" + garagem.listaCarros();
                fieldResult.setText(resultadoConsulta);
            }
        });
        clientsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String resultadoConsulta = "Quantidade de clientes: " + vendedora.getQuantidadeClientes() + "\n" + vendedora.listaClientes();
                fieldResult.setText(resultadoConsulta);
            }
        });
        allDataButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String resultadoConsultaCarros = "Quantidade de carros: " + garagem.getQuantidadeCarros() + "\n" + garagem.listaCarros();
                String resultadoConsultaClientes = "Quantidade de clientes: " + vendedora.getQuantidadeClientes() + "\n" + vendedora.listaClientes();
                fieldResult.setText(resultadoConsultaCarros + "\n" + resultadoConsultaClientes);
            }
        });
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
