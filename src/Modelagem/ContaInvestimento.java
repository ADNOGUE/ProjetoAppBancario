package Modelagem;

import java.math.BigDecimal;

public class ContaInvestimento extends Conta{

    public ContaInvestimento(int numconta,BigDecimal saldo, Pessoa pessoa) {
        super(numconta,saldo, pessoa);
    }

    public ContaInvestimento(int numconta,BigDecimal saldo) {
        super(numconta,saldo);
    }

    @Override
    public void depositar(BigDecimal valor) {

       // if (tipoPessoa = PF) {
        BigDecimal valorDepositado = valor.multiply(BigDecimal.valueOf(1.015));
       // }
       // else (tipoPessoa = PJ){
       //     public BigDecimal valorDepositado =
       //             valor.multiply(BigDecimal.valueOf(1.035));
       // }
        super.adicionarDinheiro(valorDepositado);
    }
}
