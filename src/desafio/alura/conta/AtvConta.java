package desafio.alura.conta;

import java.util.Scanner;

public class AtvConta {
    public static void main(String[] args) {

    String nome = "Gustavo Oliveira";
    String tipoConta = "Corrente";
    double saldo = 2000.00;
    Scanner opcao = new Scanner(System.in);
    int escolher = 0;
    double valorReceber = 0;
    double valorTransferir = 0;


        System.out.println("++++++++++++++++++++");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " +tipoConta);
        System.out.println("saldo atual: " + saldo);
        System.out.println("\n++++++++++++++++++++");

        while(escolher != 4 ){
            System.out.println("\nOperacoes");
            System.out.println("1 - consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");

            System.out.println("\nDigite a opcao desejada: ");
            escolher = opcao.nextInt();

            switch (escolher){
                case 1:
                    System.out.println("Seu saldo é: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser recebido: ");
                    valorReceber = opcao.nextDouble();
                    saldo += valorReceber;
                    System.out.println("Foi adicionado ao seu saldo: " + valorReceber);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido: ");
                    valorTransferir = opcao.nextDouble();
                    if( valorTransferir > saldo){
                        while (valorTransferir > saldo){
                            System.out.println("Saldo insuficiente, por favor digite o valor certo:  ");
                            valorTransferir = opcao.nextDouble();
                        }
                    }
                    if(valorTransferir < saldo) {
                        saldo -= valorTransferir;
                        System.out.println("Foi Retirado do seu saldo: " + valorTransferir);
                    }
                    break;
                default:
                    System.out.println("Opcao invalida, digite o numero do menu: ");
            }


        }

    }
}
