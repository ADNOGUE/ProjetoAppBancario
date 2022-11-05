import Modelagem.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

        int tipoConta;
        int operacao;
     //   String numconta = new Timestamp(System.currentTimeMillis());
        String numconta = "1";
        Scanner a = new Scanner(System.in);

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("        BEM VINDO AO BANCO ITAU-LETSCODE      ");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Bom dia vamos abrir sua conta : ");
        System.out.println("Informe seu nome ");
        String nome = a.next();
        System.out.println("Informe seu sexo 'F' ou 'M' ");
        String sexo = a.next();
        System.out.println("Informe seu endereço: ");
        String endereco = a.next();
        System.out.println("Informe se a conta será de PF ou PJ");
        String tipoPessoa = a.next();


        if (tipoPessoa.equals("PF")) {
            System.out.println("Informe seu CPF");
            String cpf = a.next();
            Modelagem.Pessoa pessoa = new PessoaFisica(nome, sexo, endereco, cpf);
            System.out.println("Informe o tipo de conta que quer abrir");
            System.out.println("1-Conta Corrente, 2 - Conta Investimento, 3 - Conta Popupança");
            tipoConta = a.nextInt();

        } else {
            if (tipoPessoa.equals("PJ")) {
                System.out.println("Informe seu CNPJ");
                String cnpj = a.next();
                Modelagem.Pessoa pessoa = new PessoaFisica(nome, sexo, endereco, cnpj);
                System.out.println("Informe o tipo de conta que quer abrir");
                System.out.println("1-Conta Corrente, 2 - Conta Investimento");
                tipoConta = a.nextInt();
            }
        }

        System.out.println("Informe o saldo que irá iniciar sua conta ");
        BigDecimal saldo = a.nextBigDecimal();


        tipoConta = 1;

        switch (tipoConta) {
            case 1:
                Modelagem.Conta conta = new ContaCorrente(numconta,  saldo);
                break;
            case 2:
                Modelagem.Conta conta1 = new ContaInvestimento(numconta, saldo);
                break;
            case 3:
                Modelagem.Conta conta2 = new ContaInvestimento(numconta, saldo);
                break;
            default:
                System.out.println("OPÇÃO INVALIDA");
                break;
        }

        System.out.println("informe a operacao que deseja realizar");
        System.out.println("1-SACAR, 2-DEPOSITAR, 3-TRANSFERIR, 4-INVESTIR, 5-CONSULTAR SALDO, 6 - ENCERRAR");
        operacao = a.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Informe o valor do saque: ");
                BigDecimal saque = a.nextBigDecimal();
            //    conta.sacar(saque);
                break;
            case 2:
                System.out.println("Informe o valor do deposito: ");
                BigDecimal deposito = a.nextBigDecimal();
            //   conta.depositar(deposito)
                break;
            case 3:
                System.out.println("Informe o valor da transferencia: ");
                BigDecimal transferencia = a.nextBigDecimal();
                break;
            case 4:
                System.out.println("Informe o valor do investimento: ");
                BigDecimal investimento = a.nextBigDecimal();
                break;
            case 5:
                 break;
            case 6:
                break;
            default:
                System.out.println("OPÇÃO INVALIDA");
                break;
        }


    }
}
