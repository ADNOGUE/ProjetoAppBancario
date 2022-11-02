import java.math.BigDecimal;

public class Conta {

    String titular;
    String cpf;
    String numeroDaConta;
    BigDecimal saldo;

    private Conta (String titular, String cpf, String numeroDaConta, BigDecimal saldo){
      this.titular(titular);
      this.cpf(cpf);
      this.numeroDaConta(numeroDaConta);
      this.saldo(saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
