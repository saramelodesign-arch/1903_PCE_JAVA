package fichaPratica06;

/**
 * Criar um ficheiro e escrever uma mensagem
 *
 * O programa cria um novo ficheiro de texto através da classe File.
 * É utilizado um PrintWriter para escrever conteúdo no ficheiro.
 * Uma mensagem em formato String é escrita no ficheiro com println().
 * Após a escrita, o ficheiro é fechado para garantir que os dados ficam guardados.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex02 { //Programa que cria um arquivo de texto e insere nele uma mensagem
    public static void main(String[] args) throws FileNotFoundException {

       //Criar o novo arquivo
        File arquivo = new File("Ficheiros/ficheiro_Ex_02.txt");

        //Máquina para escrever
        PrintWriter maquinaEscrever = new PrintWriter(arquivo);

        //Inserir a mensagem
        String minhaMensagem = "Novo arquivo foi criado!";

        maquinaEscrever.println(minhaMensagem);

        //Fechar a máquina de escrever
        maquinaEscrever.close();


    }
}
