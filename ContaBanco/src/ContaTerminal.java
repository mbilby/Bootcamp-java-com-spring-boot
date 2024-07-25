import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {

        int numero=0;
        String agencia;
        String nomeCliente;
        double saldo=0.00;
        boolean validacao = false;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {

            System.out.println("Por favor, digite o número de sua agência : ");
            agencia = scanner.next();

            while (!validacao) {
                try {
                    System.out.println("Por favor, digite o número de sua Conta : ");
                    numero = scanner.nextInt();
                    validacao = true;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, digite um número válido para a conta.");
                    scanner.next();
                }
                
            }
            
            scanner.nextLine();
            System.out.println("Por favor, digite o seu nome : ");
            nomeCliente = scanner.nextLine();

            validacao = false;
            while (!validacao) {
                try {
                    System.out.println("Por favor, digite o seu saldo : ");
                    saldo = scanner.nextDouble();
                    validacao = true;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, digite um valor válido para o saldo.");
                    scanner.next(); 
                }
            }


            String saldoFormatado = String.format(Locale.US, "%.2f", saldo);

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldoFormatado + " já está disponível para saque");

        } finally {
            scanner.close();
        }

        
    }
}
