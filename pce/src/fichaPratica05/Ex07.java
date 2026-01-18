package fichaPratica05;

/**
 * Ex07 – Desenhar um quadrado
 *
 * Este exercício define uma função que recebe três parâmetros: um carácter, o número de linhas e o número de colunas.
 * A função utiliza dois ciclos for aninhados para imprimir o carácter o número de vezes necessário em cada linha,
 * repetindo o processo até completar o número de linhas indicado.
 * O resultado é um quadrado (ou retângulo) desenhado no ecrã apenas com instruções de repetição e impressão.
 */

public class Ex07 {

    // Desenha um quadrado com um carácter, número de linhas e colunas
    public static void desenharQuadrado(char c, int linhas, int colunas){

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
