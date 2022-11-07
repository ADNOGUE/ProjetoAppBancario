package Modelagem;

import java.math.BigDecimal;

public class PessoaJuridica extends Pessoa {

    private final BigDecimal TX_INVEST = BigDecimal.valueOf(3.5);
    private String cnpj;

    public PessoaJuridica(String nome, String endereco,String cnpj) {
        super(nome,endereco);
        this.setCnpj(cnpj);
    }

    public void setCnpj(String cnpj) {

        if (isCnpj(cnpj)) {
            this.cnpj = cnpj;
        }
        else {
            System.out.println("CNPJ inválido!");
            System.exit(0);
        }
    }

    public static boolean isCnpj(String cnpj) {
        if (cnpj.equals("00000000000000") || cnpj.equals("11111111111111") ||
                cnpj.equals("22222222222222") || cnpj.equals("33333333333333") ||
                cnpj.equals("44444444444444") || cnpj.equals("55555555555555") ||
                cnpj.equals("66666666666666") || cnpj.equals("77777777777777") ||
                cnpj.equals("88888888888888") || cnpj.equals("99999999999999") ||
                (cnpj.length() != 14)) {
            return (false);
        } else {
            return (true);
        }
    }

    @Override
    public BigDecimal getTaxa() {
        return TX_INVEST;
    }
}
