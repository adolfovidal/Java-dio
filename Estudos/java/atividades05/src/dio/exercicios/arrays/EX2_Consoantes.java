package dio.exercicios.arrays;

import java.util.Scanner;

public class EX2_Consoantes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];

        int qntConsoantes = 0;


        int count = 0;
        do {

            System.out.println("Letra: ");
            String letra = scan.next();

            if (! (letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                qntConsoantes++;
            }

            count++;

        } while(count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null)
            System.out.println(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + qntConsoantes);
        System.out.println(consoantes.length);
    }
}
