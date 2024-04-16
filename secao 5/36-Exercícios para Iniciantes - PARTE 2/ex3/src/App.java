import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        scan.close();
    }
}
