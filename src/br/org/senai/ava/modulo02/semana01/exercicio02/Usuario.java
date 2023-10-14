package br.org.senai.ava.modulo02.semana01.exercicio02;

public class Usuario {
    private Double altura;
    private Double peso;

    public Usuario(Double altura, Double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Double calculoIMC(){
        Double valorIMC = peso/(altura*altura);
        return valorIMC;
    }

}
