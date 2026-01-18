package fichaPratica05;

import java.util.Scanner;

/**
 * Ex02 – Imprimir Asteriscos
 * Este exercício está dividido em duas partes funcionais.
 * A primeira função solicita repetidamente ao utilizador um número inteiro até que este esteja dentro do
 * intervalo válido. Esse valor é devolvido ao main.
 * A segunda função recebe esse número como argumento e utiliza um ciclo for para imprimir uma quantidade
 * correspondente de asteriscos.
 * No main, o valor devolvido pela primeira função é usado como parâmetro da função que imprime os asteriscos.
 */

public class Ex02 {

    /**
     * Método para pedir ao usuário um número de 0 a 100
     * @return numero inteiro positivo
     */

    public static int lerValorDoUser(){
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.println(("Digite um número de 0 a 100: "));
            num = input.nextInt();
        }while (num <= 0 || num >= 100);

        return num;
        }

    /**
     * Método para imprimir Asteriscos
     * @param numeroDeAsteriscos (int)
     */
    public static void imprimirAsteriscos(int numeroDeAsteriscos){

        for(int i=0;i<=numeroDeAsteriscos;i++){
            System.out.println("*");
        }

    }

    public static void main(String[] args) {

        int numInteiro = lerValorDoUser();

        imprimirAsteriscos(numInteiro);
    }
    }

    //Main

