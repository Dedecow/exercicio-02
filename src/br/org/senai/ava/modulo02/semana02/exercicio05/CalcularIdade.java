package br.org.senai.ava.modulo02.semana02.exercicio05;
import java.time.LocalDate;
import java.time.Period;

public class CalcularIdade {
    public static int calcularIdade(LocalDate dataNascimento){
        LocalDate dataAtual = LocalDate.now();
        int anoNascimento = dataNascimento.getYear();
        int mesNascimento = dataNascimento.getMonthValue();
        int diaNascimento = dataNascimento.getDayOfMonth();

        int anoAtual = dataAtual.getYear();
        int mesAtual = dataAtual.getMonthValue();
        int diaAtual = dataAtual.getDayOfMonth();

        int idade = anoAtual - anoNascimento;

        if (mesAtual < mesNascimento || ( (mesAtual == mesNascimento) && (diaAtual < diaNascimento))){
            idade--;
        }
        return idade;
    }

}
