package br.org.senai.ava.modulo02.semana01.exercicio06;

import br.org.senai.ava.modulo02.semana01.exercicio06.IdadeCalculada;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteIdadeCalculada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a data de nascimento (no formato dd/MM/yyyy):");
        String dataNascimento = sc.nextLine();
        LocalDate dataDeNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        IdadeCalculada idadeCalculada = new IdadeCalculada(dataDeNascimento);
        int idade = idadeCalculada.calcularIdade();
        System.out.println("Idade: " + idade + " anos");
    }
}
