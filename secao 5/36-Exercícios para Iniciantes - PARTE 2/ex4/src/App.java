import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int inicio = scan.nextInt();
        int fim = scan.nextInt();
        int horas;

        if (inicio < fim) {
            horas = fim - inicio;
        } else {
            horas = fim + 24 - inicio;
        }

        System.out.println("O JOGO DUROU " + horas + " HORA(S)");

        scan.close();
    }
}
