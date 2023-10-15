package br.org.senai.ava.modulo02.semana01.exercicio06;

import java.time.LocalDate;
import java.time.Period;

public class Idade {
    private LocalDate dataDeNascimento;

    public Idade(LocalDate dataDeNascimento) {
        if (dataDeNascimento == null){

        }else {
            this.dataDeNascimento = dataDeNascimento;
        }
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public int calculaIdade(){
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataDeNascimento, dataAtual);
        return periodo.getYears();
    }
    public String podevotar(){

        int idade = calculaIdade();

        if (idade < 16) {
            return "Voto não permitido.";
        } else if (idade == 16 || idade == 17 || idade > 59) {
            return "Voto opcional.";
        } else {
            return "Voto obrigatório.";
        }
    }
}
