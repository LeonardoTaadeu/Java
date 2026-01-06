package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){

        // + - / *

        int num1 = 10;
        int num2 = 20;
        System.out.println(num2-num1);
        System.out.println(num2+num1);
        System.out.println(num2*num1);
        System.out.println(num2/num1);

        int resto = 20 % 2;
        System.out.println(resto);

        // MENOR < / MAIOR > / MENOR IGUAL <= / MAIOR IGUAL >= / IGUAL == / DIFERENTE != (Eles so retornam valores booleanos)

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        // AND && / OR || / NOT !

        String nome = "William";
        int idade = 35;
        float salario = 5200F;

        boolean isDentroDaLei = idade > 30 && salario > 4612;

        System.out.println(nome+" esta dentro da lei: "+isDentroDaLei);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;

        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("da para comprar o play: "+isPlaystationCincoCompravel);

        // =, +=, -=, *=, /=, %=

        double bonus = 1800;
        bonus = 2000;
        System.out.println(bonus); // Aqui ele eh 2000

        double bonus2 = 1800;
        bonus2 += 2000;
        System.out.println(bonus2); // Aqui ele eh 3800

        double bonus3 = 1800;
        bonus3 -= 2000;
        System.out.println(bonus3); // Aqui ele eh -200

        //
        int contador = 0;
        contador += 1; // contador = contador + 1
        System.out.println(contador);

        //OU

        int contadorPlusPlus = 0;
        contadorPlusPlus++;
        System.out.println(contadorPlusPlus);

        // ++contador / --contador == primeiro executa
    }
}
