package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // Tipos primitivos sao os tipos simples que vao ser guardados em memoria
        // int, double, float, char, byte, short, long e boolean
        long numeroGrande = 10000;
        int age = 10;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Leonardo Tadeu Brito Pedro";

        System.out.println("A idade e "+age+" anos");
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println("Ola, meu nome eh "+nome+" e eu tenho "+age+" anos de idade");
    }
}
