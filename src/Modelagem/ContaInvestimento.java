package Modelagem;

import java.math.BigDecimal;
import java.util.Locale;

public class ContaInvestimento extends Conta{

    public ContaInvestimento(int numconta,BigDecimal saldo, Pessoa pessoa) {
        super(numconta,saldo, pessoa);
    }

    public ContaInvestimento(int numconta,BigDecimal saldo) {
        super(numconta,saldo);
    }

    @Override
    public void depositar(BigDecimal valor) {
        super.adicionarDinheiro(valor);
    }
}
