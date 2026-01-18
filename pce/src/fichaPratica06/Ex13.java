package fichaPratica06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex13 {
    // Programa que lê um ficheiro de eventos
    // e mostra os eventos de um determinado mês

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        File ficheiro = new File("pce/Ficheiros/exercicio_13.csv");
        Scanner leitor = new Scanner(ficheiro);

        // Matriz para guardar os eventos
        // [0]=nome | [1]=dia | [2]=mes | [3]=ano | [4]=lotacao
        String[][] eventos = new String[100][5];
        int totalEventos = 0;

        // Ignorar cabeçalho
        if (leitor.hasNextLine()) {
            leitor.nextLine();
        }

        // Ler ficheiro
        while (leitor.hasNextLine()) {
            String linha = leitor.nextLine();
            String[] dados = linha.split(",");

            if (dados.length == 5) {
                for (int i = 0; i < 5; i++) {
                    eventos[totalEventos][i] = dados[i];
                }
                totalEventos++;
            }
        }

        leitor.close();

        // Pedir o mês
        System.out.print("Digite o mês (ex: Julho): ");
        String mesEscolhido = input.nextLine();

        System.out.println("\nEventos no mês de " + mesEscolhido + ":");

        // Procurar eventos do mês indicado
        for (int i = 0; i < totalEventos; i++) {
            if (eventos[i][2].equalsIgnoreCase(mesEscolhido)) {
                System.out.println(
                        eventos[i][0] + " | Dia: " +
                                eventos[i][1] + " | Ano: " +
                                eventos[i][3] + " | Lotação: " +
                                eventos[i][4]
                );
            }
        }

        input.close();
    }
}
