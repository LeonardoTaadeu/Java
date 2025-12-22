package exerciciosDoGemini;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a cotacao do dolar hoje: $");
        double dolarCotacao = scanner.nextDouble();

        System.out.println("Quantos reais voce quer converter? R$");
        double realCarteira = scanner.nextDouble();

        double conversao = realCarteira/dolarCotacao;

        System.out.println("O valor total da sua conversao ficou em $"+conversao);
    }
}
