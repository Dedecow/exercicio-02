package br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05;

import java.util.Random;
import java.util.Scanner;

public class Vilao extends Personagem {
    private String habilidadeVilaoNome;
    private int habilidadeVilaoValor;

    public Vilao() { };

    public Vilao(String nome, int chakra, int sagacidadeInteligencia, int habilidadeDeCombate, int forcaFisica, int velocidade, int resistencia, int experienciaDeBatalha, String habilidadeVilaoNome, int habilidadeVilaoValor) {
        super(nome, chakra, sagacidadeInteligencia, habilidadeDeCombate, forcaFisica, velocidade, resistencia, experienciaDeBatalha);
        this.habilidadeVilaoNome = habilidadeVilaoNome;
        this.habilidadeVilaoValor = habilidadeVilaoValor;
    }

    public void definirAtributosDoVilao(String nome, int chakra, int sagacidadeInteligencia, int habilidadeDeCombate, int forcaFisica, int velocidade, int resistencia, String habilidadeVilaoNome) {
        super.setAtributos(nome, chakra, sagacidadeInteligencia, habilidadeDeCombate, forcaFisica, velocidade, resistencia, 0);
        this.habilidadeVilaoNome = habilidadeVilaoNome;
        this.habilidadeVilaoValor = Vilao.getHabilidadeVilaoValor();
    }

    public void definirAtributosDoVilao() {
        Scanner scanner = new Scanner(System.in);

        String nome = "Sasuke Uchiha";
        int chakra = 12;
        int sagacidadeInteligencia = 5;
        int habilidadeDeCombate = 10;
        int forcaFisica = 8;
        int velocidade = 9;
        int resistencia = 8;
        int experienciaDeBatalha = 0;
        scanner.nextLine(); // Limpa a quebra de linha pendente
        String habilidadeVilaoNome = "Maldição do Ódio";

        super.setAtributos(nome, chakra, sagacidadeInteligencia, habilidadeDeCombate, forcaFisica, velocidade, resistencia, experienciaDeBatalha);

        this.habilidadeVilaoNome = habilidadeVilaoNome;
        this.habilidadeVilaoValor = Vilao.getHabilidadeVilaoValor();
    }


    public String getHabilidadeVilaoNome() {
        return habilidadeVilaoNome;
    }

    public static int getHabilidadeVilaoValor() {
        Random rd = new Random();
        return rd.nextInt(9) + 12; // Gera números entre 12 e 20 (inclusive).
    }

    public void apresentar(){
        System.out.println("Vilão:");
        System.out.println("Nome: " + getNome());
        System.out.println("Atributos:");
        System.out.println("Chakra: " + getChakra());
        System.out.println("Sagacidade/Inteligência: " + getSagacidadeInteligencia());
        System.out.println("Habilidade de Combate: " + getHabilidadeDeCombate());
        System.out.println("Força Física: " + getForcaFisica());
        System.out.println("Velocidade: " + getVelocidade());
        System.out.println("Resistência: " + getResistencia());
        System.out.println(" Experiencia de Batalha: " +getExperienciaDeBatalha());
        System.out.println( " Este é o meu poder supremo! " +getHabilidadeVilaoNome() + "(" + getHabilidadeVilaoValor() + ")" );
    }


    public void definirAtributosDoVilao(String sasuke_uchiha, String mangekyou_sharingan) {
    }
}
