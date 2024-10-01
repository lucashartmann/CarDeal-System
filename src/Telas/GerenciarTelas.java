package Telas;

import Dados.Vendedora;

public class GerenciarTelas {
    public int trocaTela;

    public void executar(Vendedora vendedora, GerenciarTelas gt) {
        trocarTela(trocaTela, vendedora, gt);
    }

    public void trocarTela(int trocaTela, Vendedora vendedora, GerenciarTelas gerenciarTelas) {
        Menu menu = new Menu();
        Cadastro_carro cadastro_carro = new Cadastro_carro();
        Cadastro_cliente cadastro_cliente = new Cadastro_cliente();
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
