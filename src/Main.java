import Dados.GaragemCarros;
import Dados.Vendedora;
import Telas.GerenciarTelas;

public class Main {
    public static void main(String[] args) throws Exception {
        GerenciarTelas gerenciarTelas = new GerenciarTelas();
        GaragemCarros garagemCarros = new GaragemCarros();
        Vendedora vendedora = new Vendedora(garagemCarros);
        gerenciarTelas.executar(vendedora, gerenciarTelas);
    }
}
