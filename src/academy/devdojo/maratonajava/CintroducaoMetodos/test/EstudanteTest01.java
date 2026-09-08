package academy.devdojo.maratonajava.CintroducaoMetodos.test;

import academy.devdojo.maratonajava.CintroducaoMetodos.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante  estudante01 = new Estudante();
        Estudante  estudante02 = new Estudante();

        estudante01.nome = "Tadeu";
        estudante01.idade = 24;
        estudante01.sexo = 'M';

        estudante02.nome = "Caio";
        estudante02.idade = 11;
        estudante02.sexo = 'F';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.sexo);
        System.out.println(estudante01.idade);

        System.out.println("---------------------------------");
        System.out.println(estudante02.nome);
        System.out.println(estudante02.sexo);
        System.out.println(estudante02.idade);
    }
}
