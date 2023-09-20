public class ClienteConta {
    String nomeCliente;
    String tipoConta;
    double saldo;

    public ClienteConta() {
        nomeCliente = "Anderson Fonseca";
        tipoConta = "Corrente";
        saldo = 2500.00;
    }

    public void consultaSaldo(double valorAtribuido) {
        System.out.println("Saldo atualizado: " + valorAtribuido);
    }

    public void recebeValor(double valorRecebido) {

        System.out.println("Valor recebido: " + valorRecebido);
        consultaSaldo(saldo + valorRecebido);
    }

    public void transfereValor(double valorRetirado) {
        System.out.println("Valor retirado: " + valorRetirado);
        if (valorRetirado > saldo){
            System.out.println("Esta conta não possui saldo suficiente para esta operação!");
        } else {
            consultaSaldo(saldo - valorRetirado);
        }

    }
}
