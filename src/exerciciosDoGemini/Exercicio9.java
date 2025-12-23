package exerciciosDoGemini;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o banco da sua composicao: ");
        String bancoComposicao = scanner.nextLine();

        System.out.println("Qual o codigo da sua composicao: ");
        int codigoComposicao = scanner.nextInt();

        System.out.println("Qual a descricao da sua composicao: ");
        String descricaoComposicao = scanner.nextLine();

        System.out.println("Qual o valor do seu BDI: ");
        double bdiComposicao = scanner.nextDouble();

        System.out.println("Qual o valor da sua composicao: ");
        double valorComposicao = scanner.nextDouble();

        System.out.println(bancoComposicao);
        System.out.println(codigoComposicao);
        System.out.println(descricaoComposicao);
        System.out.println(bdiComposicao);
        System.out.println(valorComposicao);
    }
}
