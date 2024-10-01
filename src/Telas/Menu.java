package Telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Dados.Vendedora;

public class Menu {

    private JPanel menuJPanel;
    private JFrame menuJFrame;
    private JButton cadastroCarroButton;
    private JButton cadastroClienteButton;

    public void screen(Vendedora vendedora, GerenciarTelas gerenciarTelas) {
        menuJPanel = new JPanel();
        menuJFrame = new JFrame("Menu");
        cadastroCarroButton = new JButton("Cadastrar Carro");
        cadastroClienteButton = new JButton("Cadastrar Cliente");

        cadastroCarroButton.addActionListener(e -> {
            gerenciarTelas.setTrocaTela(1);
            gerenciarTelas.trocarTela(1, vendedora, gerenciarTelas);
        });
        cadastroClienteButton.addActionListener(e -> {
            gerenciarTelas.setTrocaTela(2);
            gerenciarTelas.trocarTela(2, vendedora, gerenciarTelas);
        });

        menuJFrame.setSize(700, 600);
        menuJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuJFrame.add(menuJPanel);
        menuJFrame.setVisible(true);

        menuJPanel.add(cadastroCarroButton);
        menuJPanel.add(cadastroClienteButton);
    }

    public JPanel getJPanel() {
        return menuJPanel;
    }

}
