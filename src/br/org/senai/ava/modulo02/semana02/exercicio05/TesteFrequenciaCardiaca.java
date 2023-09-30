package br.org.senai.ava.modulo02.semana02.exercicio05;

import java.time.LocalDate;

public class TesteFrequenciaCardiaca {
    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.parse("1990-08-19");
        FrequenciaCardiaca frequenciaCardiaca = new FrequenciaCardiaca("Andre", "Silveira", dataNascimento);

        System.out.println("Nome: " + frequenciaCardiaca.getNome());
        System.out.println("Sobrenome: " + frequenciaCardiaca.getSobrenome());
        System.out.println("Idade: " + frequenciaCardiaca.calcularIdade() + " anos");
        int frequenciaMaxima = frequenciaCardiaca.calcularFrequenciaMax();
        System.out.println("Frequência Cardíaca Máxima: " + frequenciaMaxima);

        String frequenciaAlvo = frequenciaCardiaca.calcularFrequenciaCardiacaAlvo();
        System.out.println("Frequência Cardíaca Alvo: " + frequenciaAlvo);
    }
}
