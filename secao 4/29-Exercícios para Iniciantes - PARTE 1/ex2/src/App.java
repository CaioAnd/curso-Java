import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        
        double x = scan.nextDouble();

        System.out.printf("A=%.4f\n",(3.14159 * Math.pow(x, 2)));

        scan.close();
    }
}
