public class Cliente {
    public String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void getInfo() {
        System.out.print("[Nome: " + getNome() + "] \n");
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + "]";
    }

    

}
