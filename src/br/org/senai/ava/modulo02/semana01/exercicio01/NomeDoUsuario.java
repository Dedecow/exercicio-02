package br.org.senai.ava.modulo02.semana01.exercicio01;

import java.util.Objects;

public class NomeDoUsuario {
    private String nome;
    private String sobrenome;

    public NomeDoUsuario(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String nomeCompleto(){
        return nome+ " "+ sobrenome;
    }

    @Override
    public String toString() {
        return "NomeDoUsuario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NomeDoUsuario that)) return false;
        return getNome().equals(that.getNome()) && getSobrenome().equals(that.getSobrenome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getSobrenome());
    }
}
