package br.org.senai.ava.modulo02.semana01.exercicio01;

import java.util.Scanner;

public class TesteNomeCompleto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println( "Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println( "Digite seu sobrenme: ");
        String sobrenome = sc.nextLine();

        NomeDoUsuario nomeDoUsuario = new NomeDoUsuario(nome, sobrenome);

        System.out.println(" Nome Completo " + nomeDoUsuario.nomeCompleto());

    }
}
