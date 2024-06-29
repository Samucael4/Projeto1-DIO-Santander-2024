import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Olá, seja bem-vindo ao banco, o que deseja fazer? ");
            System.out.println("1: criar conta\n2: olhar detalhes\n3: sair");
            
            try {
                int resposta = scanner.nextInt();

                if (resposta != 1 && resposta != 2 && resposta != 3) {
                    System.out.println("Digite um número válido: 1, 2 ou 3 como resposta!");
                } else {
                    if (resposta == 1) {
                        conta.digitarDetalhes();
                    } else if (resposta == 2) {
                        conta.mostrarDetalhes();
                    } else if (resposta == 3) {
                        scanner.close();
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, digite um número: 1, 2 ou 3.");
                scanner.next(); // Limpa a entrada inválida
            }

        } while (true);
    }
}
