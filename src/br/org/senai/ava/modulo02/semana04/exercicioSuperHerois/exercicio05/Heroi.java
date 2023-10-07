package br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05;

import java.util.Random;
import java.util.Scanner;

public class Heroi extends Personagem {
    private String habilidadeHeroiNome;
    private int habilidadeHeroiValor;

    public Heroi( ) { };

    public void definirAtributosDoHeroi(String nome, int chakra, int sagacidadeInteligencia, int habilidadeDeCombate, int forcaFisica, int velocidade, int resistencia, String habilidadeHeroiNome) {
        super.setAtributos(nome, chakra, sagacidadeInteligencia, habilidadeDeCombate, forcaFisica, velocidade, resistencia, 0);
        this.habilidadeHeroiNome = habilidadeHeroiNome;
        this.habilidadeHeroiValor = Heroi.getHabilidadeHeroiValor();
    }

    public void definirAtributosDoHeroi() {
        Scanner scanner = new Scanner(System.in);

        String nome = "Naruto Uzumaki";
        int chakra = 12;
        int sagacidadeInteligencia = 5;
        int habilidadeDeCombate = 10;
        int forcaFisica = 8;
        int velocidade = 9;
        int resistencia = 8;
        int experienciaDeBatalha = 0;
        scanner.nextLine(); // Limpa a quebra de linha pendente
        String habilidadeHeroiNome = "Modo Sábio dos Seis Caminhos";


        super.setAtributos(nome, chakra, sagacidadeInteligencia, habilidadeDeCombate, forcaFisica, velocidade, resistencia, experienciaDeBatalha);

        this.habilidadeHeroiNome = habilidadeHeroiNome;
        this.habilidadeHeroiValor = Heroi.getHabilidadeHeroiValor();
    }


    public String getHabilidadeHeroiNome() {
        return habilidadeHeroiNome;
    }

    public static int getHabilidadeHeroiValor() {
        Random rd = new Random();
        return rd.nextInt(3) + 17;
    }


    public void apresentar( ){
        System.out.println("Heroi:");
        System.out.println("Nome: " + getNome());
        System.out.println("Atributos:");
        System.out.println("Chakra: " + getChakra());
        System.out.println("Sagacidade/Inteligência: " + getSagacidadeInteligencia());
        System.out.println("Habilidade de Combate: " + getHabilidadeDeCombate());
        System.out.println("Força Física: " + getForcaFisica());
        System.out.println("Velocidade: " + getVelocidade());
        System.out.println("Resistência: " + getResistencia());
        System.out.println(" Experiencia de Batalha: " + getExperienciaDeBatalha());
        System.out.println( "Pela justiça e pela paz! " + getHabilidadeHeroiNome() + "(" +getHabilidadeHeroiValor() + ")");
    }

    public void definirAtributosDoHeroi(String naruto_uzumaki, String modo_sábio_dos_seis_caminhos) {
    }
}
