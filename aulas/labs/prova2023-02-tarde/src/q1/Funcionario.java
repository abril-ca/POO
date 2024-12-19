package q1;

public class Funcionario {
    private String nome;
    private double salario;
    private Setor setor;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public Setor getSetor(){
        return setor;
    }

    public void setSetor(Setor s){
        this.setor = s;
    }

    public void transferirSetores(Setor novoSetor){
        if(this.setor != null){
            this.setor.rmvFuncionario(this);
        }
        novoSetor.addFuncionario(this);
        this.setor = novoSetor;
    }
}
