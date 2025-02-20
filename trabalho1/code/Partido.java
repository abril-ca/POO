import java.util.*;

public class Partido{
    private int numero;
    private String sigla;
    private LinkedList<Candidato> candidatos = new LinkedList<>();

    public Partido(int numero, String sigla){
        this.numero = numero;
        this.sigla = sigla;
    }


    public void addCandidato(Candidato c){
        candidatos.add(c);
    }


    public int getNumero(){
        return this.numero;
    }
    public String getSigla(){
        return this.sigla;
    }
}
