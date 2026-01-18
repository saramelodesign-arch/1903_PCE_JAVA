package fichaPratica06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Palavra mais frequente num ficheiro
 *
 * O programa lê um ficheiro de texto completo linha a linha.
 * Cada linha é dividida em palavras e estas são comparadas entre si para contar quantas vezes aparecem.
 * O programa mantém o registo da palavra com maior número de ocorrências.
 * No final, imprime a palavra mais frequente encontrada no ficheiro.
 */

public class Ex09 {
    // Programa que lê um ficheiro de texto e mostra a palavra mais frequente

    public static void main(String[] args) throws FileNotFoundException {

        // Ficheiro a ler
        File ficheiro = new File("pce/Ficheiros/ficheiro_Ex_07_08_09.txt");
        Scanner leitor = new Scanner(ficheiro);

        // Array para guardar as palavras
        String[] palavras = new String[1000];
        int totalPalavras = 0;

        String linha;

        // Ler o ficheiro linha a linha
        while (leitor.hasNextLine()) {
            linha = leitor.nextLine();

            String[] partes = linha.split(" ");

            for (int i = 0; i < partes.length; i++) {
                palavras[totalPalavras] = partes[i];
                totalPalavras++;
            }
        }

        leitor.close();

        // Variáveis para guardar a palavra mais frequente
        String palavraMaisFrequente = "";
        int maiorContagem = 0;

        // Contar ocorrências
        for (int i = 0; i < totalPalavras; i++) {
            int contador = 0;

            for (int j = 0; j < totalPalavras; j++) {
                if (palavras[i].equals(palavras[j])) {
                    contador++;
                }
            }

            if (contador > maiorContagem) {
                maiorContagem = contador;
                palavraMaisFrequente = palavras[i];
            }
        }

        // Mostrar resultado
        System.out.println("Palavra mais frequente: " + palavraMaisFrequente);
        System.out.println("Número de ocorrências: " + maiorContagem);
    }
}
