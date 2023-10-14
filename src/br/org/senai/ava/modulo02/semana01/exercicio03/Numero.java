package br.org.senai.ava.modulo02.semana01.exercicio03;

public class Numero {
    private Integer numero;

    public Numero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public int restoDivisao(){
        int resto = numero%2;
        return resto;
    }
    public String ePar(){
        if (restoDivisao() == 0) {
            return "O número " + numero + " é um número Par.";
        } else {
            return "O número " + numero + " Não é par. É impar.";
        }
    }
}
