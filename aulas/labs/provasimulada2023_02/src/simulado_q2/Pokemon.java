package simulado_q2;

import java.util.Random;

public class Pokemon {
    int pontosVitalidade, ataqueMenor, ataqueMaior, vitalidadeInicial;

    public Pokemon(int pontosVitalidade, int ataqueMenor, int ataqueMaior) {
        this.pontosVitalidade = pontosVitalidade;
        this.vitalidadeInicial = pontosVitalidade;
        this.ataqueMaior = ataqueMaior;
        this.ataqueMenor = ataqueMenor;
    }

    public int getPontosVitalidade(){
        return pontosVitalidade;
    }

    public int getAtaqueMenor(){
        return ataqueMenor;
    }
    
    public int getAtaqueMaior(){

        return ataqueMaior;
    }

    public void sofreDano(int dano){
        this.pontosVitalidade -= dano;
    }

    private boolean EhAtaqueMaior(){
        Random r = new Random();
        return r.nextBoolean();
    }

    public boolean atacar(Pokemon d)
    {
        int ataque = this.EhAtaqueMaior() ? this.getAtaqueMaior() : this.getAtaqueMenor();
        d.sofreDano(ataque);
        if(d.getPontosVitalidade() <= 0){
            d.pontosVitalidade = 0;
            return true;
        }
        return false;
    }

    public void regenera()
    {
        this.pontosVitalidade = this.vitalidadeInicial;
    }
}
