import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            double x1 = sc.nextDouble();
            double x2 = sc.nextDouble();

            if (x2 == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                System.out.printf("%.1f\n", x1 / x2);
            }
        }

        sc.close();
    }
}
