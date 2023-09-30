package br.org.senai.ava.modulo02.semana02.exercicio04;

public class Fatura {
    private String numero;
    private String descricao;
    private Integer quantidadeComprada;
    private Double precoPorItem;

    public Fatura() {}

    public Fatura(String numero, String descricao, Integer quantidadeComprada, Double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        if (quantidadeComprada >= 0) {
            this.quantidadeComprada = quantidadeComprada;
        } else {
            this.quantidadeComprada = 0;
        }
        if (precoPorItem >= 0) {
            this.precoPorItem = precoPorItem;
        } else {
            this.precoPorItem = 0.0;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(Integer quantidadeComprada) {
        if (quantidadeComprada >= 0) {
            this.quantidadeComprada = quantidadeComprada;
        } else {
            this.quantidadeComprada = 0;
        }
    }

    public Double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(Double precoPorItem) {
        if (precoPorItem >= 0) {
            this.precoPorItem = precoPorItem;
        } else {
            this.precoPorItem = 0.0;
        }

    }

    public Double getValorFatura() {
        Double valorFatura = quantidadeComprada * precoPorItem;
        return valorFatura;
    }
}
