package exerciciosDoGemini;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma quantidade inteira de minutos: ");
        int minutosUsuario = scanner.nextInt();

        int horasInteiros = minutosUsuario/60;

        int horasResto = minutosUsuario%60;

        System.out.println("Esses minutos equivalem a "+horasInteiros+" horas e "+horasResto+" minutos.");
    }
}
