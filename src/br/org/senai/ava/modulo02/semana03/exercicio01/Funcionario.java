package br.org.senai.ava.modulo02.semana03.exercicio01;

public class Funcionario {
    private Long cpf;
    private String nomeCompleto;
    private Float salario;

    public Long getCpf() {
        return cpf;
    }
    public Funcionario () { };

    public Funcionario(Long cpf, String nomeCompleto, Float salario) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.salario = salario;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        if (salario >= 0) {
            this.salario = salario;
        }else {
            System.out.println(" Salario precisa ser um número positivo ou zero");
        }
    }
    public void promover (Float percentual){
        this.salario *= (1 + percentual/100);
    }


}
