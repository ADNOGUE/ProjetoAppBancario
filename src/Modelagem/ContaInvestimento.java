package Modelagem;

import java.math.BigDecimal;

public class ContaInvestimento extends Conta{

    public ContaInvestimento(long numconta,BigDecimal saldo, Pessoa pessoa) {
        super(numconta,saldo, pessoa);
    }

    BigDecimal taxa;
    @Override
    public void depositar(BigDecimal valor) {
        try {
            BigDecimal valorDepositado = valor.multiply(pessoa.getTaxaInvestimento());

            super.adicionarDinheiro(valorDepositado);
        }
        catch (ValoresException e){
            System.out.println(e.getMessage());
        }
    }
}
