import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o seu nome:");
        String nomeCliente =  scanner.next();

        System.out.println("Informe a sua agência:");
        String agencia =  scanner.next();

        System.out.println("Informe número da conta:");
        int numero =  scanner.nextInt();

        System.out.println("Informe o seu saldo:");
        double saldo =  scanner.nextDouble();


        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco " +
                "sua agência é " + agencia  + ", conta " + numero + " e seu saldo " + saldo +
                " já está disponível para saque");
    }
}