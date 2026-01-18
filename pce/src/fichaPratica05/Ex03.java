package fichaPratica05;

/**
 * Ex03 – Funções de Análise de um Número
 * Este ficheiro contém várias funções independentes que analisam um número inteiro recebido como argumento.
 * Cada função executa apenas uma verificação específica e devolve um valor booleano:
 *
 * Verificação se o número é par, usando o operador módulo.
 *
 * Verificação se o número é positivo, comparando com zero.
 *
 * Verificação se o número é primo, testando se existe algum divisor além de 1 e do próprio número.
 *
 * Verificação se o número é perfeito, somando todos os seus divisores e comparando com o valor original.
 *
 * Verificação se o número é triangular, somando números consecutivos até atingir ou ultrapassar o valor recebido.
 *
 * Estas funções não produzem output direto, apenas devolvem resultados lógicos para serem usados noutro contexto.
 */

public class Ex03 {

    /**
     * Função para retornar um número par (a)
     * @param num
     * @return número par
     */
    public static boolean numeroPar(int num){
        if(num % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * Função para verificar se o numéro é positivo (b)
     * @param num
     * @return true para números positivos
     */
    public static boolean numeroPositivo (int num){
        if(num >=  0){
            return true;
        }else {
            return false;
        }

    }

    /**
     * Função para verificar se o número é primo (c)
     * @param num
     * @return numero primo
     */
    public static boolean numeroPrimo (int num){

        for(int divisor = 2;divisor< num;divisor++ ){
            //Passa por todos numeros até o num para verificar se há outros divisores.
            if(num % divisor == 0){
                return false;
            }
        }
        return true;

    }

    /**
     *Métod para verificar se o numero inteiro positivo é perfeito
     * @param num
     * @return num pefeito
     */
    public static boolean numeroPerfeito(int num){

        int soma = 0;
        //Ciclo para verificar os dividores e somar
        for( int contador = 1; contador < num; contador++){
            if(num % contador == 0){
                soma += contador;
            }
        }

        //condições para verificar se é um numero perfeito
        if(soma == num){
            return true;
        }else {
            return false;
        }

    }

    /**
     * Métod para verificar se o numero inteiro positivo é triangular
     * @param num
     * @return num triangular
     */
    public static boolean numeroTriangular(int num){

        //Variavel para guardar a soma
        int soma = 0;

        //Ciclo para somar os numero consecutivos
        for(int contador = 1; soma < num;contador++){
            soma += contador;
            //Comparar e verificar se o numero é triangular
            if(soma == num ){
                return true;
            }
        }
        return false;
    }
}