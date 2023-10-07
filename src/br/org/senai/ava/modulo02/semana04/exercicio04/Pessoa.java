package br.org.senai.ava.modulo02.semana04.exercicio04;

public class Pessoa {
    private int idade;
    private String nome;

    public Pessoa () { };

    public Pessoa(int idade, String nome) {
        this.nome = nome;
        if ( idade >= 0) {
            this.idade = idade;
        } else {
            throw new IdadeNegativaException();
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if ( idade >= 0) {
            this.idade = idade;
        } else {
            throw new IdadeNegativaException();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
