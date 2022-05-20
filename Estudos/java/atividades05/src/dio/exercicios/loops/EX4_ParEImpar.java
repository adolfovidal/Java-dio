package dio.exercicios.loops;

import java.util.Scanner;

public class EX4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qntNumeros;
        int numero;
        int qntsPares = 0, qntsImpares = 0;


        System.out.println("Quantidade de números: ");
        qntNumeros = scan.nextInt();

        int count = 0;
        do {

            System.out.println("Números");
            numero = scan.nextInt();

            if (numero % 2 == 0) qntsPares++;
            else qntsImpares++;

            count ++;
        } while (count < qntNumeros);

        System.out.println("Quantidade Par: " + qntsPares);
        System.out.println("Quantidade Impar: " + qntsImpares);

    }
}
