package Modelagem;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numconta, BigDecimal saldo, Pessoa pessoa) {
        super(numconta,saldo, pessoa);
    }

    public ContaPoupanca(int numconta, BigDecimal saldo) {
        super(numconta,saldo);
    }

    public void depositar(BigDecimal valor) {
        BigDecimal valorDepositado =
                valor.multiply(BigDecimal.valueOf(1.01));

        super.adicionarDinheiro(valorDepositado);
    }
}
