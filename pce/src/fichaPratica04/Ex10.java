package fichaPratica04;

/**
 * O programa preenche uma matriz 3x5 com valores introduzidos pelo utilizador.
 * De seguida, pede um número adicional.
 * Percorre toda a matriz e incrementa um contador sempre que encontra esse número.
 * No final, apresenta quantas vezes o número aparece na matriz.
 */

import java.util.Scanner;

public class Ex10 { // Conta a ocorrência de um número numa matriz 3x5
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][5];

        // Preencher a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Pedir o número a procurar
        System.out.print("Digite o número a procurar: ");
        int numero = input.nextInt();

        int contador = 0;

        // Contar ocorrências
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == numero) {
                    contador++;
                }
            }
        }

        System.out.println("O número " + numero + " aparece " + contador + " vezes na matriz.");
    }
}
