package br.org.senai.ava.modulo02.semana02.exercicio06;

public class FrequenciaCardiaca {
    private PerfilDeSaude perfilDeSaude;

    public FrequenciaCardiaca(PerfilDeSaude perfilDeSaude) {
        this.perfilDeSaude = perfilDeSaude;
    }

    public FrequenciaCardiaca() {
                this.perfilDeSaude = perfilDeSaude;
    }
    public int calcularFrequenciaCardiacaMaxima() {
        int idade = perfilDeSaude.calcularIdade();
        return 220 - idade;
    }

    public String calcularFrequenciaCardiacaAlvo() {
        int frequenciaMaxima = calcularFrequenciaCardiacaMaxima();
        int alvoMinimo = (int) (frequenciaMaxima * 0.5);
        int alvoMaximo = (int) (frequenciaMaxima * 0.85);
        return alvoMinimo + " - " + alvoMaximo;
    }
}
