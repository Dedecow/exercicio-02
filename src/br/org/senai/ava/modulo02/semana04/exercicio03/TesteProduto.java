package br.org.senai.ava.modulo02.semana04.exercicio03;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto( "celular", 1500.0, 17.0);

        System.out.println("Informações do Produto:");
        System.out.println(produto);

        double valorComImposto = produto.calcularValorImposto();
        System.out.printf( " Valor com Imposto: R$ %.2f%n ", valorComImposto);


    }
}
