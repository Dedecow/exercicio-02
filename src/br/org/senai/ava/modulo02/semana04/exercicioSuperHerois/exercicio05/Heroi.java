package br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05;

import java.util.Random;
import java.util.Scanner;

public class Heroi extends Personagem {
    private String habilidadeHeroiNome;
    private int habilidadeHeroiValor;

    public Heroi( ) { };
    public void definirAtributosDoHeroi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do herói:");
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

        System.out.println("Digite o nome da habilidade do herói:");
        scanner.nextLine(); // Limpa a quebra de linha pendente
        String habilidadeHeroiNome = scanner.nextLine();

        scanner.close();

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

}
