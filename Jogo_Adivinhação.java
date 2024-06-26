
import java.util.Random;
import java.util.Scanner;

public class Jogo_Adivinhação {

    public static void main(String[] args) {
        Scanner jogo = new Scanner(System.in);
        Random criador = new Random();

        int numeroTentativas=0;
        int numeroDigitado = 0;
        int numeroCriado;
        System.out.println("Este é um jogo de adivinhação, no qual voçê terá 5 tentativas, para acertar o número misterioso, ele vai de 0 a 100");

        numeroCriado = criador.nextInt(101);
        System.out.println(numeroCriado);
        System.out.println("Digite o número que você acredita ser a resposta:");
        numeroDigitado = jogo.nextInt();
            for (int  i = 0;  i <5; i++) {
                System.out.println(numeroTentativas);
                if (numeroDigitado == numeroCriado) {
                    System.out.println("Parabéns você acertou!");
                    break;
                } else if (numeroDigitado > numeroCriado) {
                    System.out.println("DICA: O número é menor");
                    numeroDigitado = jogo.nextInt();

                } else if (numeroTentativas ==5) {
                    System.out.println("Infelizmente suas tentativas se acabaram");

                } else{
                    System.out.println("DICA: O número é maior");
                    numeroDigitado = jogo.nextInt();
               }

            }

    }
}























        


