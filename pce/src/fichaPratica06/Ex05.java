package fichaPratica06;

/**
 * Somar números inteiros de um ficheiro
 *
 * O programa lê um ficheiro de texto que contém números inteiros separados por espaços.
 * Utiliza hasNextInt() para garantir que apenas números são lidos.
 * Cada número é acumulado numa variável de soma.
 * Após terminar a leitura, o programa imprime o valor total calculado.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex05 { //Programa que lê um arquivo de texto que contém números inteiros separados
    // por espaços e calcula a soma desses números
    public static void main(String[] args) throws FileNotFoundException {

        //Indicar o caminho do ficheiro
        File arquivo = new File ("Ficheiros/ficheiro_Ex_05.txt");

        //Leitura dos números do arquivo
        Scanner leitor = new Scanner (arquivo);

        //Declarar as variáveis e calcular a soma desses números
        int numero;
        int soma = 0;

        while (leitor.hasNextInt()) {
            numero = leitor.nextInt(); //método que devolve um número
            soma += numero; //adiciona à soma
        }

        //Executar a impressão do conteúdo na consola
        System.out.println("Soma: " + soma);

        leitor.close();

        }
    }

