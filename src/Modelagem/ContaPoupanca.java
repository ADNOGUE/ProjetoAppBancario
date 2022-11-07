package Modelagem;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(long numconta, BigDecimal saldo, Pessoa pessoa) {
        super(numconta,saldo, pessoa);
    }


    public void depositar(BigDecimal valor) {
        BigDecimal valorDepositado =
                valor.multiply(BigDecimal.valueOf(1.01));

        super.adicionarDinheiro(valorDepositado);
    }
}
