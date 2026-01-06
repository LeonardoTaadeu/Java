package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main (String[] args){
        // idade < 15 categoria infantil
        // idade >= 15 e idade < 18 juvenil
        // idade >= 18 adulto

        int idade = 14;
        String categoria;

        if(idade < 15) {
            System.out.println("Voce eh da categoria infantil");
        }else if(idade >= 15 && idade < 18) {
            System.out.println("Voce eh da categoria juvenil");
        }else {
            System.out.println("voce eh da categoria adulto");
        }

    }
}
