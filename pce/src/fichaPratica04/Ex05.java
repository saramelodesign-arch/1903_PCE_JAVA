package fichaPratica04;

/**
 * O programa lê 10 valores para um array.
 * Utiliza um ciclo para somar todos os elementos do array.
 * Depois da soma total calculada, divide esse valor pelo número de posições do array e imprime a média.
 */

import java.util.Scanner;

public class Ex05 { //Programa que calcula a média dos elementos de um array de 10 posiçoes
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

        // O programa deve calcular e apresentar o total das gavetas
        int soma = 0; // Declarar uma variável chamada soma, vai guardar o total acumulado das gavetas
        // começa com o valor 0
        for (int i = 0; i < gavetas.length; i++) { // Este é um ciclo  que vai percorrer o array
            //é o índice que começa em 0 e vai até 9 (porque o array tem 10 posições)
            // devolve o tamanho do array, que é 10
            soma += gavetas[i]; } // - gavetas[i] acede ao valor de cada gaveta
        // (soma +=) - é igual a (soma = soma + gavetas[i])
        // A cada volta do ciclo, o valor da gaveta é adicionado à variável soma.

        // Soma a dividir pelos arrays
        double media = soma / 10;

        // Depois de somar todas as gavetas e dividir pelos arrays (10), esta linha imprime a média
        System.out.println("Média: " + media);
    }
}
