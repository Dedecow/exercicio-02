package br.org.senai.ava.modulo02.semana04.exercicio03;

public class Produto implements Tributavel{
    private String nome;
    private double valor;
    private double aliquotaICMS;

    public Produto ( ){ };

    public Produto(String nome, double valor, double aliquotaICMS) {
        this.nome = nome;
        this.valor = valor;
        this.aliquotaICMS = aliquotaICMS;
    }
    @Override
    public double calcularValorImposto(){
        double valorICMS = valor * (aliquotaICMS/100);
        return valor + valorICMS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getAliquotaICMS() {
        return aliquotaICMS;
    }

    public void setAliquotaICMS(double aliquotaICMS) {
        this.aliquotaICMS = aliquotaICMS;
    }
    public String toString(){
        return "Produto: " + nome + ", Valor: R$" + valor + ", Aliquota ICMS: " + (aliquotaICMS) + "%";
    }
}
