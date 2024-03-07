public class Vendedora {

    private GaragemCarros gc = new GaragemCarros();
    private double valor;
    private String comprador;
    private Carros carro;
    private double saldo;

    public Vendedora(GaragemCarros gc) {
        this.gc = gc;
    }

    public void vender(double valor, String comprador, Carros carro) {
        this.carro = carro;
        this.valor = valor;
        this.comprador = comprador;
    }

}
