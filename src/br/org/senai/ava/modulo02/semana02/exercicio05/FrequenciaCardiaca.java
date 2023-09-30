package br.org.senai.ava.modulo02.semana02.exercicio05;

import java.time.LocalDate;

public class FrequenciaCardiaca {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    public FrequenciaCardiaca(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int calcularIdade() {
        return CalcularIdade.calcularIdade(dataNascimento);
    }
    public int calcularFrequenciaMax(){
        return 220 - CalcularIdade.calcularIdade(dataNascimento);
    }
    public String calcularFrequenciaCardiacaAlvo() {
        int frequenciaMaxima = calcularFrequenciaMax();
        int alvoMinimo = (int) (frequenciaMaxima * 0.5);
        int alvoMaximo = (int) (frequenciaMaxima * 0.85);
        return alvoMinimo + " - " + alvoMaximo;
    }
}
