package fichaPratica04;

/**
 * Após preencher uma matriz 3x3, o programa assume que o primeiro elemento é simultaneamente o maior e o menor.
 * Percorre toda a matriz comparando cada valor e atualizando as variáveis do maior e do menor sempre que necessário.
 * No final, imprime a matriz completa e apresenta os valores maior e menor encontrados.
 */

import java.util.Scanner;

public class Ex11 { // Encontra o maior e o menor valor numa matriz 3x3
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        // Preencher a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        int maior = matriz[0][0];
        int menor = matriz[0][0];

        // Determinar maior e menor
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        // Imprimir matriz
        System.out.println("\nMatriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
