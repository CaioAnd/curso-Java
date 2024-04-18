import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), alc = 0, gas = 0, dsl = 0;

        while (x != 4) {
            switch (x) {
                case 1:
                    alc++;
                    break;
                    
                case 2:
                    gas++;
                    break;

                case 3:
                    dsl++;
                    break;
            }

            x = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alc);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + dsl);

        sc.close();
    }
}
