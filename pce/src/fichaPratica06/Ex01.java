package fichaPratica06;

/**
 * Ler e mostrar o conteúdo de um ficheiro
 *
 * O programa recebe o caminho de um ficheiro de texto e cria um objeto Scanner associado a esse ficheiro.
 * Utiliza um ciclo while com hasNextLine() para ler o ficheiro linha a linha.
 * Cada linha lida é imediatamente impressa na consola.
 * No final da leitura, o Scanner é fechado para libertar recursos.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01 { //Programa que lê o conteúdo de um arquivo e mostra no terminal (consola).
   public static void main(String[] args) throws FileNotFoundException {

        //Indicar o caminho do Ficheiro
        File arquivo = new File ("Ficheiros/ficheiro_Ex_01.txt");

        //Leitor do arquivo
        Scanner leitor = new Scanner (arquivo);

        //Executar a impressão do conteúdo na consola

        String linha;

        //Ciclo para ler o ficheiro
        while(leitor.hasNextLine()){
            linha = leitor.nextLine();//guardar o valor da linha
            System.out.println(linha);
        }
    leitor.close();
    }
}
