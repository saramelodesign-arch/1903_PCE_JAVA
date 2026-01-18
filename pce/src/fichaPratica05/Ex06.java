package fichaPratica05;

/**
 * Ex06 – Análise de um vetor com menu
 *
 * O programa começa por solicitar ao utilizador o tamanho do vetor e os respetivos valores.
 * Depois de preenchido, é apresentado um menu com opções para analisar o vetor.
 *
 * Consoante a opção escolhida, o programa chama as funções definidas no exercício anterior
 * para obter o maior valor, o menor valor ou verificar se o vetor está em ordem crescente.
 * O menu repete-se até o utilizador escolher a opção de saída, permitindo analisar o mesmo
 * vetor várias vezes sem o voltar a introduzir.
 */

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tamanho;
        System.out.print("Indique o tamanho do vetor: ");
        tamanho = input.nextInt();

        int[] vetor = new int[tamanho];

        // Preencher vetor
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Insira o valor na posição " + i + ": ");
            vetor[i] = input.nextInt();
        }

        int opcao;

        do{
            System.out.println("\nMenu:");
            System.out.println("1. Maior elemento");
            System.out.println("2. Menor elemento");
            System.out.println("3. Crescente ou não crescente");
            System.out.println("0. Sair");
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Maior valor: " + Ex05.maior(vetor));
                    break;
                case 2:
                    System.out.println("Menor valor: " + Ex05.menor(vetor));
                    break;
                case 3:
                    if(Ex05.crescente(vetor)){
                        System.out.println("O vetor está em ordem crescente.");
                    } else {
                        System.out.println("O vetor não está em ordem crescente.");
                    }
                    break;
                case 0:
                    System.out.println("A sair...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while(opcao != 0);
    }
}
