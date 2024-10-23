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

    public void adicionar(Carro carro) {
        if (garagem.contains(carro)) {
            System.out.println("carro já presente na lista");
        } else {
            garagem.add(carro);
            quantidadeCarros++;
            System.out.println("Carro adicionado");
        }
    }

    public void remover(Carro carro) {
        if (garagem.isEmpty()) {
            System.out.println("A garagem está vazia");
        } else if (!garagem.contains(carro)) {
            System.out.println("O carro não está cadastrado");
        } else {
            garagem.remove(carro);
            quantidadeCarros--;
            System.out.println("Carro removido");
        }
    }

    public Carro consultarCarro(String placa) {
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
            return null;
        }
    }

    public String listaCarros() {
        System.out.println("-- Lista de carros --");
        for (Carro a : garagem) {
            return (a.toString());
        }
        return null;
    }

    public int getQuantidadeCarros() {
        return quantidadeCarros;
    }

    @Override
    public String toString() {
        return "GaragemCarros [carro=" + carro + ", garagem=" + garagem + ", tamanho=" + tamanho + "]";
    }

}
