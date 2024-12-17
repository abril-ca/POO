package br.com.loja.produtos;

public class Livro extends Produto {
    private String nomeAutor;
    
    public Livro(String nome, double preco, String nomeAutor)
    {
        super(nome, preco);
        this.nomeAutor=nomeAutor;
    }
    public String getNomeAutor()
    {
        return this.nomeAutor;
    }

    @Override
    public String toString()
    {
        return super.toString()+" autor="+getNomeAutor();
    }
}
