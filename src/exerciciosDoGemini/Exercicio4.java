package exerciciosDoGemini;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int anoAtual = 2025;

        System.out.println("Em que ano voce nasceu: ");
        int anoPessoa = scanner.nextInt();

        int idadePessoa = anoAtual - anoPessoa;

        System.out.println("Voce tem "+idadePessoa+" anos de idade");
    }
}
