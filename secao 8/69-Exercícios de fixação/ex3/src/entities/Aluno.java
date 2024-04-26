package entities;

public class Aluno {
    public String nome;
    public double nota1, nota2, nota3;

    public double calculaMedia() {
        return nota1 + nota2 + nota3;
    }

    public double pontosFaltando() {
        if (calculaMedia() - 60 >= 0) {
            return 0;
        }
        else {
            return Math.abs(60 - calculaMedia());
        }
    }
    
}
