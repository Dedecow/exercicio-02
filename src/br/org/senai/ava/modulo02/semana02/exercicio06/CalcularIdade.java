package br.org.senai.ava.modulo02.semana02.exercicio06;

import java.time.LocalDate;
import java.time.Period;

public class CalcularIdade {
    public static int calcularIdade(LocalDate dataDeNascimento){
        LocalDate dataAtual = LocalDate.now();
        int anoNascimento = dataDeNascimento.getYear();
        int mesNascimento = dataDeNascimento.getMonthValue();
        int diaNascimento = dataDeNascimento.getDayOfMonth();

        int anoAtual = dataAtual.getYear();
        int mesAtual = dataAtual.getMonthValue();
        int diaAtual = dataAtual.getDayOfMonth();

        int idade = anoAtual - anoNascimento;

        if (mesAtual < mesNascimento || ( (mesAtual == mesNascimento) && (diaAtual < diaNascimento))){
            idade--;
        }
        return idade;
    }
}
