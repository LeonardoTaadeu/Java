package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class Aula06EstruturasDeRepetição02 {
    //Imprima todos os números pares de 0 até 1000000

    public static void main(String[] args) {
        for(int i=0; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
