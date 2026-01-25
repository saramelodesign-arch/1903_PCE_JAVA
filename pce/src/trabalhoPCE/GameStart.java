package trabalhoPCE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameStart {
    //PROGRAMA QUE PERMITE ANALISAR, REALIZAR BUSCAS E GERIR UMA LOJA - GAMESTART
    //AS VENDAS SÃO ARMAZENADAS NUM FICHEIRO .CSV

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        //Indicar o caminho do Ficheiro
        File ficheiro = new File("pce/Ficheiros/GameStart_V2.csv");
        Scanner leitor = new Scanner(ficheiro);

        // Ler ficheiro e guardar os dados
        String[][] vendas = new String[1000][9];
        int totalVendas = 0;

        // Ignorar cabeçalho
        leitor.nextLine();

        while (leitor.hasNextLine()) { //Enquanto existirem linhas para ler, o ciclo continua, quando não houver o ciclo termina
            String linha = leitor.nextLine(); //lê a linha, guarda numa variável linha
            String[] dados = linha.split(";"); //.split, sempre que emcontra ; separa os dados

            if (dados.length == 9) { //Verifica se a linha tem 9 colunas
                //Copia cada campo para a matriz vendas
                //e guarda em totalVendas
                System.arraycopy(dados, 0, vendas[totalVendas], 0, 9);
                totalVendas++; //incrementa ao contador
            }
        }

        leitor.close(); //Fecha o ficheiro

        //LOGIN UTILIZADOR
        //Escolher ADMIN ou CLIENTE
        System.out.print("Tipo de Utilizador (ADMIN || CLIENTE): ");
        String tipoUtilizador = input.nextLine();

        if (tipoUtilizador.equalsIgnoreCase("ADMIN")) { //Se escolher ADMIN

            System.out.print("PASSWORD: "); //Pede PASSWORD
            String password = input.nextLine();

            if (!password.equals("123456789")) { //Se a pass não for esta...
                System.out.println("Password Incorreta.");
                input.close();
                return;
            }

        } else if (!tipoUtilizador.equalsIgnoreCase("CLIENTE")) { // Se não escolher um utilizador válido...
            System.out.println("Tipo de utilizador inválido.");
            input.close();
            return;
        }


        //MENU ADMIN
        int opcao;

        if (tipoUtilizador.equalsIgnoreCase("ADMIN")) { //Se Login como ADMIN, mostra MENU ADMIN
            do {
                System.out.println("=== MENU ADMIN ===");
                System.out.println("1. Exibir ficheiro");
                System.out.println("2. Vendas totais");
                System.out.println("3. Lucro total");
                System.out.println("4. Dados de cliente");
                System.out.println("5. Jogo mais caro");
                System.out.println("0. Sair");
                System.out.print("Opção: ");
                opcao = input.nextInt();

                switch (opcao) {

                    case 1: //Exibir ficheiro
                        System.out.println("--- LISTA DE VENDAS ---");
                        // Percorre todas as vendas e imprime os respetivos dados
                        for (int i = 0; i < totalVendas; i++) {
                            System.out.println(vendas[i][0] + " | " + vendas[i][1] + " | " + vendas[i][2] + " | " + vendas[i][3] + " | " + vendas[i][4] + " | " + vendas[i][5] + " | " + vendas[i][6] + " | " + vendas[i][7] + " | " + vendas[i][8]);
                        }
                        break;

                    case 2: //Vendas totais
                        double totalValor = 0;
                        // Calcular o valor total acumulado de todas as vendas
                        for (int i = 0; i < totalVendas; i++) {
                            totalValor += Double.parseDouble(vendas[i][8]);
                        }

                        System.out.println("Total de vendas: " + totalVendas);
                        System.out.println("Valor total acumulado: " + totalValor + " €");
                        break;


                    case 3: //Lucro total (20%)
                        double lucroTotal = 0;
                        // Calcular o lucro considerando 20% do valor de cada venda
                        for (int i = 0; i < totalVendas; i++) {
                            double valor = Double.parseDouble(vendas[i][8]);
                            lucroTotal += valor * 0.20;
                        }

                        System.out.println("Lucro total: " + lucroTotal + " €");
                        break;


                    case 4: // Dados de cliente
                        input.nextLine(); // limpar buffer

                        System.out.println("Clientes disponíveis:");

                        // Mostrar lista de clientes disponíveis sem repetir IDs
                        for (int i = 0; i < totalVendas; i++) {
                            boolean jaMostrado = false;

                            for (int j = 0; j < i; j++) {
                                if (vendas[i][1].equals(vendas[j][1])) {
                                    jaMostrado = true;
                                    break;
                                }
                            }

                            if (!jaMostrado) {
                                System.out.println("ID: " + vendas[i][1] + " | Nome: " + vendas[i][2]);
                            }
                        }

                        // Pedir ao utilizador o ID do cliente
                        // A lista anterior serve apenas para facilitar a escolha
                        System.out.print("Insira o ID do cliente: ");
                        String idCliente = input.nextLine();

                        boolean encontrado = false;

                        // Procurar o cliente e mostrar os seus dados
                        for (int i = 0; i < totalVendas; i++) {

                            if (vendas[i][1].equals(idCliente)) {

                                System.out.println("Cliente:");
                                System.out.println("Nome: " + vendas[i][2]);
                                System.out.println("Contacto: " + vendas[i][3]);
                                System.out.println("Email: " + vendas[i][4]);

                                encontrado = true;
                                break; // já não é necessário continuar a procurar
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Cliente não encontrado.");
                        }

                        break;


                    case 5: //Jogo mais caro
                        // Inicializar com a primeira venda
                        double valorMax = Double.parseDouble(vendas[0][8]);
                        String jogoMaisCaro = vendas[0][7];
                        String editora = vendas[0][5];

                        // Procurar o jogo com o preço mais elevado
                        for (int i = 1; i < totalVendas; i++) {
                            double valorAtual = Double.parseDouble(vendas[i][8]);

                            if (valorAtual > valorMax) {
                                valorMax = valorAtual;
                                jogoMaisCaro = vendas[i][7];
                                editora = vendas[i][5];
                            }
                        }

                        // Mostrar os dados do jogo mais caro
                        System.out.println("Jogo mais caro:");
                        System.out.println("Jogo: " + jogoMaisCaro);
                        System.out.println("Editora: " + editora);
                        System.out.println("Preço: " + valorMax + " €");

                        // Mostrar os clientes que compraram o jogo mais caro
                        System.out.println("Clientes que compraram este jogo:");

                        for (int i = 0; i < totalVendas; i++) {
                            double valorAtual = Double.parseDouble(vendas[i][8]);

                            if (vendas[i][7].equals(jogoMaisCaro) && valorAtual == valorMax) {
                                System.out.println(vendas[i][2] + " | " + vendas[i][3] + " | " + vendas[i][4]);
                            }
                        }

                        break;

                    case 0: //SAIR
                        System.out.println("A sair...");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

            } while (opcao != 0);


            // MENU CLIENTE
        } else if (tipoUtilizador.equalsIgnoreCase("CLIENTE")) {

            //Mostra o MENU CLIENTE
            do {
                System.out.println("MENU CLIENTE");
                System.out.println("1. Registar cliente");
                System.out.println("2. Vagas de estacionamento");
                System.out.println("3. Jogos disponíveis");
                System.out.println("4. Jogos por editora");
                System.out.println("0. Sair");
                System.out.print("Opção: ");
                opcao = input.nextInt();

                switch (opcao) {
                    case 1: // Registar cliente
                        input.nextLine(); // limpar buffer

                        System.out.print("Nome do cliente: ");
                        String nome = input.nextLine();

                        System.out.print("Contacto: ");
                        String contacto = input.nextLine();

                        System.out.print("Email: ");
                        String email = input.nextLine();

                        // Mensagem de confirmação do registo
                        System.out.println("Cliente inserido com sucesso:");
                        System.out.println(nome + " | " + contacto + " | " + email);

                        break;


                    case 2: // Vagas de estacionamento

                        int soma = 0;       // Guarda o número triangular atual
                        int contador = 0;  // Número que vai ser somado
                        int vagas = 0;     // Contador de vagas válidas

                        // Gerar números triangulares até ao limite de 121
                        while (soma <= 121) {
                            contador++;
                            soma += contador;

                            // Verificar se o número triangular é múltiplo de 5
                            if (soma <= 121 && soma % 5 == 0) {
                                vagas++;
                            }
                        }

                        System.out.println("Número de vagas de estacionamento disponíveis: " + vagas);
                        break;


                    case 3: // Jogos disponíveis
                        input.nextLine(); // limpar buffer

                        String[] jogos = new String[totalVendas];
                        int totalJogos = 0;

                        System.out.println("Jogos disponíveis:");

                        // Mostrar Lista títulos de jogos sem repetições
                        for (int i = 0; i < totalVendas; i++) {
                            boolean existe = false;

                            for (int j = 0; j < totalJogos; j++) {
                                if (vendas[i][7].equals(jogos[j])) {
                                    existe = true;
                                    break;
                                }
                            }

                            if (!existe) {
                                jogos[totalJogos] = vendas[i][7];
                                System.out.println("- " + vendas[i][7]);
                                totalJogos++;
                            }
                        }

                        break;

                    case 4: // Jogos por editora
                        input.nextLine(); // Limpar o buffer do Scanner

                        // Array para guardar as editoras sem repetições
                        String[] editoras = new String[totalVendas];
                        int totalEditoras = 0;

                        System.out.println("Editoras disponíveis:");

                        // Percorrer todas as vendas para obter editoras únicas
                        for (int i = 0; i < totalVendas; i++) {
                            boolean existe = false;

                            // Verificar se a editora já foi adicionada
                            for (int j = 0; j < totalEditoras; j++) {
                                if (vendas[i][5].equals(editoras[j])) {
                                    existe = true;
                                    break;
                                }
                            }

                            // Se a editora ainda não existir, adicionar à lista
                            if (!existe) {
                                editoras[totalEditoras] = vendas[i][5];
                                System.out.println((totalEditoras + 1) + " - " + vendas[i][5]);
                                totalEditoras++;
                            }
                        }

                        // Escolha da editora através do número apresentado
                        System.out.print("Escolha o número da editora: ");
                        int escolhaEditora = input.nextInt();

                        // Validar a opção escolhida
                        if (escolhaEditora < 1 || escolhaEditora > totalEditoras) {
                            System.out.println("Opção inválida.");
                            break;
                        }

                        // Obter a editora selecionada
                        String editoraEscolhida = editoras[escolhaEditora - 1];

                        System.out.println("Jogos da editora " + editoraEscolhida + ":");

                        // Listar os jogos dessa editora sem repetições
                        for (int i = 0; i < totalVendas; i++) {

                            // Verificar se a venda pertence à editora escolhida
                            if (vendas[i][5].equals(editoraEscolhida)) {

                                boolean jogoMostrado = false;

                                // Verificar se o jogo já foi apresentado anteriormente
                                for (int j = 0; j < i; j++) {
                                    if (vendas[i][7].equals(vendas[j][7]) && vendas[i][5].equals(vendas[j][5])) {
                                        jogoMostrado = true;
                                        break;
                                    }
                                }

                                // Mostrar o jogo e a respetiva categoria apenas uma vez
                                if (!jogoMostrado) {
                                    System.out.println("Categoria: " + vendas[i][6] + " | Jogo: " + vendas[i][7]);
                                }
                            }
                        }

                        break;


                }

            } while (opcao != 0);

        } else {
            System.out.println("Tipo de utilizador inválido.");
        }

        input.close();
    }
}



