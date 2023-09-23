public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
public class PessoaFisica {
    private String nome;
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        setCPF(cpf); // Chamando o setter para validação do CPF
        this.nome = nome;
    }

    public void setCPF(String cpf) {
        if (validarCPF(cpf)) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido");
        }
    }

    public boolean validarCPF(String cpf) {
        return true; // Substitua por sua lógica de validação real
    }

}

