package br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05;

import br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05.Heroi;
import br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05.Vilao;
import br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05.ValorAtributosException;

import java.util.Scanner;

public class TesteBatalha {
    public static void main(String[] args) {
        try {

            Heroi heroi = new Heroi();

            Vilao vilao = new Vilao();

            System.out.println("Personagens:");
            heroi.apresentar();
            vilao.apresentar();
        } catch (ValorAtributosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
