import java.util.Scanner;

public class App {

    private static GaragemCarros garagemDoMarcao = new GaragemCarros();
    private static Vendedora marcaoCarros = new Vendedora(garagemDoMarcao);
    private static Scanner sc;

    public static void main(String[] args) {
        App app = new App();
        app.menu();
    }

    public void menu() {
        sc = new Scanner(System.in);
        System.out.println("\nDigite o número do procedimento");
        System.out.println("1 -- Adicionar carros no sistema");
        System.out.println("2 -- Remover carros do sistema");
        System.out.println("3 -- Ver todos os carros do sistema");
        System.out.println("4 -- Incluir venda");
        System.out.println("5 -- Encerrar o programa \n");

        int number = sc.nextInt();
        switch (number) {
            case 1:
                adicionar();
                break;
            case 2:
                remover();
                break;
            case 3:
                lista();
                break;
            case 4:
                venda();
                break;
            case 5:
                System.out.println("Programa encerrado");
                System.exit(1);
                break;
            default:
                System.out.println("Caracter inválido");
                break;
        }
        menu();
    }

    public void adicionar() {
        sc = new Scanner(System.in);
        System.out.println("Digite a marca do carro deseja adicionar:");
        String marca = sc.next();
        System.out.println("Digite a placa do carro deseja adicionar:");
        String placa = sc.next();
        Carros carro = new Carros(placa, marca);
        garagemDoMarcao.adicionar(carro);
    }

    public void remover() {
        sc = new Scanner(System.in);
        System.out.println("Digite a marca do carro que deseja remover:");
        String marca = sc.next();
        System.out.println("Digite a placa do carro deseja remover:");
        String placa = sc.next();
        Carros carro = new Carros(placa, marca);
        garagemDoMarcao.remover(carro);
    }

    public void lista() {
       garagemDoMarcao.lista();
    }

    public void venda() {
        sc = new Scanner(System.in);
        System.out.println("Digite a marca do carro que foi vendido:");
        String marca = sc.next();
        System.out.println("Digite a placa do carro foi vendido:");
        String placa = sc.next();
        System.out.println("Digite o valor pelo o qual o carro foi vendido:");
        Double valor = sc.nextDouble();
        System.out.println("Digite o nome do comprador:");
        String comprador = sc.next();
        Carros carro = new Carros(placa, marca);
        marcaoCarros.vender(valor, comprador, carro);
        garagemDoMarcao.remover(carro);
     }
}