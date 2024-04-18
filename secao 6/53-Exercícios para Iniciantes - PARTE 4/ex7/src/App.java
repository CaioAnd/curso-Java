import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int quadrado = (int) Math.pow(i, 2);
            int cubo = (int) Math.pow(i, 3);
            
            System.out.println(i + " " + quadrado + " " + cubo);
        }

        sc.close();
    }
}
