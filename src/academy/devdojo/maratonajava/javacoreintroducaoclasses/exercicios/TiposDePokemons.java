package academy.devdojo.maratonajava.javacoreintroducaoclasses.exercicios;

public class TiposDePokemons {
    public static void main(String[] args) {
        Pokemons pokemons = new Pokemons();
        Pokemons pokemons2 = new Pokemons();

        pokemons.name = "Charmander";
        pokemons.type = "Fogo";
        pokemons.sexo = 'M';
        pokemons.pokedexNumber = 4;

        pokemons2.name = "Articuno";
        pokemons2.type = "Gelo e Voador";
        pokemons2.sexo = 'F';
        pokemons.pokedexNumber = 144;

        System.out.println(pokemons + " e " + pokemons2);
    }
}
