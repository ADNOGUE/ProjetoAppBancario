package Modelagem;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(String numero, String tipoConta, BigDecimal saldo, Pessoa pessoa) {
        super(numero, tipoConta, saldo, pessoa);
    }
}
