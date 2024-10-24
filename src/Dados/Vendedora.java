package Dados;

import java.util.ArrayList;

public class Vendedora {

    private GaragemCarros garagem = new GaragemCarros();
    private double valor;
    private String comprador;
    private Carro carro;
    private double faturamento;
    private Cliente cliente;
    private ArrayList<Cliente> clientela;
    private int quantidadeClientes;

    public Vendedora(GaragemCarros garagem) {
        clientela = new ArrayList<>();
        this.garagem = garagem;
    }

    public boolean adicionarCliente(Cliente cliente) {
        if (!clientela.contains(cliente)) {
            clientela.add(cliente);
            quantidadeClientes++;
            System.out.println("Cliente adicionado");
            return true;
        } else {
            System.out.println("Cliente já está na lista");
            return false;
        }
    }

    public boolean removerCliente(Cliente cliente) {
        if (clientela.isEmpty()) {
            System.out.println("A lista está vazia");
            return false;
        } else if (!clientela.contains(cliente)) {
            System.out.println("O cliente não está na lista");
            return false;
        } else {
            clientela.remove(cliente);
            quantidadeClientes--;
            System.out.println("Cliente removido");
            return true;
        }
    }

    public Cliente consultarClientela(String nome) {
        if (!clientela.isEmpty()) {
            for (Cliente cliente : clientela) {
                if (cliente.getNome().equals(nome)) {
                    return cliente;
                }
            }
            return null;
        } else {
            System.out.println("A lista de clientes está vazia");
            return null;
        }
    }

    public void vender(double valor, String comprador, Carro carro) {
        this.carro = carro;
        this.valor = valor;
        this.comprador = comprador;
        faturamento += valor;
        garagem.remover(carro);
        removerCliente(cliente);
    }

    public String listaClientes() {
        if(!(clientela.isEmpty())) {
            System.out.println("-- Lista de clientes --");
            for (Cliente a : clientela) {
                return (a.toString());
            }
            return  null;
        }else{
            System.out.println("A lista de clientes está vazia");
            return null;
        }
    }

    public int getQuantidadeClientes() {
        return quantidadeClientes;
    }

    public GaragemCarros getGaragem() {
        if(garagem != null) {
            return garagem;
        }else {
            System.out.println("Não existe garagem");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Vendedora [gc=" + garagem + ", valor=" + valor + ", comprador=" + comprador + ", carro=" + carro + ", saldo="
                + faturamento + ", cliente=" + cliente + ", clientela=" + clientela + "]";
    }

}
