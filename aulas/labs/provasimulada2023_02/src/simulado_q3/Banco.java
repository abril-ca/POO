package simulado_q3;
import java.util.*;

public class Banco {
    private String nome;
    private Map<String, Agencia> agencias = new HashMap<>();

    public Banco(String nomeBanco) {
        this.nome = nomeBanco;
    }
    
    public String getNome()
    {
        return this.nome;
    }

    public Agencia criaAgencia(String nomeAgencia) {
        Agencia a = new Agencia(nomeAgencia);
        agencias.put(nomeAgencia, a);
        return a;
    }

    @Override
    public String toString()
    {
        String s = "Nome do Banco: " + this.nome + "\n";
        for (Agencia a : agencias.values()){
            s += a.toString();
        }

        return s;
    }
}
