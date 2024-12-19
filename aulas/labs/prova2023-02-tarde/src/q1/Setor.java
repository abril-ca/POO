package q1;
import java.util.*;

public class Setor implements UnidadeOrganizacional{
    private String nome;
    private Set<Funcionario> funcionarios = new HashSet<>();

    public Setor (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void addFuncionario(Funcionario f){
        f.setSetor(this);
        funcionarios.add(f);
    }

    public void rmvFuncionario(Funcionario f){
        funcionarios.remove(f);
    }

    public double getSalarioMedio(){
        if(funcionarios.isEmpty()){
            return 0;
        }
        double somaTotal = 0;
        for (Funcionario f : funcionarios){
            somaTotal += f.getSalario();
        }
        return somaTotal / funcionarios.size();
    }

    public Set<Funcionario> getFuncionarios() {
        return new HashSet<>(funcionarios);
    }

    @Override
    public String toString(){
        return "Setor: " + nome + ", media salarial: $" + this.getSalarioMedio() + "\n";
    }
}
