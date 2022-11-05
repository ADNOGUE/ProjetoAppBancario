package Modelagem;

import java.math.BigDecimal;

public class ContaCorrente extends Conta{

     private BigDecimal saldo;

    public ContaCorrente(String numero, BigDecimal saldo, Pessoa pessoa) {
        super(numero, saldo, pessoa);
    }

    public ContaCorrente(String numero, BigDecimal saldo) {
        super(numero, saldo);
    }

    @Override
    public void depositar(BigDecimal valor) {
        super.adicionarDinheiro(valor);
    }






}
