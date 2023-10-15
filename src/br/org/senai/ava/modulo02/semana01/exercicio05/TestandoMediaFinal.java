package br.org.senai.ava.modulo02.semana01.exercicio05;

import java.util.Scanner;

public class TestandoMediaFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Para obter o valor da média digite a primeira nota: ");
        Float nota1 = Float.parseFloat(sc.nextLine());
        System.out.println(" Agora digite a segunda nota: ");
        Float nota2 = Float.parseFloat(sc.nextLine());
        System.out.println(" Enfim, digite a terceira nota: ");
        Float nota3 = Float.parseFloat(sc.nextLine());

        MediaFinal mediaFinal = new MediaFinal(nota1, nota2, nota3);
        System.out.printf("O valor da média final é %.2f pontos.", mediaFinal.calculaMediaFinal());



    }
}
