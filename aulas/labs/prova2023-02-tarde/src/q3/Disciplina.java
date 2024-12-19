package q3;
import java.util.*;

public class Disciplina {
    private String nome;
    private String id;
    private LinkedList<String> preReqs = new LinkedList<>();

    public Disciplina(String idDisciplina, String nome)
    {
        this.nome = nome;
        this.id = idDisciplina;
    }

    public void atribuiPreReq(String idPreReq){
        preReqs.add(idPreReq);
    }

    public String getNome(){
        return nome;
    }

    public String getId(){
        return id;
    }

    public LinkedList<String> getPreReqs(){
        return new LinkedList<>(preReqs);
    }
    
}
