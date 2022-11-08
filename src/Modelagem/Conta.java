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

    protected void adicionarDinheiro(BigDecimal valor) throws ValoresException{
        if(valor.compareTo(BigDecimal.ZERO) <= 0 ){
            throw new ValoresException("Valor nao permitido!");
        }
        this.saldo = saldo.add(valor);
        System.out.println("Deposito realizado com Sucesso!!");
        System.out.printf("Valor depositado: R$%.2f\n",valor);
        consultarSaldo();

    }

    @Override
    public String toString() {
        return "Dados da Conta: \n" + "Número da Conta = " + numconta + '\n' +
                "Saldo Atual = " + saldo + '\n';
    }

    public void sacar(BigDecimal valor) throws ValoresException {
        if (valor.compareTo(BigDecimal.ZERO) <= 0){
            throw new ValoresException("Valor nao permitido!");
        }
        if (this.saldo.compareTo(valor) < 0) {
            throw new ValoresException("Saldo Insuficiente!");
        }
        if (pessoa instanceof PessoaJuridica){
            BigDecimal valorsacado = valor.multiply(pessoa.getTaxaSaqueTransf());
            this.saldo = saldo.subtract(valorsacado);
        }else {
            this.saldo = saldo.subtract(valor);
        }
        System.out.println("Saque realizado com Sucesso!!");
        System.out.printf("Valor sacado: R$%.2f\n",valor);
        consultarSaldo();
    }

    public void transferir(BigDecimal valor) throws ValoresException {
        if (valor.compareTo(BigDecimal.ZERO) <= 0){
            throw new ValoresException("Valor nao permitido!");
        }
        if (this.saldo.compareTo(valor) < 0) {
            throw new ValoresException("Saldo Insuficiente!");
        }

        if (pessoa instanceof PessoaJuridica){
            BigDecimal valorsacado = valor.multiply(pessoa.getTaxaSaqueTransf());
            this.saldo = saldo.subtract(valorsacado);
        }else {
            this.saldo = saldo.subtract(valor);
        }
        System.out.println("Transferência realizada com Sucesso!!");
        System.out.printf("Valor transferido: R$%.2f\n",valor);
        consultarSaldo();
     }

    public void investir(BigDecimal valor) throws ValoresException {
        if (valor.compareTo(BigDecimal.ZERO) <= 0){
            throw new ValoresException("Valor nao permitido!");
        }
        if (this.saldo.compareTo(valor) < 0) {
            throw new ValoresException("Saldo Insuficiente!");
        }

        this.saldo = saldo.subtract(valor);

        System.out.println("Investimento realizado com Sucesso!!");
        System.out.printf("Valor investido: R$%.2f\n",valor);
        consultarSaldo();
    }

    public void consultarSaldo() {
        System.out.printf("\nO Saldo de sua conta é de R$%.2f\n", saldo);
    }

    public abstract void depositar(BigDecimal deposito);
}
