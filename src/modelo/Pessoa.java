package modelo;

abstract class Pessoa implements PessoaInterface {

    protected String nome;
    protected String endereco;
    protected String bairro;
    protected String cpf;
    
    

    @Override
    public String enderecoCompleto() {
        String enderecoCompleto = endereco + " " + bairro;
        return enderecoCompleto;
    }

    @Override
    public String cpfFormatado() {
        
        String cpfFormatado = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
        
        return cpfFormatado;
    }

    @Override
    public String nomeMaiusculo() {
        String nomeMaiusculo = this.nome.toUpperCase();
        nomeMaiusculo = nomeMaiusculo.trim();
        return nomeMaiusculo;
    }

    @Override
    public String nomeMinusculo() {
        String nomeMinusculo = this.nome.toLowerCase();
        nomeMinusculo = this.nome.toLowerCase();
        return nomeMinusculo;
    }

}
