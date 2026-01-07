package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class Aula06EstruturasDeRepetição03 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 números de um dado valor: Exemplo, 50
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if(i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
