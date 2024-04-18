import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), fatorial = N;

        if (N == 0) {
            fatorial = 1;
        }
        else {
            for (int i = N - 1; i > 0; i--) {
                fatorial *= i;
            }
        }

        System.out.println(fatorial);

        sc.close();
    }
}
