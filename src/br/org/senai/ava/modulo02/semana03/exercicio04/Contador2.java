package br.org.senai.ava.modulo02.semana03.exercicio04;
import java.util.StringTokenizer;

public class Contador2 {
    private String frase;

    public Contador2(String frase) {
        this.frase = frase;
    }

    public int contarPalavras(){
        StringTokenizer tokenizer = new StringTokenizer(frase);
        return tokenizer.countTokens();
    }
}

