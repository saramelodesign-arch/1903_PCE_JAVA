package fichaPratica06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class maquinaEscrever {

    public static void conteudoDoFicheiro() throws FileNotFoundException {

        File novoArquivo = new File("src/Ficheiros/hello.txt");
        PrintWriter maquinaEscrever = new PrintWriter(novoArquivo);


        maquinaEscrever.println("Olá, você conseguiu imprimir no novo arquivo!");

        maquinaEscrever.close();

    }

    public static void main(String[] args) throws FileNotFoundException {
        conteudoDoFicheiro();
    }


}
