import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), in = 0, out = 0;

        for (int i = 0; i < N; i++) {
            int valor = sc.nextInt();

            if (valor >= 10 && valor <= 20) {
                in++;
            }
            else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}
