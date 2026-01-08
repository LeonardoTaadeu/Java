package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class Aula06EstruturasDeRepetição04 {
        //dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // A condição é que o valor da parcela tem que ser maior ou igual a 1000
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor total do carro: ");
        double valorCarro = scanner.nextDouble();

        for (int parcela = 1; parcela <= valorCarro ; parcela++) {
            double valorParcela = valorCarro/parcela;
            if(valorParcela >= 1000) {
                System.out.println("Parcela "+parcela+" R$"+valorParcela );
            }else {
                break;
            }
        }
    }
}
