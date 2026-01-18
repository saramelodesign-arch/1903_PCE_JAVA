package fichaPratica06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex11 {
    // Programa que lê um ficheiro CSV com músicas
    // guarda os dados numa matriz e apresenta um menu

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        File ficheiro = new File("pce/Ficheiros/exercicio_11.csv");
        Scanner leitor = new Scanner(ficheiro);

        // Matriz para guardar as músicas
        // [linha][0]=nome | [1]=artista | [2]=genero | [3]=duracao
        String[][] musicas = new String[100][4];
        int totalMusicas = 0;

        // Ignorar cabeçalho
        if (leitor.hasNextLine()) {
            leitor.nextLine();
        }

        // Ler ficheiro
        while (leitor.hasNextLine()) {
            String linha = leitor.nextLine();
            String[] dados = linha.split(",");

            for (int i = 0; i < 4; i++) {
                musicas[totalMusicas][i] = dados[i];
            }
            totalMusicas++;
        }

        leitor.close();

        int opcao;

        do {
            System.out.println("======== MENU ========");
            System.out.println("1 - Pesquisar por género");
            System.out.println("2 - Pesquisar por artista");
            System.out.println("3 - Música com maior duração");
            System.out.println("4 - Músicas com duração maior que um valor");
            System.out.println("5 - Total de músicas");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();
            input.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Género: ");
                    String genero = input.nextLine();

                    for (int i = 0; i < totalMusicas; i++) {
                        if (musicas[i][2].equalsIgnoreCase(genero)) {
                            System.out.println(musicas[i][0] + " - " + musicas[i][1]);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Artista: ");
                    String artista = input.nextLine();

                    for (int i = 0; i < totalMusicas; i++) {
                        if (musicas[i][1].equalsIgnoreCase(artista)) {
                            System.out.println(musicas[i][0] + " (" + musicas[i][2] + ")");
                        }
                    }
                    break;

                case 3:
                    int maiorDuracao = 0;
                    int posicao = 0;

                    for (int i = 0; i < totalMusicas; i++) {
                        int duracao = Integer.parseInt(musicas[i][3]);
                        if (duracao > maiorDuracao) {
                            maiorDuracao = duracao;
                            posicao = i;
                        }
                    }

                    System.out.println("Música mais longa:");
                    System.out.println(musicas[posicao][0] + " - " + musicas[posicao][1]);
                    break;

                case 4:
                    System.out.print("Duração mínima (em minutos): ");
                    int duracaoMin = input.nextInt();

                    for (int i = 0; i < totalMusicas; i++) {

                        String[] tempo = musicas[i][3].split(":");
                        int minutos = Integer.parseInt(tempo[0]);
                        int segundos = Integer.parseInt(tempo[1]);
                        int duracao = minutos * 60 + segundos;

                        if (duracao > duracaoMin * 60) {
                            System.out.println(musicas[i][0] + " (" + musicas[i][3] + ")");
                        }
                    }
                    break;


                case 5:
                    System.out.println("Total de músicas: " + totalMusicas);
                    break;

                case 0:
                    System.out.println("A sair...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        input.close();
    }
}
