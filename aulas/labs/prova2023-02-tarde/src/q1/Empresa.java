package q1;
import java.util.*;

public class Empresa {
    private String nome;
    private Set<Departamento> departamentos = new HashSet<>();

    public Empresa(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public Departamento createDepartamento(String nome){
        Departamento d = new Departamento(nome);
        departamentos.add(d);
        return d;
    }
    
    @Override
    public String toString(){
        String s = "---\n" + "Empresa: " + nome + "\n";
        for (Departamento d : this.departamentos){
            s += d.toString();
        }
        return s;
    }
}
