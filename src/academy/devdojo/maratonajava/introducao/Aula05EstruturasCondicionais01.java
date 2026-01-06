package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args){
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcoolica");
        }

        if(!isAutorizadoComprarBebida == false){ //O sinal de ! no comeco trata-se de uma negativa, tipo "se NAO isAutorizado....."
            System.out.println("Nao autorizado a comprar bebida alcoolica");
        }

        //O IF precisa necessariamente estar retornando um valor booleano

        System.out.println("Fora do If");

        if(isAutorizadoComprarBebida) {
            System.out.printf("Autorizado");
        }else{
            System.out.println("Nao Autorizado");
        }


    }
}
