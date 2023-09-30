package br.org.senai.ava.modulo02.semana03.exercicio04;

public class Principal {
    public static void main(String[] args) {
        Contador2 contador = new Contador2("Esta é uma frase de exemplo.");
        int quantidadePalavras = contador.contarPalavras();
        System.out.println("Quantidade de palavras é: "+quantidadePalavras);
    }
}
