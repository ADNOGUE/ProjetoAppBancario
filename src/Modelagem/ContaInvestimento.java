package Modelagem;

import java.math.BigDecimal;

public class ContaInvestimento extends Conta{

    public ContaInvestimento(String numero, String tipoConta, BigDecimal saldo, Pessoa pessoa) {
        super(numero, tipoConta, saldo, pessoa);
    }
}
