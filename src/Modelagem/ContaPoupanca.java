package Modelagem;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(long numconta, BigDecimal saldo, Pessoa pessoa) {
        super(numconta,saldo, pessoa);
    }


    public void depositar(BigDecimal valor) {
        try {
            BigDecimal valorDepositado =
                    valor.multiply(pessoa.getTaxa());

            super.adicionarDinheiro(valorDepositado);
        }
        catch (ValidacaoException e){
            System.out.println(e.getMessage());
        }

    }
}
