package exerciciosDoGemini;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String aluno1 = scanner.nextLine();

        System.out.println("Digite a sua nota de Matematica: ");
        float notaMatematicaAluno1 = scanner.nextFloat();

        System.out.println("Digite a sua nota de Geografia: ");
        float notaGeografiaAluno1 = scanner.nextFloat();

        System.out.println("Digite a sua nota de Filosofia: ");
        float notaFilosofiaAluno1 = scanner.nextFloat();

        float media = (notaMatematicaAluno1+notaGeografiaAluno1+notaFilosofiaAluno1)/3;

        System.out.println(aluno1+", sua media foi: "+media);

    }
}
