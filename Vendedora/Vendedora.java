import java.util.ArrayList;

public class Vendedora {

    private GaragemCarros gc = new GaragemCarros();
    private double valor;
    private String comprador;
    private Carro carro;
    private double saldo;
    private Cliente cliente;
    private ArrayList<Cliente> clientela;

    public Vendedora(GaragemCarros gc) {
        clientela = new ArrayList<>();
        this.gc = gc;
    }

    public void adicionarCliente(Cliente cliente) {
        clientela.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientela.remove(cliente);
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
        for (Cliente a : clientela) {
            a.getInfo();
        }
    }

    @Override
    public String toString() {
        return "Vendedora [gc=" + gc + ", valor=" + valor + ", comprador=" + comprador + ", carro=" + carro + ", saldo="
                + saldo + ", cliente=" + cliente + ", clientela=" + clientela + "]";
    }

    

}
