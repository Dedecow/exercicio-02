package br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05;

public abstract class Personagem {
    private String nome;
    private String superpoder;

    public Personagem () { };

    public Personagem(String nome, String superpoder) {
        this.nome = nome;
        this.superpoder = superpoder;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

}