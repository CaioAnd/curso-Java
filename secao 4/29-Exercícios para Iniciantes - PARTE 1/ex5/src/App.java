import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int peca1 = scan.nextInt();
        int quant1 = scan.nextInt();
        double valor1 = scan.nextDouble();

        int peca2 = scan.nextInt();
        int quant2 = scan.nextInt();
        double valor2 = scan.nextDouble(); 

        System.out.printf("VALOR A PAGAR: R$ %.2f", ((valor1 * quant1) + (valor2 * quant2)));
    }
}
