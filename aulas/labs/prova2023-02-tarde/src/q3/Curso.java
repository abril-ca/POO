package q3;
import java.util.*;

public class Curso {
    private String nome;
    private LinkedHashMap<String, Disciplina> disciplinas = new LinkedHashMap<>();

    public Curso(String nomeCurso){
        this.nome = nomeCurso;
    }

    public String getNome(){
        return nome;
    }

    public LinkedHashMap<String, Disciplina> getDisciplinas(){
        return new LinkedHashMap<>(disciplinas);
    }

    public Disciplina criaDisciplina(String idDisciplina, String nomeDisciplina) {
        Disciplina d = new Disciplina(idDisciplina, nomeDisciplina);
        disciplinas.put(idDisciplina, d);
        return d;
    }

    public void estabelecePreReq(Disciplina disciplina, String trim) {
        disciplina.atribuiPreReq(trim);
    }
    
}
