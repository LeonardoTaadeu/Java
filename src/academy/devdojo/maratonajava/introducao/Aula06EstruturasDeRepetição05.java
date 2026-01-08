package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class Aula06EstruturasDeRepetição05 {
        //dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // A condição é que o valor da parcela tem que ser maior ou igual a 1000
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor total do carro: ");
        double valorCarro = scanner.nextDouble();

        for (int parcela = (int) valorCarro; parcela >= 1 ; parcela--) {
            double valorParcela = valorCarro/parcela;
            if(valorParcela <= 1000) {
                continue;
            }
            System.out.println("Parcela "+parcela+"R$ "+valorParcela);
        }
    }
}
