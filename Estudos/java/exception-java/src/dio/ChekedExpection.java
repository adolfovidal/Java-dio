package dio;

import javax.swing.*;
import java.io.*;

public class ChekedExpection {
    public static void main(String[] args) {
        String nomeArquivo = "romances-blake-crouch.txt";
        try {
            imprimirArquivoConsole(nomeArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo que você deseja imprimir." + e.getCause());
            //e.printStackTrace()
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado, entre em contato com suporte." + e.getCause());
            e.printStackTrace();
        } finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("Apesarda exception ou  nao, o programa continua...");
    }

    public static void imprimirArquivoConsole(String nomeArquivo) throws IOException {
        File file = new File(nomeArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
    }
}
