import java.math.BigDecimal;
import java.util.Objects;

public class Conta {

    String titular;
    String tipoPessoa;

    Integer tipoConta;
    Integer numeroDaConta;
    BigDecimal saldo;

    public Conta (String titular, String tipoPessoa, Integer tipoConta , Integer numeroDaConta, BigDecimal saldo){
      this.setTitular(titular);
      this.setTipoPessoa(tipoPessoa);
      this.setTipoConta(tipoConta);
      this.setNumeroDaConta(numeroDaConta);
      this.setSaldo(saldo);
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
        if (tipoPessoa == "PF"  || tipoPessoa =="PJ") {
            this.tipoPessoa = tipoPessoa;
        }
        else{
               System.out.println("Tipo de pessoa invalido");
    //        break;
             }

        }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(Integer tipoConta) {

        if (tipoPessoa == "PJ") {
            if (tipoConta ==  1  || tipoConta ==  2 ) {
                this.tipoConta = tipoConta;
            } else {
                System.out.println("tipo de conta invalida");
    //            break;
            }
        }
        else{
            if (tipoConta ==  1  || tipoConta ==  2  || tipoConta ==  3 ) {
                this.tipoConta = tipoConta;
            }
            else{
                    System.out.println("tipo de conta invalida");
    //                break;
                }

        }

    }


    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return tipoConta == conta.tipoConta && numeroDaConta == conta.numeroDaConta && Objects.equals(titular, conta.titular) && Objects.equals(tipoPessoa, conta.tipoPessoa) && Objects.equals(saldo, conta.saldo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titular, tipoPessoa, tipoConta, numeroDaConta, saldo);
    }
}