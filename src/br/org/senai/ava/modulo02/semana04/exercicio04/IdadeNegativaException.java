package br.org.senai.ava.modulo02.semana04.exercicio04;

public class IdadeNegativaException extends RuntimeException {
    public IdadeNegativaException () {
        super( " A idade não pode ser um número negativo");
    }
}
