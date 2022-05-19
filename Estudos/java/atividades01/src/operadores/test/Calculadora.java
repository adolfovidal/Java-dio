package operadores.test;

public class Calculadora {

    public static void soma(double number01, double number02) {

        double result = number01 + number02;

        System.out.println("A soma de " + number01 + " mais " + number02 + " é  " + result);
    }

    public static void subtracao(double number01, double number02) {
        double result = number01 - number02;

        System.out.println("A subtração de " + number01 + " menos " + number02 + " é " + result);
    }

    public static void multiplicacao(double number01, double number02) {
        double result = number01 * number02;

        System.out.println("A multiplicação de " + number01 + " vezes " + number02 + " é " + result);
    }

    public static void divisao(double number01, double number02) {
        double result = number01 / number02;

        System.out.println("A divisão de " + number01 + " por " + number02 + " é " + result);
    }
}


