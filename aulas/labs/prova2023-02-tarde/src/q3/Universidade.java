package q3;

import java.util.*;

public class Universidade {
    private String nome;
    private LinkedHashMap<String, Curso> cursos = new LinkedHashMap<>();

    public Universidade(String nomeUniversidade) {
        this.nome = nomeUniversidade;
    }

    public String getnome(){
        return nome;
    }

    public LinkedHashMap<String, Curso> getCursos(){
        return new LinkedHashMap<>(cursos);
    }

    public Curso criaCurso(String nomeCurso) {
        Curso c = new Curso(nomeCurso);
        cursos.put(nomeCurso, c);
        return c;
    }

    public String toString(){
        String s = "Universidade: " + nome + "\n";
        for(Curso c : cursos.values()){
            s += c.toString();
        }
        return s;
    }
}
