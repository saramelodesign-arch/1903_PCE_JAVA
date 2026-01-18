package fichaPratica05;

/**
 * Ex05 – Funções para análise de um array
 *
 * Este ficheiro contém três funções independentes que recebem um array de inteiros como argumento.
 *
 * A função que calcula o maior valor assume inicialmente que o primeiro elemento do array é o maior e
 * percorre o restante array, atualizando esse valor sempre que encontra um número superior.
 *
 * A função que calcula o menor valor segue a mesma lógica, mas atualiza a variável sempre que encontra
 * um valor inferior ao atual.
 *
 * A função que verifica se o array está em ordem crescente percorre o array comparando cada elemento
 * com o seguinte. Se encontrar um elemento maior do que o próximo, devolve imediatamente false. Se
 * terminar o ciclo sem falhas, devolve true.
 *
 * Este exercício não imprime resultados; as funções devolvem valores para serem usadas noutros programas.
 */

public class Ex05 {

    // Devolve o maior elemento do array
    public static int maior(int[] vetor){
        int maior = vetor[0];

        for(int i = 1; i < vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        return maior;
    }

    // Devolve o menor elemento do array
    public static int menor(int[] vetor){
        int menor = vetor[0];

        for(int i = 1; i < vetor.length; i++){
            if(vetor[i] < menor){
                menor = vetor[i];
            }
        }
        return menor;
    }

    // Verifica se o array está em ordem crescente
    public static boolean crescente(int[] vetor){
        for(int i = 0; i < vetor.length - 1; i++){
            if(vetor[i] > vetor[i + 1]){
                return false;
            }
        }
        return true;
    }
}
