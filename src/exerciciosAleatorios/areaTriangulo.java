package exerciciosAleatorios;
import java.util.Scanner;

public class areaTriangulo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a base do triangulo: ");
        double baseTriangulo = scanner.nextDouble();

        System.out.println("Qual a altura do triangulo: ");
        double alturaTriangulo = scanner.nextDouble();

        double areaTriangulo = (baseTriangulo*alturaTriangulo)/2;

        System.out.println("A area do trinagulo eh de " + areaTriangulo);
    }
}
