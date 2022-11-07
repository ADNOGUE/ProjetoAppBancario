package Modelagem;

import java.math.BigDecimal;

public class ContaCorrente extends Conta{

    public ContaCorrente(long numconta,BigDecimal saldo, Pessoa pessoa) {
        super(numconta,saldo, pessoa);
    }



    @Override
    public void depositar(BigDecimal valor) {
        try {
            super.adicionarDinheiro(valor);
        }
        catch (ValidacaoException e){
            System.out.println(e.getMessage());
        }
    }






}
