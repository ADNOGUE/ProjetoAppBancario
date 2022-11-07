package Modelagem;

import java.math.BigDecimal;

public abstract class Conta {

    private long numconta;
    private BigDecimal saldo;
    Pessoa pessoa;

    public Conta(long numconta, BigDecimal saldo, Pessoa pessoa) {
        this.numconta = numconta;
        this.saldo = saldo;
        this.pessoa = pessoa;
    }



    protected void adicionarDinheiro(BigDecimal valor) {
        this.saldo = saldo.add(valor);
    }

    @Override
    public String toString() {
        String sb = "Dados da Conta: \n" + "numero=" + numconta + '\n' +
                "saldo=" + saldo +
                '\n';
        return sb;
    }

    public void sacar(BigDecimal valor){
        if (this.saldo.compareTo(valor) != -1) {
            if (pessoa instanceof PessoaJuridica){
                BigDecimal valorsacado = valor.multiply(BigDecimal.valueOf(0.005)).add(valor);
                this.saldo = saldo.subtract(valorsacado);
            }else {
                this.saldo = saldo.subtract(valor);
            }
            System.out.println("Saque realizado com Sucesso!!");
            System.out.printf("Valor sacado: R$%.2f\n",valor);
            consultarSaldo();}
        else{
        System.out.println("Saldo insuficiente");
        }
    }

    public abstract void depositar(BigDecimal valor);

    public void transferir(BigDecimal valor){
        if (this.saldo.compareTo(valor) != -1) {
            if (pessoa instanceof PessoaJuridica){
                BigDecimal valorsacado = valor.multiply(BigDecimal.valueOf(0.005)).add(valor);
                this.saldo = saldo.subtract(valorsacado);
            }else {
                this.saldo = saldo.subtract(valor);
            }
            System.out.println("Transferência realizada com Sucesso!!");
            System.out.printf("Valor transferido: R$%.2f\n",valor);
            consultarSaldo();
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void investir(BigDecimal valor){
        if (this.saldo.compareTo(valor) != -1) {
            this.saldo = saldo.subtract(valor);
        }
        System.out.println("Investimento realizado com Sucesso!!");
        System.out.printf("Valor investido: R$%.2f\n",valor);
        consultarSaldo();
    }

    public void consultarSaldo() {
        System.out.printf("\nO Saldo de sua conta é de R$%.2f\n", saldo);
    }
}
