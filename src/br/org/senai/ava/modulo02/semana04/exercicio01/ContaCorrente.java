package br.org.senai.ava.modulo02.semana04.exercicio01;

public class ContaCorrente extends Conta {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }
    @Override
    public void depositar (double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Acatamos o depósito de R$" + valor + " , que já pode ser consultado em seu saldo.");
        }else {
            System.out.println("Apenas é possível acatar valores positivos para depósitos.");
        }
    }
    @Override
    public void sacar(double valor ){
        if ( valor > 0 && valor <= this.saldo ){
            this.saldo -= valor;
            System.out.println("Acatamos o saque de R$" + valor + " seu saldo foi atualizado.");
        }else {
            System.out.println(" Entendemos sua solicitação de saque, porém não pode ser atendida pois o saldo é insuficiente ou o valor digitado é inválido para saque.");
        }
    }
}
