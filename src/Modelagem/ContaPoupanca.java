package Modelagem;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta{

    private BigDecimal saldo;

    public ContaPoupanca(String numero,  BigDecimal saldo, Pessoa pessoa) {
        super(numero, saldo, pessoa);
    }

    public ContaPoupanca(String numero,  BigDecimal saldo) {
        super(numero, saldo);
    }

    public void depositar(BigDecimal valor) {
        BigDecimal valorDepositado =
                valor.multiply(BigDecimal.valueOf(1.01));

        super.adicionarDinheiro(valorDepositado);
    }
}
