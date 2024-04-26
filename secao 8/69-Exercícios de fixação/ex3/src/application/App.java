package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Aluno aluno = new Aluno();

        aluno.nome = sc.nextLine();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f\n", aluno.calculaMedia());

        if (aluno.pontosFaltando() == 0) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS\n", aluno.pontosFaltando());
        }

        sc.close();
    }
}
