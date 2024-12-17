public class Conta {
    private double saldo;
    
    public double getTaxaSaque()
    {
        return 0.005;
    }

    public void depositar(double valor)
    {
        this.saldo+=valor;
    }

    public void sacar(double valor)
    {
        this.saldo-=valor*(1.0+this.getTaxaSaque());
    }

    public double getSaldo()
    {
        return this.saldo;
    }

}
