import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.printf("%nDigite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.printf("%nDigite número da conta (Ex.: 1234): ");
        int numero = scanner.nextInt();

        System.out.printf("%nDigite a agência da conta (Ex.: 000-1): ");
        String agencia = scanner.next();

        System.out.printf("%nDigite o seu saldo (105.25): ");
        double saldo = scanner.nextDouble();

        Conta usuario = new Conta(numero, agencia, nome, saldo);

        System.out.printf("%n%nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque!", usuario.Nome, usuario.Agencia, usuario.Numero, usuario.Saldo);
    }
}
