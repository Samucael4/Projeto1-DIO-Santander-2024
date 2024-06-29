import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    Scanner scanner = new Scanner(System.in);

    public void digitarDetalhes() {
        System.out.print("Digite o número da agência: ");
        agencia = scanner.nextLine();
        
        System.out.print("Digite o número da conta: ");
        numero = scanner.nextInt();
        
        scanner.nextLine(); 
        
        System.out.print("Digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();
        
        System.out.print("Digite o saldo inicial: ");
        saldo = scanner.nextDouble();
        
        //scanner.close();
    }

    public void mostrarDetalhes() {
        System.out.println("Detalhes da Conta:");
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numero);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo Inicial: " + saldo);
    }

}
