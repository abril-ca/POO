package q1;
import java.util.*;

public class Departamento implements UnidadeOrganizacional{
    private String nome;
    private Set<Setor> setores = new HashSet<>();
    
    public Departamento(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    
    public Setor createSetor(String nome)
    {
        Setor s = new Setor(nome);
        setores.add(s);
        return s;
    }

    public double getSalarioMedio() {
        if (setores.isEmpty()){
            return 0;
        }
        double somaTotal = 0;
        Set<Funcionario> funcionarios = this.getFuncionarios();
        for (Funcionario f : funcionarios){
            somaTotal += f.getSalario();
        }
        return somaTotal / funcionarios.size();
    }

    public Set<Funcionario> getFuncionarios() {
        if (setores.isEmpty()){
            return null;
        }
        Set<Funcionario> funcionarios = new HashSet<>();
        for (Setor s : setores){
            for(Funcionario f : s.getFuncionarios()){
                funcionarios.add(f);
            }

        }
        return funcionarios;
    }

    @Override
    public String toString(){
        String s = "---\n" + "Departamento: " + nome + ", media salarial: $" + this.getSalarioMedio() + "\n";
        for (Setor se : setores){
            s += se.toString();
        }
        return s;
    }
}
