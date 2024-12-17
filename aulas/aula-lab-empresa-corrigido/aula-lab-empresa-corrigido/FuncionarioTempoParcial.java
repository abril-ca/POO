
public class FuncionarioTempoParcial extends Funcionario {
    
    private int horasSemanais=20;

    public FuncionarioTempoParcial(String nome, float salario,
    Departamento d)
    {
        super(nome,salario,d);
    }

    public void setNumeroHorasSemanais(int horas) {
        this.horasSemanais=horas;
    }

    @Override
    public int getNumeroHorasSemanais()
    {
        return this.horasSemanais;
    }
}
