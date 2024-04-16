import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        double X = scan.nextDouble();
        double Y = scan.nextDouble();

        if (X == 0 && Y != 0) {

            System.out.println("Eixo X");

        } else if(Y == 0 && X != 0) {

            System.out.println("Eixo Y");

        } else if(X > 0 && Y > 0) {

            System.out.println("Q1");

        } else if(X < 0 && Y > 0) {

            System.out.println("Q2");

        } else if(X < 0 && Y < 0) {

            System.out.println("Q3");

        } else if(X > 0 && Y < 0) {

            System.out.println("Q4");

        } else {

            System.out.println("Origem");

        }

        scan.close();
    }
}
