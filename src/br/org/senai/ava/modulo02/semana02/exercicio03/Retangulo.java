package br.org.senai.ava.modulo02.semana02.exercicio03;

public class Retangulo {
    float comprimento = 1f;
    float largura = 1f;

    public Retangulo(float comprimento, float largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public float area() {
        if ( (comprimento >= 0.0f && largura >= 0.0f) && (comprimento <= 20.0f && largura <= 20.0f)) {
            float area = comprimento * largura;
            return area;
        } else {
            System.out.println("Comprimento e largura precisam estar entre 0,00 u.m. e 20,00 u.m.");
            return 0.0f;
        }
    }

    public float perimetro() {
        if ( (comprimento >= 0.0f && largura >= 0.0f) && (comprimento <= 20.0f && largura <= 20.0f)) {
            float perimetro = (comprimento + largura) * 2;
            return perimetro;
        } else {
            System.out.println("Comprimento e largura precisam estar entre 0,00 u.m. e 20,00 u.m.");
            return 0.0f;
        }
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        if (comprimento >= 0.0f && comprimento <= 20.0f) {
            this.comprimento = comprimento;
        } else {
            System.out.println("Comprimento fora do intervalo permitido.");
        }
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        if (largura >= 0.0f && largura <= 20.0f) {
            this.largura = largura;
        } else {
            System.out.println("Largura fora do intervalo permitido.");
        }
    }
}
