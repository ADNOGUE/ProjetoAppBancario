package Modelagem;

import java.math.BigDecimal;

public class PessoaFisica extends Pessoa {

    private final BigDecimal TX_SAQUETRANSF = BigDecimal.valueOf(1.00);
    private final BigDecimal TX_POUPANCA = BigDecimal.valueOf(1.01);
    private final BigDecimal TX_INVEST = BigDecimal.valueOf(1.015);
    private String cpf;
    private String sexo;

    public PessoaFisica(String nome, String sexo, String endereco,String cpf) throws CpfCnpjException, ValidacaoException {
        super(nome,endereco);
        this.setSexo(sexo);
        this.setCpf(cpf);
    }

    public void setSexo(String sexo) throws ValidacaoException {
        if (!sexo.equals("F") &&
                !sexo.equals("M")){
            throw new ValidacaoException("Campo Sexo deve ser F ou M!");
        }
    }

    public void setCpf(String cpf) throws CpfCnpjException {
        if (!isCpf(cpf)) {
            throw new CpfCnpjException("CPF/CNPJ invalido");
        }
    }

    public static boolean isCpf(String cpf) {
        if (cpf.equals("00000000000") || cpf.equals("11111111111") ||
                cpf.equals("22222222222") || cpf.equals("33333333333") ||
                cpf.equals("44444444444") || cpf.equals("55555555555") ||
                cpf.equals("66666666666") || cpf.equals("77777777777") ||
                cpf.equals("88888888888") || cpf.equals("99999999999") ||
                (cpf.length() !=11)) {
            return (false);
        }
        else {
            return (true);
        }
    }

    @Override
    public BigDecimal getTaxaSaqueTransf() { return TX_SAQUETRANSF; }

    @Override
    public BigDecimal getTaxaPoupanca() {
        return TX_POUPANCA;
    }

    @Override
    public BigDecimal getTaxaInvestimento() {
        return TX_INVEST;
    }
}
