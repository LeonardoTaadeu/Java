package academy.devdojo.maratonajava.sistemafuncionarios.dominio;

public class Funcionario {
    private String nome; // Variáveis de Instância
    private String cargo;
    private String setor;
    private float salario;   

    public Funcionario(String nome, String cargo, String setor, float Salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.setor = setor;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getcargo {
        return cargo;
    }

    public String getsetor {
        return setor;
    }

    public float getsalario {
        return salario;
    }
}
