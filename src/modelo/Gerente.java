package modelo;

public class Gerente extends Funcionario {

    private int senha;
    private int numFuncGerenciados;

    @Override
    public double getBonificacao() {
        return this.salario * 0.15;
    }

    @Override
    public String getNome() {
        return this.nome + " (gerente)";
    }
    
    public static void imprimirNome() {
        double resultado = 2 + 2;
        System.out.println("Método estático "+resultado);
        //System.out.println(this.nome);
    }
    
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumFuncGerenciados() {
        return numFuncGerenciados;
    }

    public void setNumFuncGerenciados(int numFuncGerenciados) {
        this.numFuncGerenciados = numFuncGerenciados;
    }

}
