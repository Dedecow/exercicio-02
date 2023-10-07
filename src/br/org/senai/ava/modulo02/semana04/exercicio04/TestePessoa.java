package br.org.senai.ava.modulo02.semana04.exercicio04;

import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println(" Olá Digite seu nome para começarmos o programa: ");
            String nome = sc.nextLine();
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            Pessoa pessoa = new Pessoa( idade , nome);
            System.out.println(" Voce tem " + pessoa.getIdade() + "anos de idade.");

        } catch (IdadeNegativaException e){
            System.out.println( " Erro:  " + e.getMessage());
        }
        sc.close();
    }
}
