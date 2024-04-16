import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int item = scan.nextInt();
        int quant = scan.nextInt();
        double valor;

        if (item == 1) {
            valor = 4 * quant;
        } else if (item == 2){
            valor = 4.5 * quant;
        } else if (item == 3){
            valor = 5 * quant;
        } else if (item == 4){
            valor = 2 * quant;
        } else {
            valor = 1.5 * quant;
        }

        System.out.printf("Total: R$ %.2f\n", valor);

        scan.close();
    }
}
