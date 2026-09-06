import java.util.Scanner;

public class contadorDeVogais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine().toLowerCase();

        int contador = 0;

        for (int i = 0; i < palavra.length(); i++) {

            char caractere = palavra.charAt(i);

            if (caractere == 'a' || caractere == 'e' ||
                    caractere == 'i' || caractere == 'o' ||
                    caractere == 'u') {

                contador++;
            }
        }

        System.out.println("Quantidade de vogais: " + contador);

        scanner.close();
    }
}