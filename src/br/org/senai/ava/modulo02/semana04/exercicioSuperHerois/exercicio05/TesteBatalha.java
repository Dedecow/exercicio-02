package br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05;

import br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05.Heroi;
import br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05.Vilao;
import br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05.ValorAtributosException;

import java.util.Scanner;

public class TesteBatalha {
    public static void main(String[] args) {
        try {

            Heroi heroi = new Heroi();
            heroi.definirAtributosDoHeroi("Naruto Uzumaki", "Modo Sábio dos Seis Caminhos");

            Vilao vilao = new Vilao();
            vilao.definirAtributosDoVilao("Sasuke Uchiha", "Mangekyou Sharingan");



            System.out.println("Personagens:");
            heroi.apresentar();
            vilao.apresentar();
        } catch (ValorAtributosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
