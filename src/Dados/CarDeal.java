package Dados;

import java.util.Scanner;

public class CarDeal {

    private GaragemCarros garagemJohns = new GaragemCarros();
    private Vendedora johnsCarros = new Vendedora(garagemJohns);
    private Scanner sc = new Scanner(System.in);

    public void Executar() {
        CarDeal app = new CarDeal();
        app.menu();
    }

    public void menu() {
        sc = new Scanner(System.in);
        System.out.println("\nDigite o número do procedimento");
        System.out.println("1 -- Gerenciar carros");
        System.out.println("2 -- Gerenciar clientes");
        System.out.println("3 -- Incluir venda");
        System.out.println("4 -- Encerrar o programa");

        int number = sc.nextInt();
        switch (number) {
            case 1:
                menuCarros();
                break;
            case 2:
                menuClientes();
                break;
            case 3:
                venda();
                break;
            case 4:
                sc.close();
                System.out.println("Programa encerrado");
                System.exit(1);
                break;
            default:
                System.out.println("Caracter inválido. Tente novamente");
                break;
        }
        menu();
    }

    public void menuCarros() {
        Carro carro;
        String marca, placa;
        int option;

        System.out.println("\nDigite o número do procedimento: ");
        System.out.println("1 -- Adicionar carro");
        System.out.println("2 -- Remover carro");
        System.out.println("3 -- Ver carros");
        System.out.println("4 -- Ver quantidade de carros");
        System.out.println("5 -- Sair do menu de carros");
        option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Digite a marca do carro que deseja adicionar:");
                marca = sc.next();
                System.out.println("Digite a placa do carro que deseja adicionar:");
                placa = sc.next();
                carro = new Carro(placa, marca);
                garagemJohns.adicionar(carro);
                System.out.println(carro.toString());
                break;
            case 2:
                System.out.println("Digite a placa do carro que deseja remover:");
                placa = sc.next();
                carro = garagemJohns.consultarCarro(placa);
                garagemJohns.remover(carro);
                break;
            case 3:
                garagemJohns.listaCarros();
                break;
            case 4:
                garagemJohns.getQuantidadeCarros();
                break;
            case 5:
                break;
            default:
                System.out.println("Numero inválido. Tente novamente");
                break;
        }
        menuCarros();

    }

    public void menuClientes() {
        Cliente cliente;
        String nome;
        int option;

        System.out.println("\nDigite o número do procedimento: ");
        System.out.println("1 -- Adicionar cliente");
        System.out.println("2 -- Remover cliente");
        System.out.println("3 -- Ver clientes");
        System.out.println("4 -- Ver quantidade de clientes");
        System.out.println("5 -- Sair do menu de clientes");
        option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Digite o nome do cliente que deseja adicionar:");
                nome = sc.next();
                cliente = new Cliente(nome);
                johnsCarros.adicionarCliente(cliente);
                System.out.println(cliente.toString());
                break;
            case 2:
                System.out.println("Digite o nome do cliente que deseja remover:");
                nome = sc.next();
                cliente = johnsCarros.consultarClientela(nome);
                johnsCarros.removerCliente(cliente);
                break;
            case 3:
                johnsCarros.listaClientes();
                break;
            case 4:
                johnsCarros.getQuantidadeClientes();
                break;
            case 5:
                break;
            default:
                System.out.println("Numero inválido. Tente novamente");
                break;
        }
        menuClientes();

    }

    public void venda() {
        String marca, placa, comprador;
        double valor;
        Carro carro;

        System.out.println("Digite a marca do carro que foi vendido:");
        marca = sc.next();
        System.out.println("Digite a placa do carro foi vendido:");
        placa = sc.next();
        System.out.println("Digite o valor pelo o qual o carro foi vendido:");
        valor = sc.nextDouble();
        System.out.println("Digite o nome do comprador:");
        comprador = sc.next();
        carro = new Carro(placa, marca);
        johnsCarros.vender(valor, comprador, carro);
        garagemJohns.remover(carro);
        System.out.println("Venda cadastrada");
    }
}