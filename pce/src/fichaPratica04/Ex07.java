package fichaPratica04;

/**
 * Depois de preencher um array com 10 números, o programa percorre o array à procura de números pares.
 * Quando encontra o primeiro número par, guarda-o como referência.
 * Continua a percorrer o array e atualiza essa referência sempre que encontra um número par maior.
 * Se não existir nenhum número par, o programa informa o utilizador.
 */

import java.util.Scanner;

public class Ex07 { //Programa que encontra o maior número par inserido num array de 10 posições
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Criar um array com 10 posições
        int[] numeros = new int[10];
        //Solicitar que ao utilizador que insira 10 números num array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();//Usamos o ciclo for para preencher o array com os valores introduzidos
        }

        //Determinar e apresentar o maior número par inserido
        int maiorPar = 0;
        boolean encontrouPar = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] %2 == 0) {
                if(!encontrouPar) {
                    maiorPar = numeros[i]; //primeiro par encontrado
                    encontrouPar = true;
                } else if (numeros[i] > maiorPar) {
                        maiorPar = numeros[i];
                    }
                }
            }
        if (encontrouPar) {
            System.out.println("O maior número par foi: " + maiorPar);
        } else { //Se não houver números pares, o programa deverá informar o utilizador
            System.out.println(("Não foram inseridos números pares."));
        }
    }
}
