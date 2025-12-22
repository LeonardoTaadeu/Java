package exerciciosDoGemini;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Me indique um numero: ");
        int numero = scanner.nextInt();

        int antecessor = numero-1;
        int sucessor = numero+1;

        System.out.println("Sucessor = "+sucessor);
        System.out.println("Antecessor = "+antecessor);
    }
}
