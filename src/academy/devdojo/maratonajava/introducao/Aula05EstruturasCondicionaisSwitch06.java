package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class Aula05EstruturasCondicionaisSwitch06 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        byte valorDia = scanner.nextByte();

        switch (valorDia) {
            case 1:
                System.out.println("Final de Semana");
                break;
            case 2:
                System.out.println("Semana");
                break;
            case 3:
                System.out.println("Semana");
                break;
            case 4:
                System.out.println("Semana");
                break;
            case 5:
                System.out.println("Semana");
                break;
            case 6:
                System.out.println("Semana");
                break;
            case 7:
                System.out.println("Final de Semana");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}
