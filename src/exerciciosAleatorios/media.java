package exerciciosAleatorios;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite um segundo numero: ");
        int num2 = scanner.nextInt();

        int media = (num1 + num2)/2;

        System.out.println("A media dos numeros " + num1 + " e " + num2 + " eh " + media);
    }
}