import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando e armazenando os dados da conta bancária
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();
        
        // Fechando o scanner
        scanner.close();
        
        // Exibindo a mensagem formatada
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                           "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +
                           " já está disponível para saque.");
    }
}
