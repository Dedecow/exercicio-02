package br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05;

import br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05.Heroi;
import br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05.Vilao;
import br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05.ValorAtributosException;

import java.util.Scanner;

public class TesteBatalha {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println( " Digite um nome para o Heroi:");
            String nomeHeroi = "Naruto Uzumaki";
            int chakraHeroi = 12;
            int sagacidadeInteligenciaHeroi = 8;
            int habilidadeDeCombateHeroi = 5;
            int forcaFisicaHeroi = 6;
            int velocidadeHeroi = 5;
            int resistenciaHeroi = 7;
            int experienciaDeBatalhaHeroi = 7;
            String habilidadeHeroiNome = "Modo Sábio dos Seis Caminhos";
            int habilidadeHeroiValor = Heroi.getHabilidadeHeroiValor();

            Heroi heroi = new Heroi(nomeHeroi, chakraHeroi, sagacidadeInteligenciaHeroi, habilidadeDeCombateHeroi, forcaFisicaHeroi, velocidadeHeroi, resistenciaHeroi, experienciaDeBatalhaHeroi, habilidadeHeroiNome, habilidadeHeroiValor);
            heroi.definirAtributosDoHeroi("Naruto Uzumaki", "Modo Sábio dos Seis Caminhos");

            String nomeVilao = "Exemplo Vilão";
            int chakraVilao = 10;
            int sagacidadeInteligenciaVilao = 8;
            int habilidadeDeCombateVilao = 7;
            int forcaFisicaVilao = 6;
            int velocidadeVilao = 5;
            int resistenciaVilao = 7;
            int experienciaDeBatalhaVilao = 7;
            String habilidadeVilaoNome = "Habilidade Vilão";
            int habilidadeVilaoValor = Vilao.getHabilidadeVilaoValor();

            Vilao vilao = new Vilao(nomeVilao, chakraVilao, sagacidadeInteligenciaVilao, habilidadeDeCombateVilao, forcaFisicaVilao, velocidadeVilao, resistenciaVilao, experienciaDeBatalhaVilao, habilidadeVilaoNome, habilidadeVilaoValor);



            System.out.println("Personagens:");
            heroi.apresentar();
            vilao.apresentar();
        } catch (ValorAtributosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
