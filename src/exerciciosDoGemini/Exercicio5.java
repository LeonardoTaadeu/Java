package exerciciosDoGemini;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        double ladoQuadrado = scanner.nextDouble();

        double areaQuadrado = ladoQuadrado*ladoQuadrado;

        System.out.println("O lado escolhido foi "+ladoQuadrado+" e o valor de sua area eh igual a "+areaQuadrado+"m2");
    }
}
