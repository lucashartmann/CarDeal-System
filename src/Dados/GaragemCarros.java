package Dados;

import java.util.ArrayList;

public class GaragemCarros {

    private Carro carro;
    private ArrayList<Carro> garagem;
    private int tamanho;
    private int quantidadeCarros;

    public GaragemCarros() {
        garagem = new ArrayList<Carro>();
    }

    public int tamanho() {
        tamanho = garagem.size();
        return tamanho;
    }

    public boolean adicionar(Carro carro) {
        if (garagem.contains(carro)) {
            System.out.println("carro já presente na lista");
            return false;
        } else {
            garagem.add(carro);
            quantidadeCarros++;
            System.out.println("Carro adicionado");
            return true;
        }
    }

    public boolean remover(Carro carro) {
        if (garagem.isEmpty()) {
            System.out.println("A garagem está vazia");
            return false;
        } else if (!garagem.contains(carro)) {
            System.out.println("O carro não está cadastrado");
            return false;
        } else {
            garagem.remove(carro);
            quantidadeCarros--;
            System.out.println("Carro removido");
            return true;
        }
    }

    public Carro consultarCarroPorPlaca(String placa) {
        if (!garagem.isEmpty()) {
            for (Carro carro : garagem) {
                if (carro.getPlaca().equals(placa)) {
                    return carro;
                } else {
                    return null;
                }
            }
            return null;
        } else {
            System.out.println("A garagem está vazia");
            return null;
        }
    }

    public Carro consultarCarroPorPlacaMarca(String placa, String marca) {
        if (!garagem.isEmpty()) {
            for (Carro carro : garagem) {
                if (carro.getPlaca().equals(placa) && carro.getMarca().equals(marca)) {
                    return carro;
                } else {
                    return null;
                }
            }
            return null;
        } else {
            System.out.println("A garagem está vazia");
            return null;
        }
    }

    public String listaCarros() {
        if(!garagem.isEmpty()) {
            System.out.println("-- Lista de carros --");
            for (Carro a : garagem) {
                return (a.toString());
            }
            return null;
        }else {
            System.out.println("A garagem está vazia");
            return null;
        }
    }

    public int getQuantidadeCarros() {
        return quantidadeCarros;
    }

    @Override
    public String toString() {
        return "GaragemCarros [carro=" + carro + ", garagem=" + garagem + ", tamanho=" + tamanho + "]";
    }

}
