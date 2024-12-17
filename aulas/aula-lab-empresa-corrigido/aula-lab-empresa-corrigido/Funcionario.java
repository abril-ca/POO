
public abstract class Funcionario {
    private String nome;
    private float salario;
    private Departamento departamento;

    public Funcionario(String nome, float salario, Departamento d) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = d;
        d.addFuncionario(this);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public Departamento getDepartamento()
    {
        return this.departamento;
    }
    public void setDepartamento(Departamento destino) {
        if (!destino.getFuncionarios().contains(this))
            this.departamento.transfereFuncionario(this, destino);
        this.departamento=destino;
    }

    @Override
    public String toString()
    {
        return this.nome;
    }

    public abstract int getNumeroHorasSemanais();
}
