package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

/*
    I want to know how much i have to pay in the netherlands 2020 based on my annual salary

    From (per year)               up to and including                   Tax
    0                               34.712                              9.7%
    34.713                          68.507                              37.35%
    68.508                                                              49.50%
*/

public class Aula05EstruturasCondicionais04 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o valor do seu salário anual: ");
        double valorSalarioAnual = scanner.nextDouble();

        double valorTaxaSalarioAnualPequeno =valorSalarioAnual * 0.097;
        double valorTaxaSalarioAnualMedio =valorSalarioAnual * 0.3735;
        double valorTaxaSalarioAnualGrande =valorSalarioAnual * 0.4950;

        if(valorSalarioAnual >= 0 && valorSalarioAnual <= 34712) {
            System.out.println("Você precisa pagar: "+valorTaxaSalarioAnualPequeno);
        }else if(valorSalarioAnual >= 34713 && valorSalarioAnual <= 68507) {
            System.out.println("Você precisa pagar: "+valorTaxaSalarioAnualMedio);
        }else {
            System.out.println("Você precisa pagar: "+valorTaxaSalarioAnualGrande);
        }

    }
}
