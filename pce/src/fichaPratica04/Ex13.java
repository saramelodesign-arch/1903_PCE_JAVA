package fichaPratica04;

/**
 * O programa preenche uma matriz 4x4 com valores introduzidos pelo utilizador.
 * Utiliza um ciclo para percorrer apenas as posições onde o índice da linha
 * é igual ao índice da coluna e soma esses valores.
 * No final, imprime a soma calculada.
 */

import java.util.Scanner;

public class Ex13 { // Soma os elementos da diagonal principal de uma matriz 4x4
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        // Preencher a matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        int somaDiagonal = 0;

        // Somar a diagonal principal
        for (int i = 0; i < 4; i++) {
            somaDiagonal += matriz[i][i];
        }

        System.out.println("Soma da diagonal principal: " + somaDiagonal);
    }
}
