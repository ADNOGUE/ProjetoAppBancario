package Modelagem;

import java.math.BigDecimal;

public class ContaInvestimento extends Conta{


    private BigDecimal saldo;
    public ContaInvestimento(String numero, BigDecimal saldo, Pessoa pessoa) {
        super(numero, saldo, pessoa);
    }

    public ContaInvestimento(String numero, BigDecimal saldo) {
        super(numero, saldo);
    }

    @Override
    public void depositar(BigDecimal valor) {

       // if (tipoPessoa = PF) {
            BigDecimal valorDepositado =
                    valor.multiply(BigDecimal.valueOf(1.015));
       // }
       // else (tipoPessoa = PJ){
       //     public BigDecimal valorDepositado =
       //             valor.multiply(BigDecimal.valueOf(1.035));
       // }
        super.adicionarDinheiro(valorDepositado);
    }
}
