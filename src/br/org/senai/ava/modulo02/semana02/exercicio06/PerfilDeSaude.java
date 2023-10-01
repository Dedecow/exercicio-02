package br.org.senai.ava.modulo02.semana02.exercicio06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class PerfilDeSaude {
    private String nome;
    private String sobrenome;
    private char sexo;
    private LocalDate dataDeNascimento;
    private Float altura;
    private Float peso;

    public PerfilDeSaude () { };

    public PerfilDeSaude(String nome, String sobrenome, char sexo, LocalDate dataDeNascimento, Float altura, Float peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
        this.peso = peso;
    }


    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public char getSexo() {
        return sexo;
    }

    public LocalDate getDataDeNascimento() {
       // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
       // return LocalDate.parse(dataDeNascimento.format(formatter));
        return dataDeNascimento;
    }


    public Float getAltura() {
        return altura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
    public FrequenciaCardiaca criarFrequenciaCardiaca() {
        FrequenciaCardiaca frequenciaCardiaca = new FrequenciaCardiaca();
        return frequenciaCardiaca;
    }

    public Float calcularFrequenciaCardiacaMax(){
        Float idade = Float.valueOf(calcularIdade());
        return Float.valueOf((220 - idade));
    }
    public String calcularFrequenciaCardiacaAlvo(){
        Float frequenciaMaxima = calcularFrequenciaCardiacaMax();
        double alvoMinimo = (frequenciaMaxima * 0.5);
        double alvoMaximo = (frequenciaMaxima * 0.85);
        return alvoMinimo + " - " + alvoMaximo;
    }

    public int calcularIdade() {
        return CalcularIdade.calcularIdade(dataDeNascimento);
    }

    public Float calcularImc() {
        Float imc = peso / ( altura * altura);
        return imc ; }


}
