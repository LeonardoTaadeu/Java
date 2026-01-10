package exerciciosDoGemini;
import java.util.Scanner;

// deve receber cinco notas, armazena-las e ver qual a maior

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contadorNotas = 0;

        int[] numerosNotas = new int[5];

        while (contadorNotas < 5) {
            System.out.println("Qual sua nota: ");

            numerosNotas[contadorNotas] = scanner.nextInt();

            contadorNotas++;
        }

        int maiorNumero = numerosNotas[0];

        for (int i = 0; i < numerosNotas[5]; i++) {
            int notaArray = numerosNotas[i];

            if (notaArray > maiorNumero) {
                maiorNumero = notaArray;
            }

        }
    }
}
