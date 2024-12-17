package br.com.loja.produtos;

public abstract class Produto
{   
    private String nome;
    private double preco;

    public Produto(String nome, double preco)
    {
        this.nome=nome;
        this.preco=preco;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString()
    {
        return this.getNome()+" R$ "+this.getPreco();
    }
}
