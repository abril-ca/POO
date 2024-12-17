public class App {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.depositar(1000);
        c1.sacar(100);
        System.out.printf("Saldo da conta comum R$ %.02f\n",c1.getSaldo());

        Conta c2 = new ContaEspecial();
        c2.depositar(1000);
        c2.sacar(100);
        System.out.printf("Saldo da conta especial R$ %.02f\n",c2.getSaldo());

    }
}
