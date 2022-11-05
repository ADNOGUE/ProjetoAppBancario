import java.math.BigDecimal;
import java.util.Objects;
import java.util.Scanner;

public class AbrirConta {

    Scanner scanner;
    public void realizarOperacao(int numConta){

        this.scanner = new Scanner(System.in);
        System.out.println("Vamos abrir a sua conta!");
        System.out.println("Informe o nome do Titular");
        String nome = this.scanner.next();
        System.out.println("Informe o PF para pessoa fisica e PJ para pessoa Juridica");
        String tipoPessoa = this.scanner.next();
        System.out.println("Informe o tipo da conta: \n 1 - conta corrente, 2 - conta poupança e 3 - conta investimento");
        int tipoConta = this.scanner.nextInt();


        Conta conta1 = new Conta(nome, tipoPessoa, tipoConta, numConta);

        System.out.println("AbrirConta.Conta aberta com sucesso, seu novo numero de conta é: " +numConta);


    }

    public static class Conta {

        private  String titular;
        private String tipoPessoa;
        private Integer tipoConta;
        private Integer numeroDaConta;
        private BigDecimal saldoCC;
        private BigDecimal saldoCP;
        private BigDecimal saldoCI;

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

     //   public static void sacar(BigDecimal saque) {
     //       if (this.saldoCC < saque) {
     //           System.out.println("Saldo insuficiente");
      //      }
      //       else{this.saldoCC -= saque;
     //           }
     //      }

    //    public static void depositar(BigDecimal deposito) {
      //           this.saldoCC += deposito;
      //          }

    }
}
