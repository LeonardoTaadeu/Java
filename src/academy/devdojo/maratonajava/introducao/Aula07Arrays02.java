package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class Aula07Arrays02 {
    public static void mian(String[] args) {
        // Valores padrões para cada tipo
        //byte, short, int, long, float e double ====> 0
        //char 'u000'
        //boolean false
        //string null
        
        String[] nomes = new String[3];
        nomes[0] = "Leonardo";
        nomes[1] = "Tadeu";
        nomes[2] = "Brito";

        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
        }
    }
}
