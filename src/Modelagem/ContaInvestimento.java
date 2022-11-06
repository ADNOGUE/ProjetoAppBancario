package Modelagem;

import java.math.BigDecimal;

public class ContaInvestimento extends Conta{

    public ContaInvestimento(int numconta,BigDecimal saldo, Pessoa pessoa) {
        super(numconta,saldo, pessoa);
    }

    BigDecimal taxa;
    @Override
    public void depositar(BigDecimal valor) {

        if (pessoa instanceof PessoaFisica) {
           taxa = BigDecimal.valueOf(1.015);
        }
        else{
                if (pessoa instanceof PessoaJuridica) {
                    taxa = BigDecimal.valueOf(1.035);
                }
            };

        BigDecimal valorDepositado = valor.multiply(taxa);

        super.adicionarDinheiro(valorDepositado);
    }
}
