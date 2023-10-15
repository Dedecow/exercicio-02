package br.org.senai.ava.modulo02.semana01.exercicio05;

public class MediaFinal {
    private Float nota1;
    private Float nota2;
    private Float nota3;

    public MediaFinal(Float nota1, Float nota2, Float nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Float getNota1() {
        return nota1;
    }

    public void setNota1(Float nota1) {
        this.nota1 = nota1;
    }

    public Float getNota2() {
        return nota2;
    }

    public void setNota2(Float nota2) {
        this.nota2 = nota2;
    }

    public Float getNota3() {
        return nota3;
    }

    public void setNota3(Float nota3) {
        this.nota3 = nota3;
    }
    public Float calculaMediaFinal(){
        Float media = (nota1 + nota2 + nota3)/3;
        return media;
    }

}
