import java.util.Random;
import java.util.Scanner;

public class Correcao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opcoes = {"pedra", "papel", "tesoura"};

        System.out.println("=== Pedra, Papel e Tesoura ===");
        System.out.print("Escolha pedra, papel ou tesoura: ");
        String jogador = scanner.nextLine().toLowerCase();

        String computador = opcoes[random.nextInt(3)];

        System.out.println("Computador escolheu: " + computador);
        if (jogador.equals(computador)) {
            System.out.println("Empate!");
        }
        else if (jogador.equals("pedra") && computador.equals("tesoura")){
            System.out.println("Você venceu!");
        }
        else if (jogador.equals("papel") && computador.equals("pedra")){
            System.out.println("Você venceu!");
        }
        else if(jogador.equals("tesoura") && computador.equals("papel")) {
            System.out.println("Você venceu!");
        }
        else {
            System.out.println("Você perdeu! ");
        }

        scanner.close();
    }
}