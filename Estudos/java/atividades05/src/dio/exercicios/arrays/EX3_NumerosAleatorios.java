package dio.exercicios.arrays;

import java.util.Random;

public class EX3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numAleatorios = new int[20];

        for( int i = 0; i < numAleatorios.length; i++ ) {
            int numero = random.nextInt(100);
            numAleatorios[i] = numero;
        }

        System.out.println("Numeros Aleatorios: ");
        for (int numero : numAleatorios ) {
            System.out.println(numero + " ");
        }

        System.out.println("\nSucessores Numeros Aleatorios: ");
        for (int numero : numAleatorios ) {
            System.out.print((numero+1) + " ");
        }

        System.out.println("\nAntecessores Numeros Aleatorios: ");
        for (int numero : numAleatorios ) {
            System.out.print((numero-1) + " ");
        }
    }
}
