package javaapplication1;

import java.util.Random;
import modelo.Funcionario;
import modelo.Gerente;

public class JavaApplication1 {

    public static void main(String[] args) {
      
        //Cria o funcionário normal
        Funcionario f = new Funcionario();
        f.setNome("Márcio");
        f.setCpf("05446241523");
        f.setSalario(1000);
        
        //Cria um gerente
        Gerente g = new Gerente();
        g.setNome("    Daniel    ");
        g.setCpf("45869812310");
        g.setNumFuncGerenciados(10);
        
        System.out.println("Dados do funcionário:");
        System.out.println("Nome: "+f.getNome());
        System.out.println("CPF: "+f.getCpf());
        System.out.println(f.getBonificacao(100));
        System.out.println("----------");
        
        System.out.println("Dados do gerente:");
        System.out.println("Nome: "+g.getNome());
        System.out.println("CPF: "+g.getCpf());
        System.out.println("Número funcionários: "+g.getNumFuncGerenciados());
        System.out.println("Nome maiúsculo: "+g.nomeMaiusculo());
        
        Funcionario gerenteTeste = g;
        System.out.println("-------------------");
        System.out.println("Gerente teste");
        System.out.println(gerenteTeste.getNome());
        System.out.println(gerenteTeste.getCpf());
       
        
    }
    
}