import java.util.Scanner;

public class Conta_banco {
    public static void main(String[] args) {
        Scanner conta = new Scanner(System.in);

        int escolha = 0;
        double saldo = 2500.00;
        double recebe = 0;
        double transferir = 0;

        System.out.println("""
                            ***********************
                            Dados iniciais do cliente:
                            
                            Nome: João Victor 
                            Tipo conta: Corrente
                            Saldo inicial: R$ 2500,00
                            ***********************""");


           while(escolha != 4) {

               System.out.println("""
                            Operações 
                            1- Consultar saldos
                            2- Receber valor
                            3- Transferir valor
                            4- Sair
                            
                            Digite a opção desejada:""");

               escolha = conta.nextInt();

                    if (escolha == 1) {
                        System.out.println("Seu saldo é de: R$ " + saldo);
                    } else if (escolha == 2) {
                        System.out.println("Informe o valor a ser recebido:");
                        recebe = conta.nextDouble();
                        saldo += recebe;
                        System.out.println("Saldo atualizado: R$" + saldo);
                    } else if (escolha == 3) {
                        System.out.println("Digite qual o valor deseja transferir");
                        transferir = conta.nextDouble();
                        if(saldo<transferir){
                            System.out.println("Saldo insuficiente!");
                        }else{
                        saldo -= transferir;
                        System.out.println("Saldo atualizado: R$" + saldo);}

                    } else if (escolha == 4){
                        System.out.println("Entendido! Sua conta será desconectada.");
                    }else {
                        System.out.println("Opção inválida!");
                    }
           }
    }
}
