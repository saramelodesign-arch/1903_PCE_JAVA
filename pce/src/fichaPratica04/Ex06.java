package fichaPratica04;

/**
 * O programa lê 10 números para um array.
 * Percorre o array comparando cada elemento com o seguinte.
 * Se encontrar um valor maior do que o próximo, considera que o array não está em ordem crescente e
 * interrompe a verificação.
 * No final, apresenta a mensagem correspondente ao resultado da verificação.
 */

import java.util.Scanner;

public class Ex06 { //Programa que verifica se os elementos de um array de 10 posições estão em ordem crescente.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Criar um array
        int[] numeros = new int[10];

        //Solicitar ao utilizador que insira 10 números num array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o número " +(i+1)+ ": ");
            numeros[i] = input.nextInt();
        }

        //Verificar se os números estão organizados em ordem crescente.
        //Comparar cada elemento com o próximo. Se algum número for maior que o seguinte,
        //então não está em ordem crescente
        boolean crescente = true;
        for (int i = 0; i < numeros.length -1; i++) {
            if (numeros[i] > numeros[i+1]) {//Verifica se o numero atual é maior que o próximo
                crescente = false;// Se isso acontecer, crescente=false e sai do ciclo1
                break;
            }
        }
    // apresentando uma mensagem com o resultado da verificação
        if (crescente) {
            System.out.println("Os números estão em ordem crescente.");
        } else {
                System.out.println("Os números Não estão em ordem crescente.");
        }

    }
}