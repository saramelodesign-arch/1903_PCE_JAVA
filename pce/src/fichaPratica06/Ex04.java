package fichaPratica06;

/**
 * Ler um ficheiro CSV
 *
 * O programa abre um ficheiro CSV como se fosse um ficheiro de texto normal.
 * Utiliza um Scanner para ler o conteúdo linha a linha.
 * Cada linha é impressa diretamente na consola, mantendo o formato original do ficheiro CSV.
 * Não é feita qualquer separação dos campos, apenas leitura e apresentação.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex04 { //Programa que lê um arquivo CSV(Comma-Separed Values) e mostra o conteúdo no terminal
    public static void main(String[] args) throws FileNotFoundException {

        //Indicar o caminho do Arquivo
        File arquivo = new File ("Ficheiros/arquivo_Ex04.csv");

        //Leitor do arquivo
        Scanner leitor = new Scanner (arquivo);

        //Executar a impressão do conteúdo na consola
        String conteudo;

        //Ciclo para ler o ficheiro
        while(leitor.hasNextLine()){
            conteudo = leitor.nextLine();//guardar o valor da linha
            System.out.println(conteudo);
        }

        leitor.close();
    }
}
