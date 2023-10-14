package br.org.senai.ava.modulo02.semana01.exercicio02;

import java.util.Scanner;

public class TesteUsuarioIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite seu peso em kg: ");
        Double peso = Double.parseDouble(sc.nextLine());
        System.out.println(" Digite sua altura em metros: ");
        Double altura = Double.parseDouble(sc.nextLine());
        Usuario usuario = new Usuario(altura, peso);
        System.out.printf( "Seu peso é: %.2f e sua altura é: %.2f, seu IMC é: %.2f%n", usuario.getPeso(), usuario.getAltura(), usuario.calculoIMC());


    }
}
