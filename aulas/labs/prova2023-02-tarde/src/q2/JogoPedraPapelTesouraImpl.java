package q2;

import java.util.Random;

enum Jogada {
	PEDRA, PAPEL, TESOURA;
}

public class JogoPedraPapelTesouraImpl implements JogoPedraPapelTesoura{
    private int vencedor;
    private Jogada jogada1;
    private Jogada jogada2;

    public JogoPedraPapelTesouraImpl()
    {
        jogada1 = sorteiaJogada();
        jogada2 = sorteiaJogada();

        if( (jogada1 == Jogada.PEDRA && jogada2 == Jogada.TESOURA) || 
            (jogada1 == Jogada.PAPEL && jogada2 == Jogada.PEDRA) ||
            (jogada1 == Jogada.TESOURA && jogada2 == Jogada.PAPEL))
        {
            vencedor = 1;
        }

        else if (jogada1 == jogada2)
        {
            vencedor = 0;
        }

        else
        {
            vencedor = 2;
        }
    }

    private Jogada sorteiaJogada(){
        Random r = new Random();
        int n = r.nextInt(3);
        if (n == 0){
            return Jogada.PEDRA;
        }
        else if (n==1){
            return Jogada.PAPEL;
        }
        return Jogada.TESOURA;
    }

    public boolean haVencedor()
    {
        if (vencedor == 0){
            return false;
        }
        return true;
    }

	public Jogada jogadaJogador1()
    {
        return jogada1;
    }

	public Jogada jogadaJogador2()
    {
        return jogada2;
    }

	public int getJogadorVencedor()
    {
        return vencedor;
    }
}
