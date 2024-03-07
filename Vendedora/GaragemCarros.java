import java.util.ArrayList;

public class GaragemCarros {

    private Carros carro;
    private ArrayList<Carros> garagem;
    private int tamanho;

    public GaragemCarros() {
        garagem = new ArrayList<Carros>();
    }

    public int tamanho() {
        tamanho = garagem.size();
        return tamanho;
    }

    public void adicionar(Carros carro) {
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

    public void remover(Carros carro) {
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

    public void lista() {
        for (Carros a : garagem) {
            a.getInfo();
        }
    }

}
