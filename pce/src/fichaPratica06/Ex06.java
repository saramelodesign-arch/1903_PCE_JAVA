package fichaPratica06;

/**
 * Encontrar a pessoa mais velha
 *
 * O programa lê um ficheiro de texto onde cada linha contém um nome e uma idade separados por vírgula.
 * Cada linha é dividida em partes usando split(",").
 * A idade é convertida de String para int.
 * O programa compara cada idade com a maior encontrada até ao momento e guarda o nome correspondente.
 * No final, imprime o nome e a idade da pessoa mais velha.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex06 {
    //Programa que lê um arquivo de texto que contém nomes e idades
    //separados por vírgulas e mostre o nome da pessoa mais velha no terminal

    public static void main(String[] args) throws FileNotFoundException {

        //Indicar o caminho do ficheiro
        File arquivo = new File ("Ficheiros/ficheiro_Ex_06.txt");

        //Leitor do arquivo
        Scanner leitor = new Scanner (arquivo);

        //Declarar variáveis
        String linha;
        String nomeMaisVelho = "";
        int idadeMaisVelho = 0;

        //Ler uma linha de cada vez
        while(leitor.hasNextLine()){ //Lê a linha inteira
            linha = leitor.nextLine();//guardar o valor da linha
            String[] partes = linha.split(","); //Separar a linha em duas partes
            int idadeAtual = Integer.parseInt(partes[1]); //A idade é lida como String aqui passamos a int

            //Comparar com a maior idade até agora
            if(idadeAtual > idadeMaisVelho){
                idadeMaisVelho = idadeAtual;
                nomeMaisVelho = partes[0];
            }
        }

        //Guardar o nome da pessoa mais velha
        System.out.println("Pessoa mais velha: " + nomeMaisVelho);
        System.out.println("Idade: " + idadeMaisVelho);

        leitor.close();

    }
}
