package exerciciosDoGemini;
import java.util.Scanner;

// deve receber cinco notas, armazena-las e ver qual a maior

public class Exercicio12 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double contadorNotas = 0;

        double[] notasAlunos = new double[4];

        while (contadorNotas < 5) {
            System.out.println("Qual sua nota: ");

            notasAlunos[contadorNotas] = scanner.nextDouble();

            contadorNotas++;
        }


    }
}
