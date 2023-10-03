package br.org.senai.ava.modulo02.semana03.exercicio02;

public class Funcionario {
    private String nome;
    private Float salario;

    public Funcionario () { };

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, Float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentar( Float aumento ){
        this.salario *= (1 + aumento/100);
    }

    public void aumentar( Float aumento, Float comissao){

        this.salario *= ((1 + aumento) * (1 + comissao));
    }
}
