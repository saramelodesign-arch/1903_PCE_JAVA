package fichaPratica04;

/**
 * Após preencher um array com 10 números, o programa assume que o primeiro valor é o menor.
 * Percorre o array e compara cada elemento com o menor guardado até ao momento.
 * Sempre que encontra um valor inferior, atualiza essa variável.
 * No final, apresenta o menor valor do array.
 */

import java.util.Scanner;

public class Ex04 { //Programa que encontra o menor elemento de um array de 10 posições
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Criar um array com 10 gavetas
        int[] gavetas = new int[10];

        // Preencher o array com valores introduzidos pelo utilizador
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor na gaveta (" + i + "):");
            gavetas[i] = input.nextInt();
        }

        // Imprimir os valores guardados
        for (int i = 0; i < gavetas.length; i++) {
            System.out.println("Na gaveta da posição (" + i + "): " + gavetas[i]);
        }

        // Determinar o maior valor
        int numeroMenor = gavetas[0]; // Começa com o primeiro valor

        for (int i = 1; i < gavetas.length; i++) {
            if (gavetas[i] < numeroMenor) {
                numeroMenor = gavetas[i]; // Atualiza se encontrar valor maior
            }
        }

        System.out.println("O maior valor encontrado foi: " + numeroMenor);
    }
}