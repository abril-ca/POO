import java.util.HashSet;
import java.util.Set;

public class Empresa {
    private String nome;
    private Set<Departamento> departamentos = new HashSet<>();
    
    public Empresa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addDepartamento(Departamento d)
    {
        departamentos.add(d);
    }

    public Set<Departamento> getDepartamentos()
    {
        // faz cópia para não deixar "vazar" o conjunto (o que permitiria alterações do conjunto de departamentos
        // por clientes)
        return new HashSet<>(this.departamentos);
    }

    @Override
    public String toString()
    {
        return this.nome;
    }
}
