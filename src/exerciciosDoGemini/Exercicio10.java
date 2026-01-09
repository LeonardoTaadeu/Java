package exerciciosDoGemini;
import java.util.Scanner;

//Usuario deve preencher um Array com 10 numeros, e posteriormente o programa vai informar quantos sao pares e quantos sao impares.

public class Exercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        int[] contadorNumeros = new int[10];

        while(contador < 10) {
            System.out.println("Digite um numero inteiro: ");

            contadorNumeros[contador] = scanner.nextInt();

            contador++;
        }

        int totalPares = 0;
        int totalImpares = 0;

        for (int i = 0; i < 10; i++) {
            int numeroArray = contadorNumeros[i];

            if(numeroArray % 2 == 0){
                System.out.println(numeroArray+" PAR");
                totalPares++;
            }else {
                System.out.println(numeroArray+" IMPAR");
                totalImpares++;
            }
        }
        System.out.println("O total de numeros pares foi: "+totalPares+" e o total de numeros impares foi: "+totalImpares);
    }
}
