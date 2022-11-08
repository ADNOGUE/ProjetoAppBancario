package Modelagem;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(long numconta, BigDecimal saldo, Pessoa pessoa) {
        super(numconta,saldo, pessoa);
    }


    public void depositar(BigDecimal valor) {
        try {
            BigDecimal valorDepositado =
                    valor.multiply(pessoa.getTaxaPoupanca());

            super.adicionarDinheiro(valorDepositado);
        }
        catch (ValoresException e){
            System.out.println(e.getMessage());
        }

    }
}
