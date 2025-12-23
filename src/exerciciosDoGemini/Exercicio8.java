package exerciciosDoGemini;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique a sua idade em anos: ");
        int idadeAnos = scanner.nextInt();

        int qntdDiasIdade = idadeAnos*365;

        System.out.println("Voce ja viveu "+qntdDiasIdade+" dias");
    }
}
