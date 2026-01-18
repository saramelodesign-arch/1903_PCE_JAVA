package fichaPratica04;

/**
 * É criado um array de 12 posições para guardar as comissões mensais.
 * O utilizador introduz um valor por mês, que é armazenado no array.
 * De seguida, o programa percorre o array, soma todos os valores e imprime o total anual das comissões.
 */

import java.util.Scanner;

public class Ex02 {  //Programa que adiciona comissões mensais a um array de 12 posições e calcula o total anual
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double [] totalComissoes = new double [12];

        // Solicitar ao utilizador 12 valores, cada uma representando a comissão mensal para cada mês do ano
        // Criar um ciclo para preencher os valores das comissões
        for (int i = 0 ; i < 12 ; i++){
            System.out.println("Digite o valor da comissão (" + i + "): ");
            totalComissoes [i] = input.nextInt(); }

        // Criar ciclo para imprimir os valores guardados
        for (int i = 0; i < totalComissoes.length ; i++) {
            System.out.println("Na comissão(" + i + "):" + totalComissoes[i]); }

        // O programa deve calcular e apresentar o total das comissões anuais
        double soma = 0; // Declarar uma variável chamada soma, vai guardar o total acumulado das comissões
        // começa com o valor 0
        for (int i = 0; i < totalComissoes.length; i++) { // Este é um ciclo  que vai percorrer o array
	    //é o índice que começa em 0 e vai até 11 (porque o array tem 12 posições)
	    // devolve o tamanho do array, que é 12
            soma += totalComissoes[i]; } // - totalComissoes[i] acede ao valor da comissão no mês i
        // (soma +=) - é igual a (soma = soma + totalComissoes[i])
        // A cada volta do ciclo, o valor da comissão é adicionado à variável soma.

        // Depois de somar todas as comissões, esta linha imprime o total no ecrã.
        System.out.println("Total anual das comissões: " + soma);
    }
}

