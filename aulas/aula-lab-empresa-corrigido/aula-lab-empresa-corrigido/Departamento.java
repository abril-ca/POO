import java.util.HashSet;
import java.util.Set;

public class Departamento {
    private String nome;
    private Set<Funcionario> funcionarios = new HashSet<>();
    private Empresa empresa;

    public Departamento(String nome, Empresa empresa) {
        this.nome = nome;
        this.empresa = empresa;
        this.empresa.addDepartamento(this);
    }

    public Empresa getEmpresa()
    {
        return this.empresa;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addFuncionario(Funcionario f)
    {
        funcionarios.add(f);
    }
    public void removeFuncionario(Funcionario f)
    {
        funcionarios.remove(f);
    }
    public Set<Funcionario> getFuncionarios()
    {
        return new HashSet<>(funcionarios);
    }

    public float getMediaSalarial() {
        float soma=0;
        for(Funcionario f : this.funcionarios)
        {
            soma=soma+f.getSalario();
        }
        return this.funcionarios.isEmpty() ? 0 : soma/this.funcionarios.size();
    }

    public void demiteFuncionario(Funcionario f)
    {
        funcionarios.remove(f);
    }

    public void transfereFuncionario(Funcionario f, Departamento destino)
    {
        this.funcionarios.remove(f);
        destino.addFuncionario(f);
        f.setDepartamento(destino);
    }

}
