package br.org.senai.ava.modulo02.semana01.exercicio06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteIdadeEleitoral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " Digite sua data de Nascimento: ");
        String dataDigitada = sc.nextLine();
        LocalDate dataDeNascimentoFormatada = LocalDate.parse(dataDigitada, DateTimeFormatter.ofPattern("dd/MM/yyy"));
        Idade idade = new Idade(dataDeNascimentoFormatada);
        System.out.println( " Sua idade é " + idade.calculaIdade());
        System.out.println("Com relação ao voto, sua situação é: " + idade.podevotar());
    }
}
