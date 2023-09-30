package br.org.senai.ava.modulo02.semana02.exercicio04;

public class TestaFatura {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("12345", "Produto A", 5, 10.0);

        System.out.println("Número da Fatura: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade Comprada: " + fatura.getQuantidadeComprada());
        System.out.println("Preço por Item: " + fatura.getPrecoPorItem());


        Double valorFatura = fatura.getValorFatura();
        System.out.println("Valor da Fatura: " + valorFatura);
    }
}
