package Telas;

import Dados.Vendedora;

public class GerenciarTelas {

    public void trocarTela(int trocaTela, Vendedora vendedora) {
        TelaMenu menu = new TelaMenu();
        TelaCadastroCarro cadastro_carro = new TelaCadastroCarro();
        TelaCadastroCliente cadastro_cliente = new TelaCadastroCliente();
        switch (trocaTela) {
            case 0:
                menu.screen(vendedora);
                break;
            case 1:
                cadastro_carro.screen(vendedora);
                break;
            case 2:
                cadastro_cliente.screen(vendedora);
                break;
            default:
                break;
        }
    }

}
