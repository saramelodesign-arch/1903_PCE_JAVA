package fichaPratica04;

/**
 * É criada uma matriz 5x5 e preenchida com valores introduzidos pelo utilizador.
 * O programa percorre todas as posições da matriz somando cada elemento a uma variável acumuladora.
 * No final, imprime a soma total de todos os valores da matriz.
 */

import java.util.Scanner;

public class Ex09 { //Programa que soma todos os elementos de uma matriz 5x5
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Criar uma matriz 5x5
        int[][] matriz = new int[5][5];
        //Cria uma matriz com 5 linhas e 5 colunas.
        // Cada posição guarda um número inteiro.
        // Total de posições: 5x5=25

        //Solicitar ao utilizador 25 valores para preenher uma matriz 5x5.
        for (int i = 0; i < 5; i++) { //i representa a linha
            for (int j = 0; j < 5; j++) { //j representa a coluna
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }
        //Calcular a soma
        int soma = 0; //Inicializamos soma com 0
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                soma += matriz[i][j]; // percorremos tada a matriz e somamos cada valor
            }
        }
        //Apresentar a soma de todos os elementos da matriz.
        System.out.println("A soma de todos os elementos é: " + soma);
    }
}
