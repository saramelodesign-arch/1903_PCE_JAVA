package fichaPratica05;

import java.util.Scanner;

/**
 * Ex01 – Fazer Barulho
 * O programa define uma função que recebe uma String com o nome de um animal.
 * Dentro da função é utilizado um switch para comparar o nome recebido com os animais previstos.
 * Consoante o caso correspondente, é impresso no ecrã o som associado a esse animal.
 * Se o nome introduzido não corresponder a nenhum dos casos definidos, é apresentada uma mensagem de erro.
 * No main, o utilizador introduz o nome do animal e a função é chamada com esse valor como argumento.
 */

public class Ex01 {
    //Função  para fazer o animal emitir um barulho
    public static void fazerBarulho(String nomeAnimal){
        switch (nomeAnimal){
            case "cao":
                System.out.print("Au au");
                break;
            case "gato":
                System.out.print("Miau miau");
                break;
            case "peixe":
                System.out.print("Glub glub");
                break;
            case "vaca":
                System.out.print("Muhhhhhh");
                break;
            case "porco":
                System.out.print("Ainc ainc");
                break;
            default:
                System.out.println("Animal não reconhecido");
        }

    }
    public static void main(String[] args) {
        //Pedir ao user o nome do animal
        Scanner input = new Scanner(System.in);

        String animalEscolhido;
        System.out.println("Digite o nome do animal: ");
        animalEscolhido = input.nextLine();

        //Chamar a função
        fazerBarulho(animalEscolhido);
    }
}
