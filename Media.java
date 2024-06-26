import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        
        //-----------------------------------------------------Teste declarando variavel-----------------------------------------------------
        char letra = 'A';
        String palavra = "MARELO";

        String mensagem = "A letra é " + letra + " e a palavra é " + palavra;

        System.out.println(mensagem);


        //-----------------------------------------------------Cálculo com input Scanner concatenação-----------------------------------------------------  
        Scanner media = new Scanner(System.in);
        System.out.println("Digite o preço do produto");
        double precoProduto = media.nextDouble();
        System.out.println("Digite a quantidade de produto");
        int quantidade = media.nextInt();
        double valorFinal = precoProduto * quantidade;
        System.out.println(String.format("o valor total de %d produtos com o valor de R$ %.2f é de R$ %.2f.", quantidade, precoProduto, valorFinal));
        media.close();*/

        
        //-----------------------------------------------------Cálculo com input Scanner concatenção-----------------------------------------------------
        Scanner teste = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = teste.nextLine();
        System.out.println("Qual ano que voçê nasceu?");
        int ano = teste.nextInt();
        System.out.println("Em que ano estamos?");
        int anoAtual = teste.nextInt();
        int idade = (anoAtual - ano);
        System.out.println(String.format("Voçê tem ou vai fazer %d anos de idade.",idade));*/
        

        //-----------------------------------------------------Cálculos-----------------------------------------------------
        double valorEmDolares = 452.68;
        double valorRealEqvaDollar = 4.94;
        double valorConvert = valorEmDolares * valorRealEqvaDollar;
        System.out.println(String.format("O valor %.2f dollares convertindo em reais é igual a %.2f",valorEmDolares, valorConvert));

                                ----------------------------------------------------------------------------------------------------------

        double precoOriginal = 735.53;
        double percentualDesconto = 0.045;
        double valorDescon = (precoOriginal * percentualDesconto);
        double precoComdescn = precoOriginal - valorDescon;
        System.out.println(String.format("O valor sem desconto é R$ %.2f, e o valor com o desconto é R$ %.2f, o desconto foi de R$ %.2f",precoOriginal, precoComdescn, valorDescon ));*/


                                ----------------------------------------------------------------------------------------------------------
        
        double temperatura = 264.56;
        double fahrenheit =(temperatura * 1.8) + 32;

        System.out.println ("A temperatura " + temperatura+ " graus Celsius, convertida em Fahrenheit é " +fahrenheit+ " graus");
        System.out.println(String.format ("A temperatura %.2f graus Celsius, convertida em Fahrenheit é %.2f graus",temperatura ,fahrenheit ));

        int fahrenheitinte = (int)fahrenheit;

        System.out.println(String.format ("A temperatura inteira em Fahrenheit é %d graus ", fahrenheitinte ));*/

    }

}
