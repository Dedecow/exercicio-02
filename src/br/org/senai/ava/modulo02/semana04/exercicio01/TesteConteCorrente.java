package br.org.senai.ava.modulo02.semana04.exercicio01;

public class TesteConteCorrente {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(10_000.0);
        System.out.printf("Saldo atual: R$%.2f%n", contaCorrente.ObterSaldoAtual());

        contaCorrente.depositar(0.02);
        System.out.printf("Saldo após depósito: R$%.2f%n", contaCorrente.ObterSaldoAtual());

        contaCorrente.sacar(70.05);
        System.out.printf("Saldo após saque: R$%.2f%n", contaCorrente.ObterSaldoAtual());

        // Testando saque com valor inválido
        contaCorrente.sacar(-100.0);

        // Testando depósito com valor inválido
        contaCorrente.depositar(-50.0);

        // Testando saque com saldo insuficiente
        contaCorrente.sacar(100_000.0);
        System.out.printf("Saldo final: R$%.2f%n", contaCorrente.ObterSaldoAtual());

        contaCorrente.depositar(1000.0);
        System.out.printf("Saldo após novo depósito: R$%.2f%n", contaCorrente.ObterSaldoAtual());
    }
}
