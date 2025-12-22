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
    }
}
