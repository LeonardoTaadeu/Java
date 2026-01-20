package academy.devdojo.maratonajava.javacoreintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacoreintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Ford";
        carro.estado = "Novo";
        carro.ano = 1990;

        carro2.nome = "Gurgel";
        carro2.estado = "Velho";
        carro2.ano = 1970;

        //carro = carro2;
        //carro2 = carro;

        System.out.println("Nome do carro: "+carro.nome+", esta no estado "+carro.estado+", do ano de "+carro.ano);

        System.out.println("Nome do carro: "+carro2.nome+", esta no estado "+carro2.estado+", do ano de "+carro2.ano);


    }
}
