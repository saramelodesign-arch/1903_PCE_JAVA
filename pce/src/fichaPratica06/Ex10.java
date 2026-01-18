package fichaPratica06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex10 {
    // Programa que lê um ficheiro CSV com vendas
    // e calcula o valor total das vendas

    public static void main(String[] args) throws FileNotFoundException {

        File ficheiro = new File("pce/Ficheiros/exercicio_10.csv");
        Scanner leitor = new Scanner(ficheiro);

        String linha;
        double totalVendas = 0;

        // Ignorar a primeira linha (cabeçalho)
        if (leitor.hasNextLine()) {
            leitor.nextLine();
        }

        // Ler as restantes linhas
        while (leitor.hasNextLine()) {
            linha = leitor.nextLine();

            String[] dados = linha.split(",");

            int quantidade = Integer.parseInt(dados[2]);
            double valorUnitario = Double.parseDouble(dados[3]);

            totalVendas += quantidade * valorUnitario;
        }

        leitor.close();

        System.out.println("Valor total das vendas: " + totalVendas);
    }
}
