package fichaPratica05;

import java.util.Scanner;

/**
 * Ex04 – Análise de um Número com Menu
 * O programa começa por solicitar ao utilizador um número inteiro positivo, que será analisado.
 * Em seguida, apresenta um menu com várias opções de análise.
 * Cada opção do menu corresponde a uma função definida no exercício anterior.
 * Consoante a escolha do utilizador, a função respetiva é chamada e o resultado é apresentado no ecrã.
 * O menu repete-se até que o utilizador escolha a opção de saída, permitindo testar várias propriedades
 * do mesmo número sem o voltar a introduzir.
 */

public class Ex04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao, numInteiro;

        System.out.print("Insira um número inteiro e positivo: ");
        numInteiro = input.nextInt();

        do {
            System.out.println("\nO que você gostaria de analisar? Escolha uma opção:");
            System.out.println("1. Par");
            System.out.println("2. Positivo");
            System.out.println("3. Primo");
            System.out.println("4. Perfeito");
            System.out.println("5. Triangular");
            System.out.println("0. Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    if (numeroPar(numInteiro)) {
                        System.out.println("O número " + numInteiro + " é par!");
                    } else {
                        System.out.println("O número " + numInteiro + " é ímpar!");
                    }
                    break;
                case 2:
                    if (numeroPositivo(numInteiro)) {
                        System.out.println("O número " + numInteiro + " é positivo!");
                    } else {
                        System.out.println("O número " + numInteiro + " não é positivo!");
                    }
                    break;
                case 3:
                    if (numeroPrimo(numInteiro)) {
                        System.out.println("O número " + numInteiro + " é primo!");
                    } else {
                        System.out.println("O número " + numInteiro + " não é primo!");
                    }
                    break;
                case 4:
                    if (numeroPerfeito(numInteiro)) {
                        System.out.println("O número " + numInteiro + " é perfeito!");
                    } else {
                        System.out.println("O número " + numInteiro + " não é perfeito!");
                    }
                    break;
                case 5:
                    if (numeroTriangular(numInteiro)) {
                        System.out.println("O número " + numInteiro + " é triangular!");
                    } else {
                        System.out.println("O número " + numInteiro + " não é triangular!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Insira uma opção válida!");
            }

        } while (opcao != 0);

        input.close();
    }

    // ---------- Métodos auxiliares ----------
    public static boolean numeroPar(int n) {
        return n % 2 == 0;
    }

    public static boolean numeroPositivo(int n) {
        return n > 0;
    }

    public static boolean numeroPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean numeroPerfeito(int n) {
        int soma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) soma += i;
        }
        return soma == n;
    }

    public static boolean numeroTriangular(int n) {
        int soma = 0;
        for (int i = 1; soma < n; i++) {
            soma += i;
            if (soma == n) return true;
        }
        return false;
    }
}