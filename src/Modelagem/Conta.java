package Modelagem;

import java.math.BigDecimal;

public abstract class Conta {

    private String numero;

       private BigDecimal saldo;

    private Pessoa pessoa;

    public Conta(String numero, BigDecimal saldo, Pessoa pessoa) {
        this.numero = numero;
        this.saldo = saldo;
        this.pessoa = pessoa;
    }

    public Conta(String numero, BigDecimal saldo) {
        this.numero = numero;
        this.saldo = saldo;
         }

    protected void adicionarDinheiro(BigDecimal valor) {
        this.saldo = saldo.add(valor);

    }

    public abstract void depositar(BigDecimal valor);

    public BigDecimal investir(BigDecimal valor, BigDecimal taxa){
        this.saldo = saldo.subtract(valor);
        return valor;
    }

    public void sacar(BigDecimal valor){
        if (this.saldo.compareTo(valor) == 1) {
            this.saldo = saldo.subtract(valor);
        }
        else{
        System.out.println("Saldo insuficiente");
        }
    }
    public void transferir(BigDecimal valor){
        if (this.saldo.compareTo(valor) == 1) {
            this.saldo = saldo.subtract(valor);
        }
        else{
            System.out.println("Saldo insuficiente");
        }

    }


    public void consultarSaldo(){
            this.getSaldo();

    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
