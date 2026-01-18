package fichaPratica04;

/**
 * O programa preenche um array com 10 números introduzidos pelo utilizador.
 * Assume inicialmente que o primeiro valor do array é o maior.
 * Percorre o restante array comparando cada valor com o maior atual e atualiza essa variável sempre
 * que encontra um valor superior.
 * No final, imprime o maior valor encontrado.
 */

import java.util.Scanner;

public class Ex03 {  //Programa que encontra o maior elemento de um array de 10 posições
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
        // Inicializar a variável  com o primeiro valor do array
	    //Assumir que o valor na posição 0 é o maior até agora
        int numeroMaior = gavetas[0]; // Começa com o primeiro valor

        //Este é um ciclo  que começa na posição 1 (porque já usei a posição 0)
        //Vai percorrer todas as posições do array até ao fim (gavetas.length é 10).
        //A variável i representa o índice atual do array.
        for (int i = 1; i < gavetas.length; i++) {

            //Aqui estou a comparar o valor atual (gavetas[i]) com o valor guardado em numeroMaior.
            //Se o valor atual for maior, então encontramos um novo "maior valor".
            if (gavetas[i] > numeroMaior) {
                //Se a condição anterior for verdadeira, atualiza  com o novo valor.
                //Assim, vai se guardando sempre o maior valor encontrado até ao momento.
                numeroMaior = gavetas[i]; // Atualiza se encontrar valor maior
            }
        }

        System.out.println("O maior valor encontrado foi: " + numeroMaior);
    }
}