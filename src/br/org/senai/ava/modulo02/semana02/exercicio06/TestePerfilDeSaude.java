package br.org.senai.ava.modulo02.semana02.exercicio06;

import java.time.LocalDate;
import java.util.Scanner;

public class TestePerfilDeSaude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Informe os dados da pessoa: ");
        System.out.println( "Nome: ");
        String nome = sc.nextLine();
        System.out.println( "Sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.println(" Sexo (M/F): ");
        char sexo = sc.next().charAt(0);
        System.out.println();


        System.out.println("Data de Nascimento (AAAA-MM-DD): ");
        sc.nextLine();
        String dataNascimentoStr = sc.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);


        System.out.println( "Altura em metros: ");
        Float altura = sc.nextFloat();
        System.out.println( "Peso em quilogramas: ");
        Float peso = sc.nextFloat();

        PerfilDeSaude perfilDeSaude = new PerfilDeSaude(nome, sobrenome, sexo, dataNascimento, altura, peso);
        Float frequenciaCardiaca = perfilDeSaude.calcularFrequenciaCardiacaMax();
        String frequenciaAlvo = perfilDeSaude.calcularFrequenciaCardiacaAlvo();

        System.out.println("\n-----------------------------------------------------------------------------");
        System.out.println("\nInformações do Perfil de Saúde:");
        System.out.println(" Nome: " + perfilDeSaude.getNome() + " " + perfilDeSaude.getSobrenome());
        System.out.println( " Sexo: " + perfilDeSaude.getSexo());
        System.out.println( " Data de Nascimento: " + perfilDeSaude.getDataDeNascimento());
        System.out.println( " Altura: " + perfilDeSaude.getAltura());
        System.out.println( " Peso: " + perfilDeSaude.getPeso());
        System.out.println( " IMC: " + perfilDeSaude.calcularImc());
        System.out.println( " Frequencia Cardiaca Máxima: " + frequenciaCardiaca);
        System.out.println( " Frequencia Cardiaca Alvo: " + frequenciaAlvo);


        sc.close();
    }

}
