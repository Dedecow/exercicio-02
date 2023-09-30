package br.org.senai.ava.modulo02.semana02.exercicio03;

public class testeDeMetodos {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(3.0f, 5.0f);
        System.out.println("Comprimento " + retangulo.getComprimento());
        System.out.println("Largura " + retangulo.getLargura());

        retangulo.setComprimento(5.5f);
        retangulo.setLargura(3.2f);
        System.out.println("Comprimento2 " + retangulo.getComprimento());
        System.out.println("Largura2 " + retangulo.getLargura());

        System.out.println("Area do retângulo " + retangulo.area());
        System.out.println("Perimetro do retângulo " + retangulo.perimetro());

       // retangulo.setComprimento(25f);
       // retangulo.setLargura(-1f);


    }
}
