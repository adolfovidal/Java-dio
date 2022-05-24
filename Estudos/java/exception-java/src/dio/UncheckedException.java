package dio;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerdor: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Result: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada invalida, informe um numero inteiro!" + e.getMessage());
                e.printStackTrace();
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0!" + e.getMessage());
                e.printStackTrace();
            } finally {
                System.out.println("Chegou no finally!");
            }
        } while (continueLooping);

        System.out.println("O código continua..");
    }

    public static int dividir(int a, int b){
        return a /b;
    }
}
