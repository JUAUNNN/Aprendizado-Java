import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //- - - - - - - - - - - - - - - TESTE LOOP COM Scanner- - - - - - - - - - - - - - - - //

        Scanner media = new Scanner(System.in);
       /* double mediaDigita = 0;
        double mediaReceb = 0;
        System.out.println("Digite 4 números para calcular a media ");
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o número desejado ");
            mediaReceb = media.nextDouble();
            mediaDigita += mediaReceb;
        }
        System.out.println("A média dos números digitados é " +mediaDigita/4);*/

        double mediDigi = 0;
        double numRecb = 0;
        int numetotal = 0;

        System.out.println("""
                                Caso queria calcular a média de alguns números 
                                basta informar quais são, e quando quiser parar digite -1""");

        while (numRecb != -1){
            numRecb = media.nextDouble();

            if (numRecb != -1 ){
                mediDigi += numRecb;
                numetotal++;
            }
        }
        System.out.println("A média dos numeros informados é de " +mediDigi/numetotal);
    }
}
