package br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05;

public class Personagem {
    private String nome;
    private int chakra;
    private int sagacidadeInteligencia;
    private int habilidadeDeCombate;
    private int forcaFisica;
    private int velocidade;
    private int resistencia;
    private int experienciaDeBatalha;

    public Personagem () { };

    public String getNome() {
        return nome;
    }

    public int getChakra() {
        return chakra;
    }

    public int getSagacidadeInteligencia() {
        return sagacidadeInteligencia;
    }

    public int getHabilidadeDeCombate() {
        return habilidadeDeCombate;
    }

    public int getForcaFisica() {
        return forcaFisica;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getExperienciaDeBatalha() {
        return experienciaDeBatalha;
    }

    public Personagem(String nome, int chakra, int sagacidadeInteligencia, int habilidadeDeCombate, int forcaFisica, int velocidade, int resistencia, int experienciaDeBatalha) {
        this.nome = nome;

        int somaAtributos = chakra + sagacidadeInteligencia + habilidadeDeCombate + forcaFisica + velocidade + resistencia + experienciaDeBatalha;
        if ( somaAtributos <= 50) {
            this.chakra = chakra;
            this.sagacidadeInteligencia = sagacidadeInteligencia;
            this.habilidadeDeCombate = habilidadeDeCombate;
            this.forcaFisica = forcaFisica;
            this.velocidade = velocidade;
            this.resistencia = resistencia;
            this.experienciaDeBatalha = experienciaDeBatalha;
        }else {
            throw new ValorAtributosException(" A soma dos atributos não pode ultrapassar 50.");
        }

    }

    protected void setAtributos(String nome, int chakra, int sagacidadeInteligencia, int habilidadeDeCombate, int forcaFisica, int velocidade, int resistencia, int experienciaDeBatalha) {
    }
}