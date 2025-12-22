package exerciciosDoGemini;
import java.util.Scanner;

public class Exercicio6 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Sua nota em Linguagens, Códigos e suas Tecnologias: ");
        double notaLinguagens = scanner.nextDouble();

        System.out.println("Sua nota em Ciências Humanas e suas Tecnologias: ");
        double notaHumanas = scanner.nextDouble();

        System.out.println("Sua nota em Ciências da Natureza e suas Tecnologias: ");
        double notaNatureza = scanner.nextDouble();

        System.out.println("Sua nota em Matemática e suas Tecnologias: ");
        double notaMatematica = scanner.nextDouble();

        System.out.println("Sua nota em Redação: ");
        double notaRedação = scanner.nextDouble();

        double notaBct = ((notaNatureza*1.5)+(notaMatematica*1.5)+(notaRedação*1.5)+notaHumanas+notaLinguagens)/6.5;
        double notaBch = ((notaHumanas*1.5)+(notaLinguagens*1.5)+(notaRedação*1.5)+notaMatematica+notaNatureza)/6.5;

        System.out.println(nome+", sua nota para o curso BCT eh "+notaBct+" e sua nota para BCH eh "+notaBch);
    }
}
