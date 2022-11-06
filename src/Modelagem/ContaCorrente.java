package Modelagem;

import java.math.BigDecimal;

public class ContaCorrente extends Conta{

    public ContaCorrente(int numconta,BigDecimal saldo, Pessoa pessoa) {
        super(numconta,saldo, pessoa);
    }

    public ContaCorrente(int numconta, BigDecimal saldo) {
        super(numconta,saldo);
    }


    @Override
    public void depositar(BigDecimal valor) {
        super.adicionarDinheiro(valor);
    }






}
