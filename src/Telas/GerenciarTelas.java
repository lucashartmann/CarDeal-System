package Telas;

import Dados.Vendedora;

public class GerenciarTelas {
    public int trocaTela;

    public void executar(Vendedora vendedora, GerenciarTelas gt) {
        trocarTela(trocaTela, vendedora, gt);
    }

    public void trocarTela(int trocaTela, Vendedora vendedora, GerenciarTelas gerenciarTelas) {
        TelaMenu menu = new TelaMenu();
        TelaCadastroCarro cadastro_carro = new TelaCadastroCarro();
        TelaCadastroCliente cadastro_cliente = new TelaCadastroCliente();
        menu.screen(vendedora, gerenciarTelas);
        switch (trocaTela) {
            case 0:
                menu.screen(vendedora, gerenciarTelas);
                break;
            case 1:
                cadastro_carro.screen(vendedora, gerenciarTelas);
                break;
            case 2:
                cadastro_cliente.screen(vendedora, gerenciarTelas);
                break;
            default:
                break;
        }
    }

    public void setTrocaTela(int trocaTela) {
        this.trocaTela = trocaTela;
    }

}
