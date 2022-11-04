package Modelagem;

import java.math.BigDecimal;

public class Conta {

    private String numero;
    private BigDecimal saldo;

    private Pessoa pessoa;


    //System.currentTimeMillis();

    protected void adicionarDinheiro(BigDecimal valor) {
        this.saldo += valor;
    }


    protected abstract void depositar();
    public void sacar();
    public void transferir();
}
