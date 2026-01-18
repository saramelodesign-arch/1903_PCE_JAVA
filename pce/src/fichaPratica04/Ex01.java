package fichaPratica04;

/**
 * O programa cria um array com 10 posições.
 * Utiliza um ciclo for para pedir ao utilizador um valor para cada posição do array e guarda cada valor no
 * índice correspondente.
 * Depois de preenchido, um segundo ciclo percorre o array e imprime os valores exatamente pela ordem em que
 * foram inseridos.
 */

import java.util.Scanner;

//Programa que diciona 10 números inteiros a um array e imprime os valores na ordem de inserção
public class Ex01 {
    public static void main(String[] args) {

        // Pedir ao utilizador

        Scanner input = new Scanner(System.in);

        // Criar um novo array com 10 gavetas
        int [] gavetas = new int [10];

        // Criar um ciclo para preencher os valores nas gavetas
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite uma valor na gaveta (" + i + "):");
            gavetas[i] = input.nextInt(); }

        // Ciclos para imprimir os valores guardados na gaveta
        for (int i = 0; i < gavetas.length; i++) {
            System.out.println("Na gaveta da posição(" +i +"):" + gavetas[i]);

        }

    }
}
