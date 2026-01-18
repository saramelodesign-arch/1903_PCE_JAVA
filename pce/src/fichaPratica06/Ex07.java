package fichaPratica06;

/**
 * Contar linhas e palavras
 *
 * O programa lê um ficheiro de texto linha a linha.
 * Para cada linha não vazia, incrementa o contador de linhas.
 * A linha é dividida em palavras usando split(" ") e o número de palavras é acumulado.
 * No final da leitura, são apresentados o total de linhas e o total de palavras encontradas no ficheiro.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex07 {
    //Programa que lê o conteúdo de um arquivo de texto e imprime o número de linhas
    //e o número de palavras presentes neste arquivo
    public static void main(String[] args) throws FileNotFoundException {

        //Indicar o caminho do ficheiro
        File arquivo = new File ("Ficheiros/ficheiro_Ex_07_08_09.txt");

        //Leitor do arquivo
        Scanner leitor = new Scanner (arquivo);

        //Declarar variáveis e inicializar a 0
        String linha = " ";
        int totalLinhas = 0;
        int totalPalavras = 0;

        //Fazer a contagem das linhas e das palavras
        while(leitor.hasNextLine()){
            linha = leitor.nextLine(); //Ler linha
            if (!linha.trim().isEmpty()) { //Se a linha não estiver vazia
                totalLinhas++; //Incrementar o contador de linhas
                String[] palavras = linha.split(" "); //Dividir a linha em palavras
                totalPalavras += palavras.length; // aumentar totalPalavras pelo número de palavras encontradas
            }

        }
        //Mostrar o resultado no terminal
        System.out.println("O número de linhas é: " + totalLinhas);
        System.out.println("O número de palavras é: " + totalPalavras);

        leitor.close();

    }
}
