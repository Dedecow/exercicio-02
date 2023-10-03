package br.org.senai.ava.modulo02.semana03.exercicio01;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(79847846553L, "Andre Silveira", 20000.00F );
        System.out.println( "Nome Completo: " + funcionario.getNomeCompleto());
        System.out.println( " CPF: " + funcionario.getCpf());
        System.out.println( " Salário: " + funcionario.getSalario());

        funcionario.setSalario(19_500.00f);
        System.out.println( " Salário: " + funcionario.getSalario());
        funcionario.setSalario(-1.00f);
        System.out.println( " Salário: " + funcionario.getSalario());

        funcionario.promover(5f);
        System.out.println( " Salário: " + funcionario.getSalario());
    }
}
