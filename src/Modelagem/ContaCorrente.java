package Modelagem;

import java.math.BigDecimal;

public class ContaCorrente extends Conta{

    private BigDecimal saldo;

    public ContaCorrente(String numero, String tipoConta, BigDecimal saldo, Pessoa pessoa) {
        super(numero, tipoConta, saldo, pessoa);
    }


    public void depositar(BigDecimal valor, BigDecimal taxa) {
        this.saldo = super.investir(valor, taxa);
    }

}
