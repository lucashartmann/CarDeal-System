package Telas;

import Dados.Vendedora;

public class GerenciarTelas {

    public void trocarTela(int trocaTela, Vendedora vendedora) {
        TelaMenu menu = new TelaMenu();
        TelaCadastroCarro cadastro_carro = new TelaCadastroCarro();
        TelaCadastroCliente cadastro_cliente = new TelaCadastroCliente();
        TelaVendedora dadosVendedora = new TelaVendedora();
        TelaEditarCarros editVehicles = new TelaEditarCarros();
        TelaEditarClientes editClients = new TelaEditarClientes();

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
            case 3:
                editVehicles.telaEditarCarros(vendedora);
                break;
            case 4:
                editClients.telaEditarClientes(vendedora);
                break;
            case 5:
                dadosVendedora.telaVendedora(vendedora);
                break;
            default:
                break;
        }
    }

}
