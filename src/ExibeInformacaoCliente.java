import java.util.Scanner;

public class ExibeInformacaoCliente extends ClienteConta{
    Scanner leitor = new Scanner(System.in);
    int opcao;
    double valorOperacao;
    ClienteConta cliente;

       public ExibeInformacaoCliente() {
        cliente = new ClienteConta();
    }

    void dadosIniciais() {
        System.out.println("***********************");
        System.out.println("\nNome: " + cliente.nomeCliente);
        System.out.println("Tipo da conta: " + cliente.tipoConta);
        System.out.println("Saldo inicial: " + cliente.saldo);
        System.out.println("\n***********************");

    }

    void menuOperacoes() {
        do {
            System.out.println("Operações");
            System.out.println("1 - Consultar Saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    consultaSaldo(cliente.saldo);
                    break;
                case 2:
                    System.out.print("valor a ser recebido: ");
                    recebeValor(valorOperacao = leitor.nextDouble());
                    break;
                case 3:
                    System.out.print("valor a ser transferido: ");
                    transfereValor(valorOperacao = leitor.nextDouble());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("insira um número de acordo com o menu!");
            }
        } while (opcao != 4);
    }
}
