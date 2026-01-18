package fichaPratica04;

/**
 * O programa começa por preencher dois arrays de 10 posições.
 * Cria uma matriz 10x2 e, para cada posição, copia o valor do primeiro array para a primeira coluna
 * e o valor do segundo array para a segunda coluna.
 * No final, percorre a matriz e imprime todas as linhas.
 */

import java.util.Scanner;

public class Ex12 { // Gera uma matriz 10x2 a partir de dois arrays
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        // Preencher primeiro array
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor do array1 na posição " + i + ": ");
            array1[i] = input.nextInt();
        }

        // Preencher segundo array
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor do array2 na posição " + i + ": ");
            array2[i] = input.nextInt();
        }

        int[][] matriz = new int[10][2];

        // Criar a matriz 10x2
        for (int i = 0; i < 10; i++) {
            matriz[i][0] = array1[i];
            matriz[i][1] = array2[i];
        }

        // Imprimir matriz
        System.out.println("\nMatriz 10x2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(matriz[i][0] + "\t" + matriz[i][1]);
        }
    }
}
