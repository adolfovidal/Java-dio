package dio;

import java.util.Scanner;

public class CalculadoraMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Paulinha", "Pingo", "Laurinha", "Lucas"};

        double media = calculoMediaTurma(alunos, scan);

        System.out.printf("Media da turma %1f", media);
    }

    public static double calculoMediaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for (String aluno: alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }
}
