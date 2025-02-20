import java.util.*;

public class Candidato{
    private String nome;
    private int numero;
    private int nVotos;
    private Date data;
    private int genero;
    private int situacao;
    private int federacao;
    private Partido partido;

    Candidato(int numero, String nome, Date data, 
                int genero, int situacao, int federacao)
    {
        this.numero = numero;
        this.nome = nome;
        this.data = data;
        this.genero = genero;
        this.situacao = situacao;
        this.federacao = federacao;
    }

    public void setNVotos(int nVotos){
        this.nVotos = nVotos;
    }
    public void setPartido(Partido p){
        this.partido = p;
    }
    
    public String getNome(){
        return nome;
    }
    public int getNumero(){
        return numero;
    }
    public int getNVotos(){
        return nVotos;
    }
    public Date getData(){
        return data;
    }
    public int getGenero(){
        return genero;
    }
    public int getSituacao(){
        return situacao;
    }
    public int getFederacao(){
        return federacao;
    }
    public Partido getPartido(){
        return partido;
    }
}