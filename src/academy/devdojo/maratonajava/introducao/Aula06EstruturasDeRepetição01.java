package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while(count < 100){ //o código só é resultado se a expressão dentro do While que é booleana for verdadeiro
            System.out.println(count);
            count++;
        }

        for(int i=0; i < 10; i++){ //geralmente usado para contagens, verificando itens de uma lista no banco de dados por exemplo
            System.out.println("for "+i);
        }
    }
}
