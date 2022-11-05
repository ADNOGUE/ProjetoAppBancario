package Modelagem;

import java.math.BigDecimal;

public abstract class Conta {

    private String numero;

    private String tipoConta;
    private BigDecimal saldo;

    private Pessoa pessoa;

    public Conta(String numero, String tipoConta, BigDecimal saldo, Pessoa pessoa) {
        this.numero = numero;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.pessoa = pessoa;
    }

    protected void adicionarDinheiro(BigDecimal valor) {
        this.saldo = saldo.add(valor);

    }

    public abstract void depositar();

    public  void investir(BigDecimal valor, BigDecimal taxa){
        this.saldo = saldo.subtract(valor);
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
        this.saldo = saldo.subtract(valor);

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
