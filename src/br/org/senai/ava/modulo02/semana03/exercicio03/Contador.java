package br.org.senai.ava.modulo02.semana03.exercicio03;

import java.util.StringTokenizer;

public class Contador {
    public static void contarPalavras( String frase){
        StringTokenizer tokenizer = new StringTokenizer(frase);
        int numPalavras = tokenizer.countTokens();
        System.out.println( " Numero de palavras da frase: " + numPalavras);
    }
}
