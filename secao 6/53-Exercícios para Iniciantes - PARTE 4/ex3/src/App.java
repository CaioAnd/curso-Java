import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            double val1 = sc.nextDouble();
            double val2 = sc.nextDouble();
            double val3 = sc.nextDouble();

            System.out.printf("%.1f\n", ((val1 * 2 + val2 * 3 + val3 * 5)) / 10);
        }

        sc.close();
    }
}
