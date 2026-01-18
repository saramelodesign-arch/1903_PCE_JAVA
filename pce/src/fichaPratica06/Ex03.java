package fichaPratica06;

/**
 * Copiar o conteúdo de um ficheiro para outro
 *
 * O programa abre um ficheiro de origem com um Scanner e cria um ficheiro de destino com um PrintWriter.
 * Utiliza um ciclo para ler cada linha do ficheiro original.
 * Cada linha lida é mostrada no ecrã e escrita no novo ficheiro.
 * No final, ambos os ficheiros são fechados e é apresentada uma mensagem de confirmação.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex03 {
    // Programa que lê o conteúdo de um arquivo de texto e copia-o para outro arquivo
    public static void main(String[] args) throws FileNotFoundException {

        // Indicar o caminho do ficheiro a copiar
        File arquivoParaCopiar = new File("Ficheiros/ficheiro_Ex_01.txt");

        // Leitor do arquivo
        Scanner leitor = new Scanner(arquivoParaCopiar);

        // Indicar o caminho do ficheiro destino
        File arquivoParaColar = new File("Ficheiros/ficheiro_Ex_03.txt");

        // Máquina para escrever
        PrintWriter maquinaEscrever = new PrintWriter(arquivoParaColar);

        // Ciclo para ler e copiar o ficheiro
        while (leitor.hasNextLine()) {
            String texto = leitor.nextLine(); // guardar o valor da linha
            System.out.println(texto);        // mostrar no ecrã
            maquinaEscrever.println(texto);   // escrever no novo ficheiro
        }

        // Fechar o leitor e a máquina
        leitor.close();
        maquinaEscrever.close();

        System.out.println("Cópia concluída com sucesso!");
    }
}