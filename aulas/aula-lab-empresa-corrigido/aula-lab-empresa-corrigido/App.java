/**
 * Atividade no laboratório:
 * 
 * Crie classes Empresa, Departamento, Funcionario,
 * FuncionarioTempoIntegral e FuncionarioTempoParcial compatíveis com a classe
 * App fornecida.
 * 
 */

public class App {
    public static void main(String[] args) {

        Empresa cocaCola = new Empresa("Coca-Cola");

        Departamento rh = new Departamento("RH", cocaCola);
        Departamento vendas = new Departamento("Vendas", cocaCola);

        Funcionario maria = new FuncionarioTempoIntegral("Maria", 12000.0f, rh);
        Funcionario pedro = new FuncionarioTempoIntegral("Pedro", 9000.0f, rh);
        FuncionarioTempoParcial joao = new FuncionarioTempoParcial("João", 10000.0f, rh);
        // podemos alterar horas semanais apenas funcionários em tempo parcial
        joao.setNumeroHorasSemanais(30);

        for (Departamento d : cocaCola.getDepartamentos()) {
            System.out.println("Departamento: "+d.getNome());
            System.out.printf("Média salarial: R$ %.2f\n",d.getMediaSalarial());
            System.out.println("Funcionários:");
            for (Funcionario f : d.getFuncionarios()) {
                System.out.println(f);
            }
        }

        // navegando na direção de funcionário para departamento, para empresa

        // em que departamento Maria trabalha?
        System.out.println("Maria trabalha no departamento: "+maria.getDepartamento().getNome());

        // em que empresa Maria trabalha?
        System.out.println("Maria trabalha na empresa: "+maria.getDepartamento().getEmpresa());

        rh.transfereFuncionario(maria, vendas);
        // ou alternativamente com o mesmo efeito:
        // maria.setDepartamento(vendas);

        // em que departamento Maria trabalha?
        System.out.println("Maria trabalha no departamento: "+maria.getDepartamento().getNome());
    }
}
