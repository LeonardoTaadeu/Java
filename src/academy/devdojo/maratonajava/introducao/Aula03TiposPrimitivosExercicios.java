package academy.devdojo.maratonajava.introducao;

        /*
            Crie variavies para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

            Eu <nome>, morando no endereco <endereco>, confirmo que recebi o salario de <salario> na data <data>
        */

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args){
        String nameEmployer = "Leonardo Tadeu Brito Pedro";
        String adressEmployer = "Rua mendes de Moura, n20 casa 2";
        float salaryEmployer = 1814.14F;
        String dateRecebimentoSalario = "20/07/2025";
        String relatorio = "Eu, "+nameEmployer+", morando na "+adressEmployer+", confirmo que recebi o salario de R$"+salaryEmployer+" no dia "+dateRecebimentoSalario;

        System.out.println(relatorio);
    }
}
