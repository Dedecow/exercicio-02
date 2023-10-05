package br.org.senai.ava.modulo02.semana04.exercicio02;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();

        System.out.println("Funcionário:");
        System.out.println("Cargo: " + funcionario.obterCargo());

        System.out.println("\nGerente:");
        System.out.println("Cargo: " + gerente.obterCargo());
    }
}
