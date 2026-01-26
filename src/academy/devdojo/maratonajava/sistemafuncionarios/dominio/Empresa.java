package academy.devdojo.maratonajava.sistemafuncionarios.dominio;

public class Empresa {
    private Funcionario[] funcionarios = new Funcionario[20];
    private int index = 0;

    public void adicionarFuncionario(Funcionario funcionario) {
        if (index < funcionario.lenght) {
            funcionarios[index++] = funcionario;
        } else {
            System.out.println("Limite de funcionários atingido");
        }
    }

    public Funcionario[] getFuncionarios {
        return funcionarios;
    }
}
    