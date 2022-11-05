package Modelagem;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String nome, String sexo, String endereco,String cpf) {
        super(nome,sexo,endereco);
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, String endereco,String cpf) {
        super(nome,endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (isCpf(cpf)) {
            this.cpf = cpf;
        }
    }

    public static boolean isCpf(String cpf) {
        if (cpf.equals("00000000000000") || cpf.equals("11111111111111") ||
            cpf.equals("22222222222222") || cpf.equals("33333333333333") ||
            cpf.equals("44444444444444") || cpf.equals("55555555555555") ||
            cpf.equals("66666666666666") || cpf.equals("77777777777777") ||
            cpf.equals("88888888888888") || cpf.equals("99999999999999") ||
            (cpf.length() != 11)) {
            return (false);
        } else {
            return (true);
        }
    }
}
