
public class FuncionarioTempoIntegral extends Funcionario {

    public FuncionarioTempoIntegral(String nome, float salario,
    Departamento d)
    {
        super(nome,salario,d);
        
    }

    @Override
    public int getNumeroHorasSemanais()
    {
        return 40;
    }

}
