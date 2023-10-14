package br.org.senai.ava.modulo02.semana04.exercicioSuperHerois.exercicio05;

import java.util.Random;
import java.util.Scanner;

public class Heroi extends Personagem {
    private String nomeVidaReal;

    public Heroi(String nome, String superpoder, String nomeVidaReal) {
        super(nome, superpoder);
        this.nomeVidaReal = nomeVidaReal;
    }

    public String getNomeVidaReal() {
        return nomeVidaReal;
    }

    public void setNomeVidaReal(String nomeVidaReal) {
        this.nomeVidaReal = nomeVidaReal;
    }

    public void apresentarHeroi(){
        System.out.println( " Heroi: ");
        System.out.println( " Nome: " + getNome());
        System.out.println( " Superpoder: " + getSuperpoder());
        System.out.println( " Nome na vida real: " + getNomeVidaReal());

    }
}
