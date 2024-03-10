import java.util.ArrayList;

public class GaragemCarros {

    private Carro carro;
    private ArrayList<Carro> garagem;
    private int tamanho;

    public GaragemCarros() {
        garagem = new ArrayList<Carro>();
    }

    public int tamanho() {
        tamanho = garagem.size();
        return tamanho;
    }

    public void adicionar(Carro carro) {
        this.carro = carro;
        for (int i = 0; i <= tamanho; i++) {
            if (garagem.contains(carro)) {
                System.out.println("carro já presente na lista");
            } else {
                garagem.add(carro);
                System.out.println("Carro adicionado");
            }
        }
    }

    public void remover(Carro carro) {
        this.carro = carro;
        for (int i = 0; i <= tamanho; i++) {
            if (garagem.contains(carro)) {
                garagem.remove(carro);
                System.out.println("Carro removido");
            } else {
                System.out.println("Carro não existe na lista");
            }
        }
    }

    public Carro consultarCarro(String placa) {
        if (!garagem.isEmpty()) {
            for (int i = 0; i <= garagem.size(); i++) {
                Carro carro = garagem.get(i);
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

    public void listaCarros() {
        for (Carro a : garagem) {
            a.getInfo();
        }
    }

    @Override
    public String toString() {
        return "GaragemCarros [carro=" + carro + ", garagem=" + garagem + ", tamanho=" + tamanho + "]";
    }

}
