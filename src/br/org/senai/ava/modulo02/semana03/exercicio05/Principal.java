package br.org.senai.ava.modulo02.semana03.exercicio05;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        String arquivo = "C:\\Users\\Andre\\OneDrive\\Documentos\\ex05\\megasena.txt";
        ArrayList<Concurso> concursos = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(arquivo));
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");

                Integer numero = Integer.parseInt(dados[0]);
                int[] sorteados = new int[6];
                for (int i = 0; i < 6; i++) {
                    sorteados[i] = Integer.parseInt(dados[i + 1]);
                }

                Concurso concurso = new Concurso(numero, sorteados);
                concursos.add(concurso);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Concurso concurso : concursos) {
            System.out.println(concurso);
        }
    }
}
