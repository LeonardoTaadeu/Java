package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main (String[] args){
        // doar se salario for maior que 5000
        double salario = 4999;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda nao tenho condicoes mas vou ter";
        String resultado;

        if(salario > 5000) {
            resultado = mensagemDoar;
        }else {
            resultado = mensagemNaoDoar;
        }

        System.out.println(resultado);

        //ISSO PODE SER FEITO UTILIZANDO-SE OPERADOR TERNARIO

        double salario1 = 5000;
        String mensagemDoar1 = "Eu vou doar 500 pro DeDojo1";
        String mensagemNaoDoar1 = "Ainda nao tenho condicoes mas vou ter";

        // (condicao) ? verdadeiro : falso
        String resultado1 = salario1 > 5000 ? mensagemDoar1 : mensagemNaoDoar1;

        System.out.println(resultado1);
    }
}
