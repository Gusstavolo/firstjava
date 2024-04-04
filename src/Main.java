import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Agora é com você! Pratique os conceitos que foram ensinados ao longo dessa aula com o seguinte desafio:
        //
        //Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.
        //
        //Dicas:
        //
        //Para gerar um número aleatório em Java: new Random().nextInt(100);
        //Utilize o Scanner para obter os dados do usuário;
        //Utilize uma variável para contar as tentativas;
        //Utilize um loop para controlar as tentativas;
        //Utilize a instrução break; para interromper o loop.
        int num = new Random().nextInt();
        int modonum = 0;
        int numplay = 0;
        int numDf = 0;
        boolean play = false;
        Scanner leitura = new Scanner(System.in);
        Scanner escolhad = new Scanner(System.in);
        int totalDeTentativas = 0;
        int numTentativas = 5;


        while (!play){
            System.out.println("Selecione a dificuldade: ");
            System.out.println("1. Facil");
            System.out.println("2. Dificil");
            numDf = escolhad.nextInt();
            switch (numDf){
                case 1:
                    num = new Random().nextInt(10);
                    modonum = 10;
                    break;
                case 2:
                    num = new Random().nextInt(100);
                    modonum = 100;
                    break;
            }
            break;
        }


        System.out.println("Acerte o mumero de 0 a " + modonum);
       // System.out.println(num);
        while(num != numplay){
            System.out.println("Diga seu chute: ");
            numplay = leitura.nextInt();
            totalDeTentativas++;
            System.out.println("Voce tem: "+ (numTentativas - totalDeTentativas)  + " tentativas");
           if (numplay > num){
               System.out.println("o numero é menor que -> " + numplay);
           }
           else {
               System.out.println("o numero é maior que -> " + numplay);
           }

            if (totalDeTentativas == numTentativas){
                System.out.println("Voce perdeu, numero de tentativas esgotadas, o numero era -> " + num);
                break;
            }
        }
        if (totalDeTentativas != numTentativas){

            System.out.println("Voce acertou!! com " + totalDeTentativas + " tentativas");

        }

        
    }
}