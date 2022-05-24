package dio;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada1 {
    public static void main(String[] args) {
        String nomeArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        imprimirArquivoConsole(nomeArquivo);
        System.out.println("\nCom exception ou não, o programa continua...");
    }

    public static void imprimirArquivoConsole(String nomeArquivo) {

        try {
            BufferedReader br = lerArquivo(nomeArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAberturaArquivoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro não esperado, pro favor, fale com o suporte" + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static BufferedReader lerArquivo(String nomeArquivo) throws ImpossivelAberturaArquivoException {
        File file = new File(nomeArquivo);
        try {
            return new BufferedReader(new FileReader(nomeArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaArquivoException(file.getName(), file.getPath());
        }
    }
}

class ImpossivelAberturaArquivoException extends Exception {

    private String nome;
    private String diretorio;

    public ImpossivelAberturaArquivoException(String nome, String diretorio) {
        super("O arquivo" + nome + "não foi encontrado no diretório" + diretorio);
        this.nome = nome;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaArquivoException{" +
                "nome='" + nome + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}