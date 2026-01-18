package fichaPratica05;

/**
 *
 Ex08 – Soma de matrizes
 Este ficheiro contém duas funções que trabalham com duas matrizes de dimensões iguais.
 A primeira função percorre as duas matrizes simultaneamente e imprime, posição a posição,
 a soma dos valores correspondentes.
 A segunda função percorre novamente ambas as matrizes e acumula numa variável a soma de todos
 os seus elementos, devolvendo esse valor no final.
 As funções assumem que as matrizes têm o mesmo tamanho e não fazem leitura nem impressão adicional
 fora do que é necessário.
 */

public class Ex08 {

    // Imprime a soma de duas matrizes
    public static void somarMatrizes(int[][] matriz1, int[][] matriz2){

        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[i].length; j++){
                System.out.print((matriz1[i][j] + matriz2[i][j]) + "\t");
            }
            System.out.println();
        }
    }

    // Devolve o somatório de todos os elementos das duas matrizes
    public static int somatorioMatrizes(int[][] matriz1, int[][] matriz2){

        int soma = 0;

        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[i].length; j++){
                soma += matriz1[i][j] + matriz2[i][j];
            }
        }
        return soma;
    }
}
