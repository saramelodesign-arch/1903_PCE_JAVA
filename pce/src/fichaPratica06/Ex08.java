package fichaPratica06;

/**
 * Filtrar linhas por palavra e gravar noutro ficheiro
 *
 * O programa lê um ficheiro de texto linha a linha.
 * Para cada linha, verifica se contém uma palavra específica.
 * Sempre que a condição é verdadeira, a linha é escrita num novo ficheiro através de um PrintWriter.
 * No final, apenas as linhas que cumprem o critério ficam guardadas no novo ficheiro.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex08 {
    // Programa que lê um ficheiro de texto e grava noutro ficheiro
    // apenas as linhas que contêm uma palavra específica

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        File ficheiroOrigem = new File("pce/Ficheiros/ficheiro_Ex_07_08_09.txt");
        Scanner leitor = new Scanner(ficheiroOrigem);

        File ficheiroDestino = new File("pce/Ficheiros/ficheiro_Ex_08_resultado.txt");
        PrintWriter escritor = new PrintWriter(ficheiroDestino);

        System.out.print("Digite a palavra a procurar: ");
        String palavra = input.nextLine();

        String linha;
        boolean encontrou;

        while (leitor.hasNextLine()) {
            linha = leitor.nextLine();
            encontrou = false;

            String[] palavras = linha.split(" ");

            for (int i = 0; i < palavras.length; i++) {
                if (palavras[i].equals(palavra)) {
                    encontrou = true;
                }
            }

            if (encontrou) {
                escritor.println(linha);
            }
        }

        leitor.close();
        escritor.close();
        input.close();

        System.out.println("Ficheiro criado com sucesso.");
    }
}
