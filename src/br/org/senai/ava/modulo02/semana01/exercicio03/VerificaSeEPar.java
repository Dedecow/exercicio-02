package br.org.senai.ava.modulo02.semana01.exercicio03;

import java.util.Scanner;

public class VerificaSeEPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer numeroDigitado = Integer.parseInt(sc.nextLine());
        Numero numero = new Numero(numeroDigitado);

        String verificaNumeroPar = numero.ePar();
        System.out.println(verificaNumeroPar);
    }
}
