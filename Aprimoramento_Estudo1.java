import java.util.Scanner;

public class Aprimoramento_Estudo1 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        /*int num = 0;
        System.out.println("Digite um número, e irei informar se ele é positivo ou negativo");
        num = numero.nextInt();
        if(num >= 0){
            System.out.println(String.format("Este número %d é positivo!", num));
        } else{
            System.out.println(String.format("Este número %d é negativo!", num));
        }
        int primeiro = 0;
        int segundo = 0;
        System.out.println("""
                              Por gentileza, informe 2 números para que faça uma comparação de ambos.
                              Digite o primeiro número:""");
        primeiro = numero.nextInt();

        System.out.println("Agora digite o segundo número");
        segundo=numero.nextInt();
         if(primeiro==segundo){
             System.out.println("Os números informados são iguais");
         } else {
             System.out.println("São números diferentes!");

         }if (primeiro > segundo) {
             System.out.println(String.format("O número %d é maior que %d ", primeiro, segundo));
         } else if (primeiro < segundo) {
            System.out.println(String.format("O número %d é menor que o %d",primeiro, segundo));
        } else {
         }
        int escolha1 = 0;
        int escolha2 = 0;
        int quadrado = 0;
        int circulo = 0;

        System.out.println("Digite 1 se quer calcular a área de um quadrado, ou 2 para calcular a área de um círculo");

        escolha1 = numero.nextInt();
        escolha2 = numero.nextInt();

        if (escolha1==1){
            System.out.println("OK! Vamos calcular a área do quadrado, para isso por gentileza informar a medida");
            quadrado = numero.nextInt();
            System.out.println("A área do quadrado é de " + quadrado*quadrado);
        } else {
            System.out.println("OK! Vamos calcular a área do círculo, para isso por gentileza informar a medida");
            circulo = numero.nextInt();
            System.out.println("A área do círculo é de " + 3.14*(circulo*circulo));
        }

        int digit = 0;

        System.out.println("Quer saber alguma tabuada de 1 a 10? Basta informar o número que deseja, para conhecer sua tabuada");
        digit = numero.nextInt();
        String tabuada;

        switch (digit) {
            case 1:
                tabuada = """
                        "1x1 = 1" +
                        "1x2 = 2" +
                        "1x3 = 3" +
                        "1x4 = 4" +
                        "1x5 = 5" +
                        "1x6 = 6" +
                        "1x7 = " +
                        "1x8 = 8" +
                        "1x9 = 9" +
                        "1x10 = 10""";
                break;
            case 2:
                tabuada = """
                         2x1 = 2
                         2x2 = 4
                         2x3 = 6
                         2x4 = 8
                         2x5 = 10
                         2x6 = 12
                         2x7 = 14
                         2x8 = 16
                         2x9 = 18
                         2x10 = 20""";
                break;
            case 3:
                tabuada = """
                        3x1 = 3
                        3x2 = 6
                        3x3 = 9
                        3x4 = 12
                        3x5 = 15
                        3x6 = 18
                        3x7 = 21
                        3x8 = 24
                        3x9 = 27
                        3x10 = 30""";
                break;
            case 4:
                tabuada = """
                        4x1 = 4
                        4x2 = 8
                        4x3 = 12
                        4x4 = 16
                        4x5 = 20
                        4x6 = 24
                        4x7 = 28
                        4x8 = 32
                        4x9 = 36
                        4x10 = 40""";
                break;
            case 5:
                tabuada = """
                        5x1 = 5
                        5x2 = 10
                        5x3 = 15
                        5x4 = 20
                        5x5 = 25
                        5x6 = 30
                        5x7 = 35
                        5x8 = 40
                        5x9 = 45
                        5x10 = 50""";
                break;
            case 6:
                tabuada = """
                        6x1 = 6
                        6x2 = 12
                        6x3 = 18
                        6x4 = 24
                        6x5 = 30
                        6x6 = 36
                        6x7 = 42
                        6x8 = 48
                        6x9 = 54
                        6x10 = 60""";
                break;
            case 7:
                tabuada = """
                        7x1 = 7
                        7x2 = 14
                        7x3 = 21
                        7x4 = 28
                        7x5 = 35
                        7x6 = 42
                        7x7 = 49
                        7x8 = 56
                        7x9 = 63
                        7x10 = 70""";
                break;
            case 8:
                tabuada = """
                        8x1 = 8
                        8x2 = 16
                        8x3 = 24
                        8x4 = 32
                        8x5 = 40
                        8x6 = 48
                        8x7 = 56
                        8x8 = 64
                        8x9 = 72
                        8x10 = 80""";
                break;
            case 9:
                tabuada = """
                        9x1 = 9
                        9x2 = 18
                        9x3 = 27
                        9x4 = 36
                        9x5 = 45
                        9x6 = 54
                        9x7 = 63
                        9x8 = 72
                        9x9 = 81
                        9x10 = 90""";
                break;
            case 10:
                tabuada = """
                        10x1 = 10
                        10x2 = 20
                        10x3 = 30
                        10x4 = 40
                        10x5 = 50
                        10x6 = 60
                        10x7 = 70
                        10x8 = 80
                        10x9 =  90
                        10x10 = 100""";
                break;
            default:
                tabuada = "Só deve informar número de 1 a 10";
                break;
        }

        System.out.println("A tabuada do " + digit + " é " + tabuada);*/

        /*---------------Código verificar se número é par ou impar-------------------------

        int testeParImpar = 0;

        System.out.println("Digite um número e lhe informo se ele é par ou impar");
        testeParImpar = numero.nextInt();

        if (testeParImpar % 2 ==0 ){
            System.out.println("O número " + testeParImpar+ " é par");
        } else{
            System.out.println("O número " + testeParImpar+ " é impar");
        }

        ---------------Código calculo de fatorial -------------------------*/

        int fatorial = 0;
        int calculo =(0);

        System.out.println("Escreva um número inteiro positivo, e será calculado o seu fatorial");
        fatorial = numero.nextInt();

        if (fatorial >-1){
            while (fatorial!=1){
                fatorial =(fatorial-1)*fatorial;
            }
            System.out.println("O fatorial é "+ fatorial);
        }else {
            System.out.println("Você deve digitar um numero interio e positivo, para que seja possivel calcular");
        }
    }




}

