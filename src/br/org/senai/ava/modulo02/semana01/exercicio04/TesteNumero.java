package br.org.senai.ava.modulo02.semana01.exercicio04;

import java.util.Scanner;

public class TesteNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite um número entre 1 e 5");
        Integer numeroDigitado = Integer.parseInt(sc.nextLine());
        Numero numero= new Numero(numeroDigitado);

        do {
            System.out.println( " O número precisa ser entre 1 e 5");
            numeroDigitado = Integer.parseInt(sc.nextLine());

        }while (numeroDigitado>5||numeroDigitado<1);
        String resultado = numero.chuteNumero();
        System.out.println(resultado);
    }


}
