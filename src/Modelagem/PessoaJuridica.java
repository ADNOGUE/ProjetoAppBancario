package Modelagem;

import java.math.BigDecimal;

public class PessoaJuridica extends Pessoa {

    private final BigDecimal TX_SAQUETRANSF = BigDecimal.valueOf(1.005);
    private final BigDecimal TX_POUPANCA = BigDecimal.valueOf(0.00);
    private final BigDecimal TX_INVEST = BigDecimal.valueOf(1.035);
    private String cnpj;

    public PessoaJuridica(String nome, String endereco,String cnpj) throws ValidacaoException, CpfCnpjException {
        super(nome,endereco);
        this.setCnpj(cnpj);
    }

    public void setCnpj(String cnpj) throws CpfCnpjException {

        if (!isCnpj(cnpj)) {
            throw new CpfCnpjException("CPF/CNPJ invalido");
        }
    }

    public static boolean isCnpj(String cnpj) {
        if (cnpj.equals("00000000000") || cnpj.equals("11111111111") ||
                cnpj.equals("22222222222") || cnpj.equals("33333333333") ||
                cnpj.equals("44444444444") || cnpj.equals("55555555555") ||
                cnpj.equals("66666666666") || cnpj.equals("77777777777") ||
                cnpj.equals("88888888888") || cnpj.equals("99999999999") ||
                (cnpj.length() != 14)) {
            return (false);
        } else {
            return (true);
        }
    }

    @Override
    public BigDecimal getTaxaSaqueTransf() { return TX_SAQUETRANSF; }

    @Override
    public BigDecimal getTaxaPoupanca() { return TX_POUPANCA; }
    @Override
    public BigDecimal getTaxaInvestimento() {
        return TX_INVEST;
    }
}
