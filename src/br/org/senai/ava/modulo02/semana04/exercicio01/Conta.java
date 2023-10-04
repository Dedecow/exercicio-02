package br.org.senai.ava.modulo02.semana04.exercicio01;

public abstract class Conta implements Operavel {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    protected double ObterSaldoAtual(){
        return this.saldo;
    }
}
