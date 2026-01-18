package fichaPratica06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex12 {
    // Programa que lê um ficheiro CSV com formandos
    // guarda os dados numa matriz e apresenta um menu

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        File ficheiro = new File("pce/Ficheiros/exercicio_12.csv");
        Scanner leitor = new Scanner(ficheiro);

        // Matriz para guardar os formandos
        // [0]=nome | [1]=matricula | [2]=curso | [3]=email | [4]=idade
        String[][] formandos = new String[200][5];
        int totalFormandos = 0;

        // Ignorar cabeçalho
        if (leitor.hasNextLine()) {
            leitor.nextLine();
        }

        // Ler ficheiro
        while (leitor.hasNextLine()) {
            String linha = leitor.nextLine();
            String[] dados = linha.split(",");

            for (int i = 0; i < 5; i++) {
                formandos[totalFormandos][i] = dados[i];
            }
            totalFormandos++;
        }

        leitor.close();

        int opcao;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Mostrar todos os formandos");
            System.out.println("2 - Procurar por matrícula");
            System.out.println("3 - Procurar por curso");
            System.out.println("4 - Mostrar formando mais velho");
            System.out.println("5 - Formandos com mais de um curso");
            System.out.println("6 - Total de formandos");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {

                case 1:
                    for (int i = 0; i < totalFormandos; i++) {
                        System.out.println(
                                formandos[i][0] + " | " +
                                        formandos[i][1] + " | " +
                                        formandos[i][2] + " | " +
                                        formandos[i][3] + " | " +
                                        formandos[i][4]
                        );
                    }
                    break;

                case 2:
                    System.out.print("Matrícula: ");
                    String matricula = input.nextLine();

                    for (int i = 0; i < totalFormandos; i++) {
                        if (formandos[i][1].equals(matricula)) {
                            System.out.println(
                                    formandos[i][0] + " | " +
                                            formandos[i][2] + " | " +
                                            formandos[i][3] + " | " +
                                            formandos[i][4]
                            );
                        }
                    }
                    break;

                case 3:
                    System.out.print("Curso: ");
                    String curso = input.nextLine();
                    int contadorCurso = 0;

                    for (int i = 0; i < totalFormandos; i++) {
                        if (formandos[i][2].equalsIgnoreCase(curso)) {
                            System.out.println(
                                    formandos[i][0] + " | " +
                                            formandos[i][1]
                            );
                            contadorCurso++;
                        }
                    }

                    System.out.println("Total inscritos no curso: " + contadorCurso);
                    break;

                case 4:
                    int idadeMaior = 0;
                    int posicao = 0;

                    for (int i = 0; i < totalFormandos; i++) {
                        int idade = Integer.parseInt(formandos[i][4]);
                        if (idade > idadeMaior) {
                            idadeMaior = idade;
                            posicao = i;
                        }
                    }

                    System.out.println("Formando mais velho:");
                    System.out.println(
                            formandos[posicao][0] + " | " +
                                    formandos[posicao][1] + " | " +
                                    formandos[posicao][2]
                    );
                    break;

                case 5:
                    for (int i = 0; i < totalFormandos; i++) {
                        int contagem = 0;

                        for (int j = 0; j < totalFormandos; j++) {
                            if (formandos[i][1].equals(formandos[j][1])) {
                                contagem++;
                            }
                        }

                        if (contagem > 1) {
                            System.out.println(
                                    formandos[i][0] + " | " +
                                            formandos[i][1]
                            );
                        }
                    }
                    break;

                case 6:
                    System.out.println("Total de registos: " + totalFormandos);
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
