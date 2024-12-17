package br.com.loja.produtos;
public class App {
    public static void main(String[] args) throws Exception {
        Livro l = new Livro("Dom Casmurro", 20.00, "Machado de Assis");
        Jogo j = new Jogo("Uno", 30.0, 8);
        Produto[] produtos = new Produto[2];
        produtos[0] = l;
        produtos[1] = j;
        for(Produto p : produtos)
        {
            System.out.println(p);
        }
    }
}
