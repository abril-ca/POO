package q1;

/**
 * Questão 1 (4 pontos).
 * 
 * Crie classes para representar dados sobre uma empresa com suas unidades organizacionais 
 * (departamentos estruturados em setores) e seus funcionários (lotados em setores). 
 * 
 * Siga o diagrama UML fornecido (diagrama-q1.png). (O diagrama mostra alguns atributos e 
 * algumas operações, mas não é exaustivo quanto aos atributos e operações. 
 * Adicione aqueles que foram necessários.)
 * 
 * Implemente funcionalidade nas suas classes para calcular o salário médio de uma 
 * unidade organizacional, assim como para consultar os funcionários nela lotados 
 * (direta ou indiretamente).
 * 
 * Atenção às indicações de navegabilidade e às cardinalidades.
 * 
 * Sua implementação deve permitir a transferência de um funcionário para outro setor.
 * 
 * Crie um testador para suas classes. 
 * 
 */


public class TestadorQ1 {

	public static void main(String[] args) {
		Empresa coca = new Empresa("Coca Cola");
		Departamento fanta = coca.createDepartamento("Fanta");
		Departamento zero = coca.createDepartamento("Coca Zero");
		Setor rhFanta = fanta.createSetor("RH");
		Setor vendasFanta = fanta.createSetor("Vendas");
		Setor rhZero = zero.createSetor("RH");
		Setor marketingZero = zero.createSetor("Marketing");
		Funcionario joao = new Funcionario("Joao", 15660.30);
		Funcionario leticia = new Funcionario("Leticia", 	40000.20);
		Funcionario abril = new Funcionario("Abril", 7860.88);
		rhFanta.addFuncionario(joao);
		vendasFanta.addFuncionario(leticia);
		rhZero.addFuncionario(abril);
		System.out.println("Antes de transferencias:");
		System.out.println(coca);

		abril.transferirSetores(marketingZero);
		joao.transferirSetores(vendasFanta);
		System.out.println("Depois de transferencias:");
		System.out.println(coca);
	}

}
