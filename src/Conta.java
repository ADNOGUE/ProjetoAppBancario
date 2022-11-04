import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Conta {

    String titular;
    String tipoPessoa;
    Integer tipoConta;
    Integer numeroDaConta;
    BigDecimal saldoCC;
    BigDecimal saldoCP;
    BigDecimal saldoCI;

    public Conta(String titular, String tipoPessoa, Integer tipoConta, Integer numeroDaConta) {

        this.setTitular(titular);
        this.setTipoPessoa(tipoPessoa);
        this.setTipoConta(tipoConta);
        this.setNumeroDaConta(numeroDaConta);
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        if (tipoPessoa.equals("PF") || tipoPessoa.equals("PJ")) {
            this.tipoPessoa = tipoPessoa;
        } else {
            System.out.println("Tipo de pessoa invalido");
            //        break;
        }

    }

    public Integer getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(Integer tipoConta) {

        if (tipoPessoa == "PJ") {
            if (tipoConta.equals(1) || tipoConta.equals(2)) {
                this.tipoConta = tipoConta;
            } else {
                System.out.println("tipo de conta invalida");
                //            break;
            }
        } else {
            if (tipoConta.equals(1) || tipoConta.equals(2) || tipoConta.equals(3)) {
                this.tipoConta = tipoConta;
            } else {
                System.out.println("tipo de conta invalida");
                //                break;
            }
        }
    }


    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public BigDecimal getSaldoCC() {
        return saldoCC;
    }

    public void setSaldoCC(BigDecimal saldoCC) {
        this.saldoCC = saldoCC;
    }

    public BigDecimal getSaldoCP() {
        return saldoCP;
    }

    public void setSaldoCP(BigDecimal saldoCP) {
        this.saldoCP = saldoCP;
    }

    public BigDecimal getSaldoCI() {
        return saldoCI;
    }

    public void setSaldoCI(BigDecimal saldoCI) {
        this.saldoCI = saldoCI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(titular, conta.titular) && Objects.equals(tipoPessoa, conta.tipoPessoa) && Objects.equals(tipoConta, conta.tipoConta) && Objects.equals(numeroDaConta, conta.numeroDaConta) && Objects.equals(saldoCC, conta.saldoCC) && Objects.equals(saldoCP, conta.saldoCP) && Objects.equals(saldoCI, conta.saldoCI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titular, tipoPessoa, tipoConta, numeroDaConta, saldoCC, saldoCP, saldoCI);
    }
}