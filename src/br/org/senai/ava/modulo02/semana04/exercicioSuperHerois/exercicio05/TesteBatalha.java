package br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05;

import br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05.Heroi;
import br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05.Vilao;
import br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05.ValorAtributosException;

import java.util.Scanner;

public class TesteBatalha {
    public static void main(String[] args) {
        try {

            String nomeHeroi = "Naruto Uzumaki";
            int chakraHeroi = 3;
            int sagacidadeInteligenciaHeroi = 3;
            int habilidadeDeCombateHeroi = 3;
            int forcaFisicaHeroi = 3;
            int velocidadeHeroi = 3;
            int resistenciaHeroi = 3;
            int experienciaDeBatalhaHeroi = 3;
            String habilidadeHeroiNome = "Modo Sábio dos Seis Caminhos";
            int habilidadeHeroiValor = 3;

            Heroi heroi = new Heroi(nomeHeroi, chakraHeroi, sagacidadeInteligenciaHeroi, habilidadeDeCombateHeroi, forcaFisicaHeroi, velocidadeHeroi, resistenciaHeroi, experienciaDeBatalhaHeroi, habilidadeHeroiNome, habilidadeHeroiValor);
            heroi.definirAtributosDoHeroi("Naruto Uzumaki", "Modo Sábio dos Seis Caminhos");

            String nomeVilao = "Exemplo Vilão";
            int chakraVilao = 2;
            int sagacidadeInteligenciaVilao = 2;
            int habilidadeDeCombateVilao = 2;
            int forcaFisicaVilao = 2;
            int velocidadeVilao = 2;
            int resistenciaVilao = 2;
            int experienciaDeBatalhaVilao = 2;
            String habilidadeVilaoNome = "Habilidade Vilão";
            int habilidadeVilaoValor = 2;

            Vilao vilao = new Vilao(nomeVilao, chakraVilao, sagacidadeInteligenciaVilao, habilidadeDeCombateVilao, forcaFisicaVilao, velocidadeVilao, resistenciaVilao, experienciaDeBatalhaVilao, habilidadeVilaoNome, habilidadeVilaoValor);



            System.out.println("Personagens:");
            heroi.apresentar();
            vilao.apresentar();
        } catch (ValorAtributosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
