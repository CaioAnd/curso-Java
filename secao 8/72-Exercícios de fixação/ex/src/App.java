import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("What is the dollar price? ");
        double dollarValue = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollarQuantity = sc.nextDouble();

        System.out.printf("Amont to be paid in reais = %.2f", CurrencyConverter.converter(dollarValue, dollarQuantity));

        sc.close();
    }
}
