package br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05;

import java.util.Random;
import java.util.Scanner;

public class Vilao extends Personagem {
    private String habilidadeVilaoNome;
    private int habilidadeVilaoValor;

    public Vilao() { };

    public void definirAtributosDoVilao() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do vilão:");
        String nome = scanner.nextLine();

        System.out.println("Digite o valor de Chakra:");
        int chakra = scanner.nextInt();

        System.out.println("Digite o valor de Sagacidade/Inteligência:");
        int sagacidadeInteligencia = scanner.nextInt();

        System.out.println("Digite o valor de Habilidade de Combate:");
        int habilidadeDeCombate = scanner.nextInt();

        System.out.println("Digite o valor de Força Física:");
        int forcaFisica = scanner.nextInt();

        System.out.println("Digite o valor de Velocidade:");
        int velocidade = scanner.nextInt();

        System.out.println("Digite o valor de Resistência:");
        int resistencia = scanner.nextInt();

        System.out.println("Digite o valor de Experiência de Batalha:");
        int experienciaDeBatalha = scanner.nextInt();

        System.out.println("Digite o nome da habilidade do vilão:");
        scanner.nextLine(); // Limpa a quebra de linha pendente
        String habilidadeVilaoNome = scanner.nextLine();

        scanner.close();

        // Chame o construtor da classe base para configurar os atributos herdados.
        super.setAtributos(nome, chakra, sagacidadeInteligencia, habilidadeDeCombate, forcaFisica, velocidade, resistencia, experienciaDeBatalha);

        // Configure os atributos específicos do vilão.
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



}
