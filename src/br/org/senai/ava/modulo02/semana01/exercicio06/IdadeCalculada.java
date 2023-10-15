package br.org.senai.ava.modulo02.semana01.exercicio06;

import java.time.LocalDate;
import java.time.Period;

public class IdadeCalculada {
    private LocalDate dataDeNascimento;

    public IdadeCalculada(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        Period period = Period.between(dataDeNascimento, dataAtual);
        return period.getYears();
    }
}
