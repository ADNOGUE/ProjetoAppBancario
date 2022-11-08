package Modelagem;

import java.math.BigDecimal;

public class ContaCorrente extends Conta{

    public ContaCorrente(long numconta,BigDecimal saldo, Pessoa pessoa) {
        super(numconta,saldo, pessoa);
    }

    @Override
    public void investir(BigDecimal valor) {
        try {
            super.adicionarDinheiro(valor);
        }
        catch (ValoresException e){
            System.out.println(e.getMessage());
        }
    }






}
