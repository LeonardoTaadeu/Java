package academy.devdojo.maratonajava.sistemafuncionarios.teste;

import java.util.Scanner;

//Criando um sistema onde o usuario vai cadastrar funcionarios, ver a media de salario e consegue acessar os menus atraves dos numerais

public class menuTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("|----------------------------|");
        System.out.println("| Opção 1: Novo Funcionario  |");
        System.out.println("| Opção 2: Funcionarios      |");
        System.out.println("| Opção 3: Estatisticas      |");
        System.out.println("| Opção 4: Encerrar          |");
        System.out.println("|----------------------------|");
        System.out.println("-------Digite uma Opção ------");

        int opcaoMenu = scanner.nextInt();


    }
}
