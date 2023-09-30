package br.org.senai.ava.modulo02.semana03.exercicio05;
import java.util.ArrayList;
import java.util.Arrays;

public class Concurso {
   private Integer numero;
   private int[] sorteados;

   public Concurso(){ }
   public Concurso(Integer numero, int[] sorteados) {
        this.numero = numero;
        this.sorteados = sorteados;
   }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public int[] getSorteados() {
        return sorteados;
    }

    public void setSorteados(int[] sorteados) {
        this.sorteados = sorteados;
    }
    @Override
    public String toString(){
       return "Concurso{" +
               "numero=" + numero +
               ", sorteados=" + Arrays.toString(sorteados) +
               '}';
    }
}
