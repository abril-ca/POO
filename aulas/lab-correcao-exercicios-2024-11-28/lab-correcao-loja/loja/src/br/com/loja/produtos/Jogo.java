package br.com.loja.produtos;

public class Jogo extends Produto {
    private int idadeMinima=0;
    
    public Jogo(String nome, double preco, int idadeMinima)
    {
        super(nome, preco);
        this.idadeMinima=idadeMinima;
    }
    public int getIdadeMinima()
    {
        return this.idadeMinima;
    }

    @Override
    public String toString()
    {
        return super.toString()+" idade mínima="+this.idadeMinima;
    }

}
