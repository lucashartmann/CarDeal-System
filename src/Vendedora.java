import java.util.ArrayList;

public class Vendedora {

    private GaragemCarros gc = new GaragemCarros();
    private double valor;
    private String comprador;
    private Carro carro;
    private double saldo;
    private Cliente cliente;
    private ArrayList<Cliente> clientela;
    private int quantidadeClientes;

    public Vendedora(GaragemCarros gc) {
        clientela = new ArrayList<>();
        this.gc = gc;
    }

    public void adicionarCliente(Cliente cliente) {
        if (!clientela.contains(cliente)) {
            clientela.add(cliente);
            quantidadeClientes++;
            System.out.println("Cliente adicionado");
        } else {
            System.out.println("Cliente já está na lista");
        }
    }

    public void removerCliente(Cliente cliente) {
        if(clientela.isEmpty()){
            System.out.println("A lista está vazia");
        }else if (!clientela.contains(cliente)) {
            System.out.println("O cliente não está na lista");
        }else {
            clientela.remove(cliente);
            quantidadeClientes--;
            System.out.println("Cliente removido");
        }
    }

    public Cliente consultarClientela(String nome) {
        if (!clientela.isEmpty()) {
            for (int i = 0; i < clientela.size(); i++) {
                Cliente cliente = clientela.get(i);
                if (cliente.getNome().equals(nome)) {
                    return cliente;
                }
            }
            return cliente;
        } else {
            return null;
        }
    }

    public void vender(double valor, String comprador, Carro carro) {
        this.carro = carro;
        this.valor = valor;
        this.comprador = comprador;
    }

    public void listaClientes() {  
        System.out.println("-- Lista de clientes --");
        for (Cliente a : clientela) {
            System.out.println(a.toString());
        }
    }

    public int getQuantidadeClientes() {
        return quantidadeClientes;
    }

    @Override
    public String toString() {
        return "Vendedora [gc=" + gc + ", valor=" + valor + ", comprador=" + comprador + ", carro=" + carro + ", saldo="
                + saldo + ", cliente=" + cliente + ", clientela=" + clientela + "]";
    }

}
