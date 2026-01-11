package exerciciosDoGemini;
import java.util.Scanner;

// Solicite 5 notas de alunos, as notas podem ser numeros quebrados,
// em seguida calcule a media da turma, imprima a media e liste quais notas ficaram acima da media


public class Exercicio12 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorNotas = 0;

        double[] notasAlunos = new double[5];

        while (contadorNotas < 5) {
            System.out.println("Qual sua nota: ");

            notasAlunos[contadorNotas] = scanner.nextDouble();

            contadorNotas++;
        }

        double somaNotas = 5; //Essa variavel vai ter o valor da soma do Array

        for (int i = 0; i < 4; i++) {
            somaNotas += notasAlunos[i];
        }

        double divisaoNotas = somaNotas/5;

        System.out.println("A media da turma vale: "+divisaoNotas);
    }
}
