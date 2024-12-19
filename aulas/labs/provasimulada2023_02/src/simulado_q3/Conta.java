package simulado_q3;

public class Conta {
    private String nomeCliente;
    private double saldo;

    public Conta (String nomeCliente, double saldoInicial){
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }

    public double getSaldo(){
        return saldo;
    }
}
