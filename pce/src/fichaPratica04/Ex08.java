package fichaPratica04;

/**
 * O programa cria uma matriz 3x3.
 * Utiliza dois ciclos for para preencher a matriz com valores introduzidos pelo utilizador,
 * um ciclo para as linhas e outro para as colunas.
 * Depois de preenchida, a matriz é percorrida novamente e impressa linha a linha no formato de tabela.
 */

import java.util.Scanner;
// Importa a classe Scanner, que permite ler dados do teclado

public class Ex08 { // Programa que cria e imprime uma matriz 3x3 preenchida por números inteiros introduzidos pelo utilizador.
    // Declaração da classe principal chamada Ex08

    public static void main(String[] args) {
        // Método principal onde o programa começa a ser executado

        Scanner input = new Scanner(System.in);
        // Cria um objeto Scanner chamado 'input' para ler dados do utilizador

        // Criar e imprimir uma matriz 3x3 preenchida por números inteiros introduzidos pelo utilizador

        int[][] matriz = new int[3][3];
        // Cria uma matriz bidimensional com 3 linhas e 3 colunas (total de 9 posições)

        // Solicitar ao utilizador que insira 9 números
        for (int i = 0; i < 3; i++) {
            // Ciclo externo percorre as linhas da matriz (i = linha)

            for (int j = 0; j < 3; j++) {
                // Ciclo interno percorre as colunas da matriz (j = coluna)

                System.out.print("Insira o número na matriz [" + i + "][" + j + "]: ");
                // Pede ao utilizador para inserir um número para a posição [i][j] da matriz

                matriz[i][j] = input.nextInt();
                // Lê o número inserido e guarda-o na posição correspondente da matriz
            }
        }

        // Após a inserção, imprimir a matriz no formato de uma tabela
        System.out.println("\nImpressão da matriz:");
        // Imprime um título antes de mostrar a matriz

        for (int i = 0; i < 3; i++) {
            // Ciclo externo percorre as linhas da matriz

            for (int j = 0; j < 3; j++) {
                // Ciclo interno percorre as colunas da matriz

                System.out.print(matriz[i][j] + "\t");
                // Imprime o valor da posição [i][j] seguido de uma tabulação para alinhar em formato de tabela
            }

            System.out.println();
            // Muda de linha após imprimir uma linha completa da matriz
        }
    }
}