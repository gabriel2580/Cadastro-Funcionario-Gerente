package modelo;

public class Funcionario extends Pessoa {

    
    
    protected double salario;

    public double getBonificacao() {
        return this.salario * 0.10;
    }

    public double getBonificacao(double plus) {
        double bonificao = this.getBonificacao();
        return bonificao + plus;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
