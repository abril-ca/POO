package simulado_q3;

import java.util.*;

public class Agencia {
    private String nome;
    private Map<String, Conta> contas = new HashMap<>();

    public Agencia(String nomeAgencia){
        this.nome = nomeAgencia;
    }

    public String getNome(){
        return nome;
    }

    public void adicionaConta(Conta conta) {
        this.contas.put(conta.getNomeCliente(), conta);
    }

    public double calculaSaldoMedio()
    {
        if (contas.isEmpty()){
            return 0.0;
        }
        double valorTotal = 0;
        for (Conta c : contas.values()){
            valorTotal += c.getSaldo();
        }
        return valorTotal / contas.size();
    }

    @Override
    public String toString(){
        return "Agencia: " + nome + ", saldo médio: " + calculaSaldoMedio() + "\n";
    }
}
