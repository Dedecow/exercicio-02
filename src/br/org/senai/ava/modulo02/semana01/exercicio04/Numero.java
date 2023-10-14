package br.org.senai.ava.modulo02.semana01.exercicio04;

public class Numero {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String chuteNumero(){
        int numeroDigitado = numero;
        int numeroSorteado = (int) ((Math.random()*4)+1);
        if (numeroDigitado==numeroSorteado){
            return  "Você acertou!";
        }else {
            return "Você errou, o número correto era " + numeroSorteado;
        }
    }
}
