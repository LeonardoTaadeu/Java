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

        public static void novoFuncionario {
            Scanner scanner = new Scanner(System.in);

            int confirmarNovoFuncionario = 1;

            while(confirmarNovoFuncionario == 1) { // and array < 20)
                System.out.println("Nome: ");
                String nomeFuncionario = scanner.nextLine();

                System.out.println("Cargo: ");
                String nomeCargo = scanner.nextLine();

                System.out.println("Setor: ");
                String setorFuncionario = scanner.nextLine();

                System.out.println("Salario: ");
                float salarioFuncionario = scanner.nextFloat();

                System.out.println("Deseja inserir um novo usuario? Caso sim digite 1, caso nao digite 0: ");
                confirmarNovoFuncionario = scanner.nextInt();
                scanner.nextLine();
            }
        }
    }
