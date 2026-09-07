package academy.devdojo.maratonajava.Bjavacoreintroducaoclasses.teste;

import academy.devdojo.maratonajava.Bjavacoreintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println(professor.nome);
        System.out.println(professor.idade);
        System.out.println(professor.sexo);
    }
}
